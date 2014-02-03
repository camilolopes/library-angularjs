'use strict';

angular.module('webappApp')
  .factory('ebookService', function ($resource) {
    
    return $resource('../rest/book',{},{
      list: {
        method:'GET',
        isArray:true
      },
      save:{
        method:'POST'
      }
     
    });
  });
