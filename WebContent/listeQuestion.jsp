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
<link media="all" rel="stylesheet" href="./theme/style.css"
	type="text/css" />
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
crossorigin="anonymous">
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
crossorigin="anonymous">
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
crossorigin="anonymous"></script>
<script src="./theme/script.js"></script>
</head>
<body>
	<div class="container">
		<div class="row tout">
			<div class="col-sm-3">
				<ul class="list-group fixe">					
					<%int i = 1; %>
					<c:forEach var="question" items="${qcm.lesQuestions}">
						<a href="#question<%= i %>"><li class="list-group-item">Question <%= i %><span class="badge" id="etat<%= i %>">Non répondu</span></li></a>		
							<%i++; %>
					</c:forEach>
					
				</ul>
			</div>
			<div class="col-sm-6">
				<h1 class="formListQcm">Répondre aux questions</h1>
				<div class="row">
					<form action="CalculResultatServlet" method="post">
						<%int j = 1; %>
						<c:forEach var="question" items="${qcm.lesQuestions}">
							<fieldset class="listeQuestion-border"
								id="question<%= i %>">
								<legend class="listeQuestion-border">Question <%= j %></legend>
								<div class="row">
									<div class="col-md-10 col-sm-9">${question.nomQuestion }
									</div>
									<div class="col-md-2 col-sm-3">
										<div class="checkbox">
											<label><input type="checkbox" id="idFav<%= j %>"  onClick="favQuestion(<%= j %>)"
												value="${question.idQuestion }">Favori</label>
										</div>
									</div>
								</div>
								<c:forEach var="reponse" items="${question.propositions}">
									<div class="${question.balise }">
										<label><input type="${question.balise }" id="idQuestion<%= j %>" onClick="repondQuestion(<%= j %>);" value=""
											name="question${question.idQuestion }[]" />${reponse.libelle }</label>
									</div>
								</c:forEach>
							</fieldset>			
							<%j++; %>
						</c:forEach>
						<button type="submit" class="btn btn-success btn-block">Valider</button>
					</form>
				</div>
			</div>
			<div class="col-sm-3  chrono">
				<div class="row">
					<div class="col-sm-12">
						<span class="fixe"> <script language="JavaScript">
								TargetDate = Date.now()+${qcm.chrono}*60000;
								BackColor = false;
								ForeColor = false;
								CountActive = true;
								CountStepper = -1;
								LeadingZero = true;
								DisplayFormat = "%%M%%:%%S%%";
								FinishMessage = "C'est fini !";
							</script> <script language="JavaScript"
								src="./theme/countdown.js"></script>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
