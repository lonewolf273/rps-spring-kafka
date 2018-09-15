<!DOCTYPE html>
<#import "/spring.ftl" as spring />
<html>
	<head>
		<title>Home</title>
		<link rel="stylesheet" type="text/css" href="/css/appearances.css">
		<script src="/js/combat.js"></script>
		
	</head>
	<body>
		<h1 id="title">Rock, Paper, Scissors!</h1>
		<div>
			<img id="view" src="/img/rock-paper-scissors.png" height="350px">
			<h3 id="result"></h3>
		</div>
		<#include "/rps_choice.ftl">
	</body>

</html>