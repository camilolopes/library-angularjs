'use strict';

angular.module('webappApp')
  .controller('EbookregisterCtrl',['$scope','ebookService', function ($scope,ebookService) {
    
    $scope.book = new ebookService();
    $scope.listBooks = ebookService.list();
    $scope.save = function(){	
    	$scope.book.$save(function(){
    		$scope.book = new ebookService();
    		$scope.listBooks = ebookService.list();
    	});    	
    }

    $scope.remove = function(bookToRemove){
        $scope.bookRemove = bookToRemove; 
        $scope.bookRemove.$remove({id:$scope.bookRemove.id},function(res){        
            $scope.listBooks = ebookService.list();
        })
    }

    $scope.edit = function(book){
        $scope.book = book; 
        $scope.book.$update(function(){
        $scope.listBooks = ebookService.list();
        })
    }
  }]);
