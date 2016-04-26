(function () {
    'use strict';

    angular
        .module('projZesp')
        .config(routerConfig);

    /** @ngInject */
    function routerConfig($stateProvider, $urlRouterProvider) {
        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'scripts/example/example.html',
                controller: 'ExampleCtrl',
                controllerAs: 'meals'
            });

        $urlRouterProvider.otherwise('/');
    }

})();
