<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Multiplicação</h2>
<form ng-submit="multiplicar()">
    <input type="text" ng-model="fator1"/>&nbsp;*&nbsp;
    <input type="text" ng-model="fator2"/>&nbsp;
    <input type="submit" value="=" />&nbsp;{{resultado}}
</form>