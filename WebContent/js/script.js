var demoApp=angular.model('demoApp',['ngRoute']);
demoApp.config(function($routeProvider)
{
	$routeProvider
	.when('/',{
		templateUrl:'Home.html',
	controller:'maincontroller'
	})
	
	.when('/Aboutus',{
		templateUrl:'Aboutus.html',
	controller:'Aboutuscontroller'
	})
	
	.when('/Contactus',{
		templateUrl:'Contactus.html',
	controller:'Contactuscontroller'
	});
});

demoApp.controller('maincontroller',function($scope){
	$scope.message="This is Home page";
})

demoApp.controller('Aboutuscontroller',function($scope){
	$scope.message="This is Contactus page";
})

demoApp.controller('Contactuscontroller',function($scope){
	$scope.message="This is contactus page";
})