'use strict';

angular.module('webappApp')
  .factory('ebookService', function ($resource) {
    
    return $resource('../rest/book/:id',{},{
      list: {
        method:'GET',
        isArray:true
      },
      save:{
        method:'POST'
      },
      update:{
          method:'PUT'
      },
     remove:{
        method:'DELETE'
      }
    });
  });
