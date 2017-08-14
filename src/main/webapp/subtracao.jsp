<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Subtração</h2>
<p ng-if="status"><b>{{status}} - {{mensagem}}</b></p>
<form ng-submit="subtrair()">
    <input type="text" ng-model="parcela1"/>&nbsp;-&nbsp;
    <input type="text" ng-model="parcela2"/>&nbsp;
    <input type="submit" value="=" />&nbsp;{{resultado}}
</form>