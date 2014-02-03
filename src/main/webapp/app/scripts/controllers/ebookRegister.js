'use strict';

angular.module('webappApp')
  .controller('EbookregisterCtrl',['$scope','ebookService', function ($scope,ebookService) {
    
    $scope.book = new ebookService();
    $scope.listBooks;
    $scope.save = function(){	
    	$scope.book.$save(function(){
    		$scope.book = new ebookService();
    	});    	
    }
  }]);
