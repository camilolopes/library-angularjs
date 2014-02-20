'use strict';

angular.module('webappApp')
  .controller('EbookregisterCtrl',['$scope','$location', 'ebookService', 'searchBookService','$rootScope',
    function ($scope,$location,ebookService,searchBookService,$rootScope) {
    
    $scope.book = new ebookService();
    $scope.listBooks = ebookService.list();
    $rootScope.listBook;
    $scope.searchBookService = new searchBookService();
    

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
    $scope.search = function(value){
        searchBookService.searchBook({description:value},
       function(data){
        $rootScope.listBook = angular.copy(data);   
        $location.path("/resultsearch")     
        });       
   }
    
    }
  ]);
