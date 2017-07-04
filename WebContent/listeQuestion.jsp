<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta content="text/html; charset=ISO-8859-1" http-equiv="content-type" />
	<title>QCM ENI</title>
	<link media="all" rel="stylesheet" href="./theme/style.css" type="text/css" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<script href="./theme/script.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3 lienQuestion">
				<ul class="list-group">
				  <a href=""><li class="list-group-item">Question 1<span class="badge">Non répondu</span></li></a>
				  <a href=""><li class="list-group-item">Question 2<span class="badge">Favori</span></li></a>
				  <a href=""><li class="list-group-item">Question 3<span class="badge">Répondu</span></li></a>
				</ul>			
			</div>
			<div class="col-sm-6">
				<h1 class="formListQcm">Répondre aux questions</h1>
				<div class="row">
					<form>		
						<fieldset class="listeQuestion-border" id="">
							<legend class="listeQuestion-border">Question 1</legend>
							<div class="row">
								<div class="col-md-10 col-sm-9">
									Texte question
								</div>
								<div class="col-md-2 col-sm-3">
									<div class="checkbox">
									  <label><input type="checkbox" value="id">Favori</label>
									</div>
								</div>
							</div>
							<div class="checkbox">
							  <label><input type="checkbox" value="" name="question1"/>Texte Réponse</label>
							</div>	
							<div class="checkbox">
							  <label><input type="checkbox" value="" name="question1"/>Texte Réponse</label>
							</div>						
						</fieldset>				
					</form>
				</div>				
			</div>
			<div class="col-sm-3 tempsRestant">
				<div class="row">
					<div class="col-sm-12">
						<span class="chrono">
							<script language="JavaScript">
								TargetDate = Date.now()+$${qcm.chrono}*60000;
								BackColor = false;
								ForeColor = false;
								CountActive = true;
								CountStepper = -1;
								LeadingZero = true;
								DisplayFormat = "%%M%%:%%S%%";
								FinishMessage = "C'est fini !";
							</script>
							<script language="JavaScript" src="http://scripts.hashemian.com/js/countdown.js"></script>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
