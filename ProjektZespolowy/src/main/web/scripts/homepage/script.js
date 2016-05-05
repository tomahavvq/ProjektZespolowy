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
    var headerHeight = $(".navbar-maxwell").height();

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
    }, {offset: "62px"});
    $(".content-block:nth-child(4)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(3);
        else if (direction == "up")
            selectActiveTab(2);
    }, {offset: "62px"});
    $(".content-block:nth-child(5)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(4);
        else if (direction == "up")
            selectActiveTab(3);
    }, {offset: "62px"});
    $(".content-block:nth-child(6)").waypoint(function (direction) {
        if (direction == "down")
            selectActiveTab(5);
        else if (direction == "up")
            selectActiveTab(4);
    }, {offset: "62px"});

    var height = $(window).height();
    var loginHeight = $(".popup-wrapper").height();
    var margin = (height - loginHeight) / 2 - 35;
    $(".popup-wrapper").css("margin-top", margin);

    /* Animations */
    $(".section1 h1").addClass("fadeInLeft");
    $(".section1 h3").addClass("fadeInRight");

    $(".section2 h1").waypoint(function () {
        $(".section2 h1").addClass("fadeInUp");
    }, {offset: "90%"});
    $(".phoneimg").waypoint(function () {
        $(".phoneimg").addClass("fadeInRight");
    }, {offset: "90%"});
    $(".maintext").waypoint(function () {
        $(".maintext").addClass("fadeInUp");
    }, {offset: "90%"});
    $(".minititle01 h3").waypoint(function () {
        $(".minititle01 h3").addClass("fadeInUp");
    }, {offset: "90%"});
    $(".minititle01 .leftin").waypoint(function () {
        $(".minititle01 .leftin").addClass("fadeInLeft");
    }, {offset: "90%"});
    $(".minititle01 .rightin").waypoint(function () {
        $(".minititle01 .rightin").addClass("fadeInRight");
    }, {offset: "90%"});
    $(".minititle02 h3").waypoint(function () {
        $(".minititle02 h3").addClass("fadeInUp");
    }, {offset: "90%"});
    $(".minititle02 .leftin").waypoint(function () {
        $(".minititle02 .leftin").addClass("fadeInLeft");
    }, {offset: "90%"});
    $(".minititle02 .rightin").waypoint(function () {
        $(".minititle02 .rightin").addClass("fadeInRight");
    }, {offset: "90%"});

    $(".section3 h1").waypoint(function () {
        $(".section3 h1").addClass("fadeInUp");
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

    $(".section4 h1").waypoint(function () {
        $(".section4 h1").addClass("fadeInUp");
    }, {offset: "90%"});
    $(".comment:nth-child(2)").waypoint(function () {
        $(".comment:nth-child(2)").addClass("fadeInRight");
    }, {offset: "90%"});
    $(".comment:nth-child(3)").waypoint(function () {
        $(".comment:nth-child(3)").addClass("fadeInLeft");
    }, {offset: "90%"});
    $(".comment:nth-child(4)").waypoint(function () {
        $(".comment:nth-child(4)").addClass("fadeInRight");
    }, {offset: "90%"});

    $(".section5 h1").waypoint(function () {
        $(".section5 h1").addClass("fadeInUp");
    }, {offset: "90%"});
    $(".joinininfo p").waypoint(function () {
        $(".joinininfo p").addClass("fadeInLeft");
    }, {offset: "90%"});
    $(".joinininfo button").waypoint(function () {
        $(".joinininfo button").addClass("fadeInDown");
    }, {offset: "90%"});
    $(".wewantyou").waypoint(function () {
        $(".wewantyou").addClass("fadeInDown");
    }, {offset: "90%"});

    $(".register-link").click(function () {
        $(".popup-block").animate({"left": -350},200);
    });

    $(".login-link").click(function () {
        $(".popup-block").animate({"left": 0},200);
    });

    $(".pop-out").click(function () {
        $(".popup-section").css("z-index", "1001").removeClass("fadeOutUp").addClass("fadeInDown");
    });

    $(".close").click(function () {
        $(".popup-section").removeClass("fadeInDown").addClass("fadeOutUp");
        setTimeout(function () {
            $(".popup-section").css("z-index", "-100");
        }, 1000);
    });
});