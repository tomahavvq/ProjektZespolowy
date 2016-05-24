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
        this.bmi = 0;
        this.water = 0;
        this.whr = 0;
        this.comment = "";
        this.waist = 0;
        this.hip = 0;
        this.sex = "";
        this.idealW = 0;
        this.choseCalc = function(chosen){
            this.chosen = chosen;
        };

        this.isChosen = function(chosen){
            return (chosen === this.chosen);
        };

        this.checkBMI = function(value){
            if(value <= 18.5){
                this.comment = "Underweight";
            }
            else if(value <= 25){
                this.comment = "Normal healthy weight";
            }
            else if(value <= 27){
                this.comment = "Overweight at risk";
            }
            else if(value <= 30){
                this.comment = "Overweight - moderately obese";
            }
            else if(value > 30){
                this.comment = "Overweight - severely obese";
            }
        };

        this.checkWHR = function(value ,sex ){
          if(sex ==='m'){
              if(value <= 0.9){
                  this.comment = "Normal weight";
              }else if (value <= 0.99){
                  this.comment = "Over-weight";
              }else if(value >1.00){
                  this.comment = "Obesity";
              }
          }else if(sex ==='w'){
              if(value <= 0.8){
                  this.comment = "Normal weight";
              }else if (value <= 0.84){
                  this.comment = "Over-weight";
              }else if(value >0.85){
                  this.comment = "Obesity";
              }
          }
        };

        this.calcBMI = function(height, weight){
            height = parseFloat(height/100);
            this.checkBMI(parseFloat(weight/(height*height)));
            this.bmi = parseFloat(weight/(height*height));
            this.weight = 0;
            this.height = 0;
        };

        this.calcWater = function(weight) {
            if (weight <= 10) {
                this.water = weight * 100;
            }else if(weight <= 20){
                this.water = 10*100 + (weight-10)*50;
            }else{
                this.water = 10*100 + 10*50 + (weight-20)*20;
            }
            this.weight = 0;
        };

        this.calcWHR = function(waist, hip, sex) {
            this.whr = waist/hip;
        };

        this.calcIdeal = function(height, sex){
            if(sex === "m"){
                this.idealW = height - 100 - ((height - 150)/4);
            }else if( sex === "w"){
                this.idealW = height - 100 - ((height - 150)/2);
            }
        };

        this.calcDailyCalor = function(){

        };

        this.calcRecomProt = function(){

        };

    });