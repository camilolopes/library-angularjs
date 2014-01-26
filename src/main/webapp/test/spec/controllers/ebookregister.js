'use strict';

describe('Controller: EbookregisterCtrl', function () {

  // load the controller's module
  beforeEach(module('webappApp'));

  var EbookregisterCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    EbookregisterCtrl = $controller('EbookregisterCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
