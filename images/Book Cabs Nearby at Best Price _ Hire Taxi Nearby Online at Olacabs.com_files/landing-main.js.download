$(document).ready(function() 
{ 
	//Sticky header

	// Navigation Menu
    $('.menu-icon').click(function(e) {
        e.preventDefault();
        $('.body-overlay').removeClass('overlay-hide');
        $('.sidebar_navigation').css({
            left: '0',
        });
        $('body').css({
        	overflow: 'hidden'
        });
    });
    $('.close_btn').click(function(e) {
    	$('.body-overlay').addClass('overlay-hide');
        $('.sidebar_navigation').css({
        	left: '-100%'
        });
        $('body').css({
        	overflow: 'auto'
        });
    });
    $(document).mouseup(function(e) {
        var nav_menu = $('.sidebar_navigation');
        if (!nav_menu.is(event.target) && nav_menu.has(event.target).length === 0) {
        	$('.body-overlay').addClass('overlay-hide');
            nav_menu.css({
            	left: '-100%'
            });
            $('body').css({
	        	overflow: 'auto'
	        });
		}
		$('.country-options').addClass('hide');
    });
    // var custom_dots = $('.top-banner-tab');
    // $('.custom-carousel-wrapper').slick({
    // 	slidesToShow: 1,
  		// slidesToScroll: 1,
  		// arrows: true,
    //     dots: false,
    //     asNavFor: '.top-banner-tab'
    // });
    // $('.top-banner-tab').slick({
    // 	slidesToShow: 11,
  		// slidesToScroll: 1,
  		// asNavFor: '.custom-carousel-wrapper',
  		// dots: false,
  		// focusOnSelect: true,
  		// variableWidth: true
    // });

    $('.indiv-fleet').click(function(event) {
    	$('html, body').animate({
        'scrollTop' : $(".ola-fleet").offset().top - 50
	    });
	    // $(window).scrollTop($('.ola-fleet').offset().top);
    });
	/*slick */
	var perv_for = $('.prev-btn');
	var next_for = $('.next-btn');
	var prev_nav = $('.prev-btn-nav');
	var next_nav = $('.next-btn-nav');
	var dot_indicator = $('.dot-indicator');

	$('.slider-for').slick({
      	slidesToShow: 1,
		slidesToScroll: 1,
		arrows: true,
		prevArrow: perv_for,
		nextArrow: next_for,
		fade: true,
		infinite: false,
		asNavFor: '.slider-nav'
   });
	$('.slider-nav').slick({
  		slidesToShow: 10,
  		slidesToScroll: 1,
  		asNavFor: '.slider-for',
  		focusOnSelect: true,
  		infinite: false,
  		arrows: true,
  		prevArrow: prev_nav,
		nextArrow: next_nav,
		responsive: [
			{
				breakpoint: 1400,
				settings: {
			        slidesToShow: 8,
			        slidesToScroll: 1,
			    }
			},
			{
				breakpoint: 1024,
				settings: {
			        slidesToShow: 7,
			        slidesToScroll: 1,
			    }
			},
			{
				breakpoint: 800,
				settings: {
			        slidesToShow: 6,
			        slidesToScroll: 1,
			    }
			},
			{
				breakpoint: 768,
				settings: {
			        slidesToShow: 5,
			        swipe: false,
			    }
			},
			{
				breakpoint: 600,
				settings: {
			        slidesToShow: 4,
			        swipe: false,
			    }
			},
			{
				breakpoint: 480,
				settings: {
			        slidesToShow: 3,
			        swipe: false,
			    }
			},
			{
				breakpoint: 350,
				settings: {
			        slidesToShow: 2,
			        swipe: false,
			    }
			},

		]
	  });

	//Offer swipe
	var offer_prev_btn = $('.offer-prev-btn');
	var offer_next_btn = $('.offer-next-btn');
	$(".offers-slick").slick({
		slidesToShow: 3,
		slidesToScroll: 1,
		autoplay: true,
  		autoplaySpeed: 3000,
		prevArrow: offer_prev_btn,
		nextArrow: offer_next_btn,
		responsive: [
			{
				breakpoint: 768,
				settings: {
			        slidesToShow: 1,
			        slidesToScroll: 1,
			    }
			},
			{
				breakpoint: 1024,
				settings: {
			        slidesToShow: 2,
			        slidesToScroll: 1,
			    }
			},
		]
	});

	$(".image-slider").slick({
		// dots: true,
		// infinite: true,
		centerMode: true,
		slidesToShow: 1,
		slidesToScroll: 3,
		variableWidth: true,
		autoplay: true,
  		autoplaySpeed: 2000,
		prevArrow: '<div class="slick-prev"><img src="webstatic/img/sliders/prev-icon.svg"></div>',
		nextArrow: '<div class="slick-next"><img src="webstatic/img/sliders/next-icon.svg"></div>',
		responsive: [
		{
			breakpoint: 768,
			settings: {
				slidesToShow: 1,
				slidesToScroll: 1,
			}
		}]
	});
	$(".banner-slider").slick({
		arrows: false,
		centerPadding: "0px",
		dots: true,
		slidesToShow: 1,
		autoplay: true,
		infinite: true
	});
	var click_counter = 0;
	var nele_footerexpand_link = $('.footer-expand-link').parent().next();
    if(nele_footerexpand_link.length==0)
    {
        $('.footer-expand-link').addClass('hide');
    }
	$('.footer-expand-link').click(function(e){
		e.preventDefault();
		click_counter++;
		console.log('click counter',click_counter);
		// $(this).find('.footer-link-msg').toggleClass('hide');
		$('.footer-hide-link').removeClass('hide');
		$('.footer-expanded-view-1').removeClass('hide');
		if(click_counter>=1)
		{
            $('.footer-expanded-view-'+click_counter).removeClass('hide');
            var nextelementexist=click_counter+1;
            var nextelement = $('.footer-expanded-view-'+nextelementexist);
			if(nextelement.length==0)
			{
				$(this).addClass('hide');
			}
		}
	});
	$('.footer-hide-link').click(function(e){
		e.preventDefault();
		$('.expand-view').addClass('hide');
        $(this).addClass('hide');
        $('.footer-expand-link').removeClass('hide');
        click_counter = 0;
    });

	//Footer country select
    $('.country-select').click(function(e){
        $('.country-options').removeClass('hide');
    });
    // $('.country-options>li').click(function(e){
    //     e.stopPropagation();
    //     $('.default-hide').removeClass('default-hide');
    //     $('.selected-hide').removeClass('selected-hide');
    //     var append_content = $(this).html();
    //     $('.country-select .selected').html(append_content);
    //     $('.country-options').addClass('hide');
    //     $(this).addClass('selected-hide');
    // });
});