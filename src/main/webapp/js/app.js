var app = angular.module('app', [ 'ngRoute', 'appControlers', 'services' ]);

app.config([ '$routeProvider', '$locationProvider',
		function($routeProvider, $locationProvider) {
			$routeProvider
			.when('/list',{
				templateUrl: "partials/GreetingList.html", 
				controller: "GreetingListCtrl",
			})
			.when('/:id?', {
				templateUrl : 'partials/main.html',
				controller : 'MainCtrl'
			})
			.otherwise('/');

			$locationProvider.html5Mode(false).hashPrefix('!')

		} ]);
