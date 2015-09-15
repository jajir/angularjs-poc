var blogServices = angular.module('services', ['ngResource']);

blogServices.factory('greetingService', ['$resource', function($resource) {
	return $resource("greeting/:id", {id:1}, {
		get: {method: 'GET', params:{id:'@id'}, cache: true, isArray: false},
		//save: {method: 'POST', cache: false, isArray: false},
		//update: {method: 'PUT', cache: false, isArray: false},
		//remove: {method: 'DELETE', cache: false, isArray: false}
		//*/
	});
	
}]);

blogServices.factory('greetingListService', ['$resource', function($resource) {
	return $resource("greetingList/", {}, {
		get: {method: 'GET', params:{}, cache: true, isArray: true},
		//save: {method: 'POST', cache: false, isArray: false},
		//update: {method: 'PUT', cache: false, isArray: false},
		//remove: {method: 'DELETE', cache: false, isArray: false}
		//*/
	});
	
}]);