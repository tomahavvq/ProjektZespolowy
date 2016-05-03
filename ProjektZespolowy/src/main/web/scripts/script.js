(function () {
    var app = angular.module('maxwellSport', []);
})();

function selectActiveTab(num) {
    $(".scroll").each(function () {
        $(this).removeClass("active");
    });
    $(".scroll:nth-child(" + num + ")").addClass("active");
}

$(document).ready(function () {
    var headerHeight = $(".masthead").height();

    /* Animate page on click of tab */
    $(".scroll").click(function () {
        var n = $(this).index();
        var offset = $(".content-block:nth-child(" + (n + 2) + ")").offset();
        $('html, body').stop().animate({scrollTop: offset.top - headerHeight}, 500);
    });

    /* Autoselect active tab */
    $(".content-block:nth-child(2)").waypoint(function () {
        selectActiveTab(1);
    }, {offset: "0"});
    $(".content-block:nth-child(3)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(2);
        else if (direction == "up")
            selectActiveTab(1);
    }, {offset: "60px"});
    $(".content-block:nth-child(4)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(3);
        else if (direction == "up")
            selectActiveTab(2);
    }, {offset: "60px"});
    $(".content-block:nth-child(5)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(4);
        else if (direction == "up")
            selectActiveTab(3);
    }, {offset: "60px"});
    $(".content-block:nth-child(6)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(5);
        else if (direction == "up")
            selectActiveTab(4);
    }, {offset: "61px"});

    /* Animations */
    $(".section1 h1").addClass("fadeInLeft");
    $(".section1 h3").addClass("fadeInRight");

    $(".section2 h1").waypoint(function () {
        $(".section2 h1").addClass("fadeInUp")
    }, {offset: "90%"});
    $(".phoneimg").waypoint(function () {
        $(".phoneimg").addClass("fadeInRight")
    }, {offset: "90%"});
    $(".maintext").waypoint(function () {
        $(".maintext").addClass("fadeInUp")
    }, {offset: "90%"});
    $(".minititle01 h3").waypoint(function () {
        $(".minititle01 h3").addClass("fadeInUp")
    }, {offset: "90%"});
    $(".minititle01 .leftin").waypoint(function () {
        $(".minititle01 .leftin").addClass("fadeInLeft")
    }, {offset: "90%"});
    $(".minititle01 .rightin").waypoint(function () {
        $(".minititle01 .rightin").addClass("fadeInRight")
    }, {offset: "90%"});
    $(".minititle02 h3").waypoint(function () {
        $(".minititle02 h3").addClass("fadeInUp")
    }, {offset: "90%"});
    $(".minititle02 .leftin").waypoint(function () {
        $(".minititle02 .leftin").addClass("fadeInLeft")
    }, {offset: "90%"});
    $(".minititle02 .rightin").waypoint(function () {
        $(".minititle02 .rightin").addClass("fadeInRight")
    }, {offset: "90%"});


    $("#tile01").waypoint(function () {
        $("#tile01").addClass("fadeInUp");
        setTimeout(function () {
            $("#tile02").addClass("fadeInUp");
        }, 100);
        setTimeout(function () {
            $("#tile03").addClass("fadeInUp");
        }, 200);
    }, {offset: "90%"});

    $(".comment:nth-child(1)").waypoint(function () {
        $(".comment:nth-child(1)").addClass("fadeInRight")
    }, {offset: "90%"});
    $(".comment:nth-child(2)").waypoint(function () {
        $(".comment:nth-child(2)").addClass("fadeInLeft")
    }, {offset: "90%"});
    $(".comment:nth-child(3)").waypoint(function () {
        $(".comment:nth-child(3)").addClass("fadeInRight")
    }, {offset: "90%"});

    $(".section5 h1").waypoint(function () {
        $(".section5 h1").addClass("fadeInRight")
    }, {offset: "90%"});
    $(".section5 h3:nth-child(2)").waypoint(function () {
        $(".section5 h3:nth-child(2)").addClass("fadeInLeft")
    }, {offset: "90%"});
    $(".section5 h3:nth-child(3)").waypoint(function () {
        $(".section5 h3:nth-child(3)").addClass("fadeInRight")
    }, {offset: "90%"});
    $(".section5 h3:nth-child(4)").waypoint(function () {
        $(".section5 h3:nth-child(4)").addClass("fadeInLeft")
    }, {offset: "90%"});
    $(".section5 button").waypoint(function () {
        $(".section5 button").addClass("fadeInDown")
    }, {offset: "90%"});
});