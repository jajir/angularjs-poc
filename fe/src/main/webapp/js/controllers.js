var appControlers = angular.module('appControlers', []);

appControlers.controller('MainCtrl', [ '$scope', '$routeParams', 'greetingService',
		function MainCtrl($scope, $routeParams, greetingService) {
			greetingService.get({id:$routeParams.id}, function success(response) {
				$scope.greeting = response;
				console.log("Success:" + JSON.stringify(response));
			}, function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
			});

		} ]);

appControlers.controller('GreetingListCtrl', [ '$scope', 'greetingListService',
		function GreetingListCtrl($scope, greetingListService) {
				greetingListService.get({}, function success(response) {
				console.log("Success:" + JSON.stringify(response));
				$scope.greetings = response;
			}, function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
			});

		} ]);


appControlers.controller('navigationCtrl', [ '$scope', '$location',
		function navigationCtrl($scope, $location) {
			$scope.isActive = function(viewLocation) {
				return viewLocation === $location.path();
			}
		} ]);