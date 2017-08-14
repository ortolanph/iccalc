<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="calculadoraApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular-resource.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular-route.min.js"></script>
		<script src="resources/calculadora.js"></script>
		<style rel="stylesheet" type="text/css">
body {
	font-family: sans-serif;
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
}

li {
	padding: 5px;
	spacing: 5px;
	margin: 5px;
	border-radius: 10px;
	background-color: #EFEFEF;
    display: inline;
}

.excerpt {
	width: 70%;
	padding: 5px;
	spacing: 5px;
	margin:10px auto;
	border-radius: 10px;
	background-color: #EFEFEF;
	text-align: left;
	display: left;
}

#content {
 width: 100%;
 text-align: center;
 vertical-align: middle;
}
		</style>
    </head>
    <body>
		<div id="content">
		    <h1>Calculadora</h1>
			<ul>
				<li><a href="#soma">Soma</a></li>
				<li><a href="#subtracao">Subtração</a></li>
				<li><a href="#multiplicacao">Multiplicação</a></li>
				<li><a href="#divisao">Divisão</a></li>
				<li><a href="#factorial">Fatorial</a></li>
				<li><a href="#about">Sobre</a></li>
			</ul>
			<div class="excerpt" ng-view></div>
		</div>
    </body>
</html>
