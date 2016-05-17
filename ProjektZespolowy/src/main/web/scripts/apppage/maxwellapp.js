var App = angular.module('maxApp',['ui.router']);

    App.config(function($stateProvider, $urlRouterProvider){
        $urlRouterProvider.otherwise("/menu");

        $stateProvider
            .state('menu',{
                url:'/menu',
                templateUrl:'templates/menu.html'
            })
            .state('stats',{
                url:'/stats',
                templateUrl:'templates/stats.html'
            })
            .state('tren',{
                url:'/tren',
                templateUrl:'templates/tren.html'
            })
            .state('calc',{
                url:'/calc',
                templateUrl:'templates/calc.html'
            })
            .state('atlas',{
                url:'/atlas',
                templateUrl:'templates/atlas.html'
            });

    });

