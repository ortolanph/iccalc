<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Divisão</h2>
<form ng-submit="dividir()">
    <input type="text" ng-model="dividendo"/>&nbsp;/&nbsp;
    <input type="text" ng-model="divisor"/>&nbsp;
    <input type="submit" value="=" />&nbsp;{{resultado}}
</form>