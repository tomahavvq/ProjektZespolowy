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
                templateUrl:'templates/stats.html',
                controller:'statsController'
            })
            .state('tren',{
                url:'/tren',
                templateUrl:'templates/tren.html',
                controller:'trainController'
            })
            .state('calc',{
                url:'/calc',
                templateUrl:'templates/calc.html',
                controller:'calculatorController'
            })
            .state('atlas',{
                url:'/atlas',
                templateUrl:'templates/atlas.html',
                controller:'atlasController'
            });


    });

    App.controller('calculatorController', function(){
        this.chosen = 1;
        this.weight = 0;//centymetry
        this.height = 0;//kilogramy
        this.result = 0;
        this.choseCalc = function(chosen){
            this.chosen = chosen;

        };
        this.isChosen = function(chosen){
            return (chosen === this.chosen);
        };

        this.calcBMI = function(height, weight){
            height = parseFloat(height/100);
            this.result = parseFloat(weight/(height^2));
        };

    });