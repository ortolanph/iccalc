<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div ng-init="carregar()">
    <h2><a href="{{about.url}}" target="_blank">{{about.title}}</a></h2>

    <p>Status: <b>{{about.status}}</b></p>

    <p>Veja o código fonte desta aplicação no <a href="https://github.com/ortolanph/iccalc" target="_blank">Github</a>.</p>

    <p>{{about.description}}</p>
</div>