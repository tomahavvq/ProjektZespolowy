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
    var boxHeight = $(".background-color").height();
    var headerHeight = $(".masthead").height();

    $(".scroll").click(function () {
        var n = $(this).index();
        $('html, body').stop().animate({scrollTop: n * boxHeight - headerHeight}, 500);
    });

    $(window).scroll(function () {
        var position = $(this).scrollTop();
        if (position < 440) {
            selectActiveTab(1);
        } else if (position < 940) {
            selectActiveTab(2);
        } else if (position < 1440) {
            selectActiveTab(3);
        } else if (position < 1940) {
            selectActiveTab(4);

        }
    });

    /* Animations on load */
    $(".title-box h1").fadeTo(500, 1).animate({left: 20}, 700);
    $(".title-box h3").fadeTo(400, 1).animate({right: 50}, 700);
});