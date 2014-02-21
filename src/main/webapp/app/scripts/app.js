'use strict';

angular.module('webappApp', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ngRoute'
])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'EbookregisterCtrl'
      })
      .when('/resultsearch', {
        templateUrl: 'views/resultsearch.html',
        controller: 'EbookregisterCtrl'        
      })
      .when('/ebookRegister', {
        templateUrl: 'views/ebookregister.html',
        controller: 'EbookregisterCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
