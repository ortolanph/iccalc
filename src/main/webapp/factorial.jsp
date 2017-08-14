<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Fatorial</h2>
<p ng-if="status"><b>{{status}} - {{mensagem}}</b></p>
<form ng-submit="factorial()">
    <input type="text" ng-model="numero"/>&nbsp;
    <input type="submit" value="=" />&nbsp;{{resultado}}
</form>