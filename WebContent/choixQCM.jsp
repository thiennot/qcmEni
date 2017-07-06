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
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<h1 class="formListQcm">Choisir un QCM</h1>
				<form action="AfficherQuestionsServlet">
				<c:forEach var="qcm" items="${listeQCM}">
					<div class="row formListQcm radio">
	 					<label><input type="radio" value="${qcm.id}" name="radioQCM">${qcm.libelle} (
	 					<c:forEach var="theme" items="${qcm.themes}">
	 						${theme.libelle}
	 					</c:forEach>
	 					)</label>		
					</div>
				</c:forEach>	
				<div class="row formListQcm">
					<button type="submit" class="btn btn-default">Débuter le test</button>
				</div>
				</form>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>
