'use strict';

describe('Controller: EbookCtrl', function () {

  // load the controller's module
  beforeEach(module('webappApp'));

  var EbookCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    EbookCtrl = $controller('EbookCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
