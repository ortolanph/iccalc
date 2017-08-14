var calculadoraApp = angular.module("calculadoraApp", ['ngRoute']);

calculadoraApp.config(['$routeProvider', function($routeProvider) {
	$routeProvider.
		when('/soma', {
			templateUrl: 'soma.jsp',
			controller: 'SomaController'
		}).
		when('/subtracao', {
			templateUrl: 'subtracao.jsp',
			controller: 'SubtracaoController'
		}).
		when('/multiplicacao', {
			templateUrl: 'multiplicacao.jsp',
			controller: 'MultiplicacaoController'
		}).
		when('/divisao', {
			templateUrl: 'divisao.jsp',
			controller: 'DivisaoController'
		}).
		when('/factorial', {
			templateUrl: 'factorial.jsp',
        	controller: 'FactorialController'
		}).
		when('/about', {
			templateUrl: 'about.jsp',
			controller: 'AboutController'
		}).
			otherwise({
			redirectTo: '/soma'
		});
}]);

calculadoraApp.controller('SomaController', ['$scope','$http', function($scope, $http) {
    $scope.resultado = 0;
    $scope.parcela1 = 0;
    $scope.parcela2 = 0;

	$scope.somar = function() {
	    $http.get("/calc/adicao/" + $scope.parcela1 + "/" + $scope.parcela2)
	        .success(function(data, status) {
	            $scope.resultado = data.resultado;
	            $scope.mensagem = data.mensagem;
	            $scope.status = data.status;
	        })
	  	};
}]);

calculadoraApp.controller('SubtracaoController', ['$scope','$http', function($scope, $http) {
    $scope.resultado = 0;
    $scope.parcela1 = 0;
    $scope.parcela2 = 0;

	$scope.subtrair = function() {
	    $http.get("/calc/subtracao/" + $scope.parcela1 + "/" + $scope.parcela2)
	        .success(function(data, status) {
	            $scope.resultado = data.resultado;
	            $scope.mensagem = data.mensagem;
	            $scope.status = data.status;
	        })
	  	};
}]);

calculadoraApp.controller('MultiplicacaoController', ['$scope','$http', function($scope, $http) {
    $scope.resultado = 1;
    $scope.fator1 = 1;
    $scope.fator2 = 1;

	$scope.multiplicar = function() {
	    $http.get("/calc/multiplicacao/" + $scope.fator1 + "/" + $scope.fator2)
	        .success(function(data, status) {
	            $scope.resultado = data.resultado;
	            $scope.mensagem = data.mensagem;
	            $scope.status = data.status;
	        })
	  	};
}]);

calculadoraApp.controller('DivisaoController', ['$scope','$http', function($scope, $http) {
    $scope.resultado = 1;
    $scope.dividendo = 1;
    $scope.divisor = 1;

	$scope.dividir = function() {
	    $http.get("/calc/divisao/" + $scope.dividendo + "/" + $scope.divisor)
	        .success(function(data, status) {
	            $scope.resultado = data.resultado;
	            $scope.mensagem = data.mensagem;
	            $scope.status = data.status;
	        })
	  	};
}]);

calculadoraApp.controller('FactorialController', ['$scope','$http', function($scope, $http) {
    $scope.resultado = 1;
    $scope.numero = 1;

	$scope.factorial = function() {
	    $http.get("/advancedcalc/factorial/" + $scope.numero)
	        .success(function(data, status) {
	            $scope.resultado = data.resultado;
	            $scope.mensagem = data.mensagem;
	            $scope.status = data.status;
	        })
	  	};
}]);

calculadoraApp.controller('AboutController', ['$scope', '$http', function($scope, $http) {
    $scope.about = {}

    $scope.carregar = function() {
        $http.get("/about/system")
            .success(function(data, status) {
                $scope.about = data;
            })
      	};
}]);