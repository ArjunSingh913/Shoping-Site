$(document).ready(function() { 
	/**
     * Send click events to Fabric via Orchestrator
     */
	var getPlatform = function() {
		var userAgent = window.navigator.userAgent;
		if (userAgent.match(/iPad/i) || userAgent.match(/iPhone/i) || userAgent.match(/android/i) || userAgent.match(/Windows Phone/i) || userAgent.match(/Mobile/i)) {
			return "Mobile";
		} else {
			return "Desktop";
		}
	}

	var getBrowser = function() {
		var userAgent = window.navigator.userAgent;
		var isIE = /*@cc_on!@*/false || !!document.documentMode;
		var isEdge = !isIE && !!window.StyleMedia;
		if (userAgent.match(/OPR/i) && !isEdge) {
			return 'Opera';
		} else if (userAgent.match(/MiuiBrowser/i) && !isEdge) {
			return 'MiuiBrowser';
		} else if (userAgent.match(/SamsungBrowser/i) && !isEdge) {
			return 'SamsungBrowser';
		} else if (userAgent.match(/Chrome/i) && !isEdge) {
			return 'Chrome';
		} else if (userAgent.match(/Safari/i) && !isEdge) {
			return 'Safari';
		} else if (userAgent.match(/Firefox/i)) {
			return 'Firefox';
		} else if ((userAgent.match(/MSIE/i) != -1 ) || (!!document.documentMode == true )) {
			return 'IE'; //IF IE > 10
		} else if (isEdge) {
			return 'Edge';
		} else if (userAgent.match(/UCBrowser/i)) {
			return "UCBrowser";
		} else if (userAgent.match(/Opera Mini/i)) {
			return "OperaMini";
		} else {
			return 'Others';
		}
	}

	var callPublish = function(publishParams, cb) {
        var deferred = $.Deferred();
		var getParams = { sender: 'developer_api', browserName: getBrowser(), platform: getPlatform(), domain: window.location.hostname };
		var finalParams = Object.assign(getParams, publishParams);
		// var url = "https://book.stg.corp.olacabs.com/api/event/publish?";
		var url = "/bookingapi/event/publish?";
		for (var key in finalParams) url = url + key + "=" + encodeURIComponent(finalParams[key]) + "&";
		url = url.replace(/&$/, "");
		$.get( 
            url, 
            function (data) { 
                // console.log(data); 
                cb();
            }, 
            function (error) { 
                console.log(error); 
                cb();
            }, 
            "json" 
        );
    };
    
    callPublish({eventName: "desktop_home_page_loaded"}, function() {});

    // $('*:not(.class)').click(function(event) {
    //     event.stopPropagation();
    //     console.log($(this));
    // });

	/**
	 * App download click events
	 */
    $('.download-link img').click(function() {
		var imgSrc = $(this).attr("src").trim();
		var params = {};
		if (imgSrc.match(/playstore/i)) {
			params["eventName"] = "get_app_android_des";
		} else if (imgSrc.match(/appstore/i)) {
			params["eventName"] = "get_app_iOS_des";
		} else if (imgSrc.match(/windowstore/i)) {
			params["eventName"] = "get_app_windows_des";
		}
		callPublish(params, function () {});
    });

	/**
	 * Fleet details
	 */
	$('.indiv-fleet').click(function() {
		var imgSrc = $(this).find('.ola-fleet-icon').attr('src').trim();
        /**
         * Car category click events
         */
        if (imgSrc.match(/ola-share/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_share" };
        } else if (imgSrc.match(/ola-micro/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_micro" };
        } else if (imgSrc.match(/ola-mini/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_mini" };
        } else if (imgSrc.match(/ola-prime-sedan/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_prime_sedan" };
        } else if (imgSrc.match(/ola-prime-play/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_prime_play" };
        } else if (imgSrc.match(/ola-prime-suv/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_prime_suv" };
        } else if (imgSrc.match(/ola-auto/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_auto" };
        } else if (imgSrc.match(/ola-e-rick/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_e_rick" };
        } else if (imgSrc.match(/ola-kaali-peeli/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_kaali_peeli" };
        } else if (imgSrc.match(/ola-lux/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_lux" };
        } else if (imgSrc.match(/ola-shuttle/i)) {
            var params = { eventName: "fleet_car_category_click_des", carCategory: "ola_shuttle" };
        } 
        /**
         * Feature click events
         */
        else if (imgSrc.match(/ola-play/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "ola_play" };
        } else if (imgSrc.match(/ola-select/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "ola_select" };
        } else if (imgSrc.match(/every-pocket/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "every_pocket" };
        } else if (imgSrc.match(/free-wifi/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "free_wifi" };
        } else if (imgSrc.match(/safer-cars/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "safer_cars" };
        } else if (imgSrc.match(/every-device/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "every_device" };
        } else if (imgSrc.match(/rental-outstation/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "rental_outstation" };
        } else if (imgSrc.match(/corporate/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "corporate" };
        } else if (imgSrc.match(/cashless-ride/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "cashless_ride" };
        } else if (imgSrc.match(/hassle-free/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "hassle_free" };
        } else if (imgSrc.match(/affordable-upfront/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "affordable_upfront" };
        } else if (imgSrc.match(/roud-trip/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "round_trip" };
        } else if (imgSrc.match(/hour-pricing/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "hour_pricing" };
        } else if (imgSrc.match(/multiple-stops/i)) {
            var params = { eventName: "view_all_features_fleet", eventValue: "multiple_stops" };
        }

        var bookingCatergory = $('body').find('.fleet-tab .tab-active').attr("data-tab")

        if (typeof params !== "undefined") {
            if (typeof bookingCatergory !== "undefined")  params["bookingCatergory"] = bookingCatergory;
            callPublish(params, function () {});
        }
    });

    /**
     * "Why ride with Ola?" section feature click events
     */
    $('.indiv-item-list').click(function() {
        var featureHeading = $(this).find('.heading').text().trim();
        var params = { eventName: 'why_ride_with_ola' };
        switch (featureHeading) {
            case 'Cabs for Every Pocket':
                params['eventValue'] = 'every_pocket';
                break;
            case 'Ola Select':
                params['eventValue'] = 'ola_select';
                break;
            case 'Safer Cars':
                params['eventValue'] = 'safer_cars';
                break;
            case 'Rentals and Outstation':
                params['eventValue'] = 'rental_outstation';
                break;
            case 'Cashless Rides':
                params['eventValue'] = 'cashless_ride';
                break;
            case 'Affordable and Up-front Pricing':
                params['eventValue'] = 'affordable_upfront';
                break;
            case 'Free WiFi':
                params['eventValue'] = 'free_wifi';
                break;
            case 'Round-trip or One-way':
                params['eventValue'] = 'round_trip';
                break;
            default:
                break;
        }
        callPublish(params, function () {});
    });

    $('.event-elem').click(function(e) {
        e.preventDefault();

        var self = this;
        var cb = ($(this).prop('nodeName') === 'A' && typeof $(this).attr('href') !== 'undefined') 
            ? function () { window.location = $(self).attr('href'); } 
            : function () {};
        var eventParams = {
            eventName: $(this).attr('event-name'),
            eventValue: $(this).attr('event-value')
        }
        if (($(this).attr('event-name') === "offers_tab_clicked") || ($(this).attr('event-name') === "book_now_top_right")) {
            if (window.location.pathname.indexOf('/outstation-cars') > -1) {
                eventParams.carCategory = "outstation_route";
            } else if (window.location.pathname.indexOf('/outstation') > -1) {
                eventParams.carCategory = "outstation";
            } else if (window.location.pathname.indexOf('/rentals') > -1) {
                eventParams.carCategory = "rentals"
            } else if (window.location.pathname.indexOf('/') > -1) {
                eventParams.carCategory = "city_taxi"
            }
        }
        callPublish(eventParams, cb);
    });
    window.callCustomEvents = function(e) {
        var cb = ($(e).prop('nodeName') === 'A' && typeof $(e).attr('href') !== 'undefined') 
            ? function () { window.location = $(e).attr('href'); } 
            : function () {};
        var eventParams = {
            eventName: $(e).attr('event-name'),
            eventValue: $(e).attr('event-value')
        }
        callPublish(eventParams, cb);
    }
});