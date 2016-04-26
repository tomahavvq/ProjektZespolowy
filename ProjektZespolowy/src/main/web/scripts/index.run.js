(function() {
  'use strict';

  angular
    .module('projZesp')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log) {

    $log.debug('runBlock end');
  }

})();
