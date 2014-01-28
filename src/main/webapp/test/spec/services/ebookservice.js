'use strict';

describe('Service: ebookService', function () {

  // load the service's module
  beforeEach(module('webappApp'));

  // instantiate service
  var ebookService;
  beforeEach(inject(function (_ebookService_) {
    ebookService = _ebookService_;
  }));

  it('should do something', function () {
    expect(!!ebookService).toBe(true);
  });

});
