'use strict';

angular.module('webappApp')
  .factory('searchBookService', function ($resource) {
    
    return $resource('../rest/book/search/:description',{
    	description:'@description'},{
      searchBook:{
        method:'GET',
        isArray:true
      }
    });
  });
