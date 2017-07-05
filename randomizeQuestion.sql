USE [Projet]
GO
/****** Object:  UserDefinedFunction [dbo].[randomizeQuestion]    Script Date: 07/05/2017 09:00:16 ******/
SET ANSI_NULLS ON
GO
IF OBJECT_ID('dbo.Get_NewID') IS NOT NULL
BEGIN
	DROP VIEW Get_NewID
END
GO
CREATE VIEW Get_NewID
AS
SELECT NEWID() AS MyNewID
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER function [dbo].[randomizeQuestion](@idTest as int) 
returns @result table (
	 idQuestion int not null, 
	 enonce varchar(100) not null, 
	 media varchar(100) null, 
	 poids int not null,
	 [type] varchar(100) not null
)
as 
begin

	declare @loop_section as cursor;
	declare @loop_question as cursor;
	
	declare @nbQuestion as int;
	declare @idTheme as int;
	
	declare @idQuestion as int;
	declare @enonce as varchar(100);
	declare @media as varchar(100);
	declare @poids as int;
	declare @type as varchar(100);
	
	set @loop_section = cursor for
		select nbquestionsatirer, idTheme
		from section_test
		where idTest = @idTest
	
	open @loop_section
		fetch next from @loop_section into @nbQuestion, @idTheme
		
		while @@FETCH_STATUS = 0
		begin

			set @loop_question = cursor for 
				select top(@nbQuestion) q.idQuestion, q.enonce, q.media, q.poids, q.[type]
				FROM theme t, section_test s, question q
				where s.idtheme = t.idtheme
				and t.idtheme = q.idtheme
				and s.idtest = @idTest
				and s.idtheme = @idTheme
				ORDER BY (SELECT [MyNewId] FROM Get_NewID)
				
			open @loop_question
				fetch next from @loop_question into @idQuestion, @enonce, @media, @poids, @type
				
				while @@FETCH_STATUS = 0
				begin
					insert into @result values (@idQuestion, @enonce, @media, @poids, @type)
					fetch next from @loop_question into @idQuestion, @enonce, @media, @poids, @type
				end
			close @loop_question
			fetch next from @loop_section into @nbQuestion, @idTheme
		end
	
	close @loop_section
	
	return
end