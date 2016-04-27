$(document).ready(function () {
    $(".masthead-nav li").click(function () {
        $(".masthead-nav li").each(function () {
            $(this).removeClass("active");
        });
        $(this).addClass("active");
        var n = $(this).index();
        $('html, body').stop().animate({scrollTop: n*400}, 500);
        return false;
    });
});
