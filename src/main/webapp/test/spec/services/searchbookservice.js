'use strict';

describe('Service: searchBookService', function () {

  // load the service's module
  beforeEach(module('webappApp'));

  // instantiate service
  var searchBookService;
  beforeEach(inject(function (_searchBookService_) {
    searchBookService = _searchBookService_;
  }));

  it('should do something', function () {
    expect(!!searchBookService).toBe(true);
  });

});
