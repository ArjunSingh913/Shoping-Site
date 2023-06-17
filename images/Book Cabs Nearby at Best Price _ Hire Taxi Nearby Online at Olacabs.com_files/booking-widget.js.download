
// import BookingWidgetAPI from '/server/public/location';
const widgetContainer = document.createElement('template');
const DROP = 'DROP';
const PICKUP = 'PICKUP';
const ENABLE_CURR_LOCATION_COMM = 'Please provide current location to select rental package';
const ENABLE_LOC_PERM_COMM = 'Please enable location permission and try again';
const NO_PACKAGES_FOUND = 'No packages found for currently selected location';
const ERROR_FETCHING_PACKAGES = 'There was an error while trying to fetch available packages';
const SELECT_LOC_COMM = 'Please select a location.';
const NO_FROM_LOC = 'Please select a pickup location.';
const NO_TO_LOC = 'Please select a destination location.';
const NO_PACKAGE_SELECTED = 'Please select a package';

widgetContainer.innerHTML = `
  <style>
    #loader {
      position: absolute;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      z-index: 5;
      background-color: rgba(255, 255, 255, 0.85);
      display: none;
      justify-content: center;
      align-items: center;
    }

    #loader.show {
      display: flex;
    }

    #loader img {
      width: 70px;
    }

    #select-package-input {
      cursor: pointer;
    }

    #select-package-input button {
      outline: 0;
    }
    
    #select-package-input button:focus {
      outline: 0;
    }
    
    #select-package-input button:active {
      outline: 0;
    }

    #select-package-input button:visited {
      outline: 0;
    }

    #error-comp {
      background-color: #000;
      width: 392px;
      color: #fff;
      position: absolute;
      top: 91px;
      left: 31px;
      font-size: 16px;
      line-height: 19px;
      z-index: 10;
    }

    #error-comp p {
      box-sizing: border-box;
      padding: 0px 36px;
    }

    #error-comp img {
      filter: invert(0%) sepia(11%) saturate(991%) hue-rotate(234deg) brightness(87%) contrast(99%);
      position: absolute;
      top: 19px;
      left: 9px;
    }

    #error-comp .close_btn {
      cursor: pointer;
      position: absolute;
      top: 11px;
      right: 11px;
    }

    .booking-widget {
      --ola-primary-color: #424a54;
      --ola-highlight-color: #cddc39;
      --ola-back-color: #f5f5f5;
      --ola-front-color: #fff;
      --ola-label-color: #4d4d4d;
      --ola-text-color: #000;
      --ola-widget-color: #F2F4F6;
      color: var(--ola-text-color);
      display: block;
      width: 100%;
      --mobile-cont: {max-width:550px;margin:0;display:block;left:0;}
      @apply(--mobile-cont);
      border-bottom-left-radius: 4px;
      border-bottom-right-radius: 4px;
      position: absolute;
      top: 35vh;
      left: 0;
    }

    .booking-widget input {
      font-family: "Gentona", -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif; 
    }

    input:disabled {
      background-color: transparent;
    }
    
    .seperator {
      display: none;
    }

    .main-container {
      padding: 24px 24px 24px 16px;
      align-items: center;
      background: var(--ola-widget-color);
      position: relative;
    }

    .tab-container {
      display: flex;
      flex-direction: row;
      width: 304px;
      height: 40px;
      align-items: center;
      justify-content: space-around;
      background: white;
      font-family: Gentona;
      padding: 0 25px;
    }

    .tab-item {
      font-size: 14px;
      line-height: 20px;
      color: var(--ola-text-color);
      opacity: 0.7;
      height: 100%;
      cursor: pointer;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 0 20px;
    }
    
    #select-curr-loc.selected img {
      filter: invert(89%) sepia(9%) saturate(6354%) hue-rotate(83deg) brightness(99%) contrast(100%);
    }

    .tab-item.active {
      border-bottom: 4px solid var(--ola-text-color);
      opacity: 1;
      font-weight: 500;
    }

    .search-text-in-cta {
      font-family: 'Gentona';
      font-style: normal;
      font-weight: 500;
      font-size: 17px;
      line-height: 20px;
      color: #fff;
      text-transform: uppercase;
    }

    .forward-icon {
      position: absolute;
      top: 50%;
      transform: translateY(-50%);
      right: 24px
    }

    .cab-type-in-cta {
      color: #3CEF83;
    }

    .line {
      height: 1px;
      background: #e5e5e5;
    }

    .clock-logo {
      position: absolute;
      left: -28px;
    }

    .hide {
      display: none;
    }

    .category-message-container {
      padding: 12px 0px 5px 0px;
      text-align: center;
    }

    .category-header {
      font-size: 16px;
      font-weight: 500;
      width: 80%;
      margin: 0px auto 5px;
    }

    .category-subheader {
      font-size: 14px;
      font-weight: 400;
      width: 80%;
      margin: 0 auto;
    }

    .main-sub-container {
      display: flex;
    }

    @media (max-width: 910px) {
      .tab-container {
        padding: 0;
      }
      .page-container {
        margin: 0;
        position: static;
        transform: translate(0, 0);
      }
      .main-container {
        flex-direction: column;
        width: 100%;
        align-items: baseline;
        justify-content: center;
        background-color: #fff;
        box-sizing: border-box;
        position: relative;
        padding-top: 8px;
      }
      .seperator {
        display: block;
        height: 1px;
        position: absolute;
        top: 68px;
        left: 70px;
        right: 10px;
        background-color: rgba(0, 0, 0, 0.2);
      }
      .tab-container {
        background-color: #F2F4F6;
        width: 100%;
      }
      .tab-item {
        color: rgba(0, 0, 0, 0.7);
      }
      .tab-item.active {
        color: #000;
      }
    }
    .circular {
      animation: rotate 2s linear infinite;
      position: relative;
      display: block;
      margin: 0 auto;
    }
    .path {
      stroke-dasharray: 41,25;
      stroke-dashoffset: 0;
      stroke: #888;
      stroke-linecap: round;
      }
  
    .bg-dark {
      background: #e2e2e2;
    }
  
    .no-border {
      border: 1px solid #e2e2e2 !important;
    }
  
    .error-border {
      border: 1px solid red !important;
    }
  
    .card {
      position: relative;
      width: 100%;
      background-color: #fff;
      padding: 12px 62px 12px 48px;
      font-family: 'Gentona';
      font-style: normal;
      box-sizing: border-box;
      margin: 0 16px;
      border: 1px solid rgba(0, 0, 0, 0.2);
    }
  
    .card.pickup:after {
      content: '';
      position: absolute;
      top: 50%;
      right: -35px;
      transform: translateY(-50%);
      height: 1px;
      width: 34px;
      background-color: rgba(0, 0, 0, 0.2);
    }

    .card.rental-no-line:after {
      display: none;
    }
  
    .current-location-icon {
      position: absolute;
      content: '';
      top: 59%;
      transform: translateY(-50%);
      right: -43px;
      cursor: pointer;
    }
  
    .card.dot:before {
      position: absolute;
      top: 50%;
      transform: translateY(-50%);
      left: 24px;
      width: 8px;
      height: 8px;
      content: '';
      border-radius: 50%;
    }
  
    .dot.red:before {
      background-color: #E97550;
    }
  
    .dot.green:before {
      background-color: #92C83E;
    }
  
    .left {
      position: absolute;
      width: 64px;
      padding-left: 8px;
    }
  
    .middle {
      position: absolute;
      left: 64px;
      right: 40px;
    }
  
    .far-right {
      position: absolute;
      width: 40px;
      right: 0px;
      text-align: center;
      line-height: 40px;
      padding-top: 8px;
    }
  
    .h-full {
      height: 100%;
      line-height: 40px;
      top: 0;
    }
  
    .h-full input {
      height: 100%;
    }
  
    .row-sm {
      display: flex;
      position: relative;
      align-items: center;
      justify-content: center;
      height: 30px;
    }
  
    .text {
      text-overflow: ellipsis;
      overflow: hidden;
      white-space: nowrap;
    }
  
    .label {
      font-size: 10px;
      color: #898989;
      text-transform: uppercase;
    }
  
    .error-label {
      color: red !important;
    }
  
    .label.lg {
      font-size: 12px;
    }
  
    .value {
      border: none;
      color: #000;
      font-size: 16px;
      line-height: 27px;
      width: 100%;
      margin-top: -2px;
      height: 32px;
      margin-bottom: 0;
    }

    .booking-widget input::placeholder {
      color: #000000;
      font-weight: 400;
    }

    .select-package {
      margin-top: 3px;
    }

    .value:focus {
      outline: none;
    }
  
    .placeholder {
      color: #888;
    }

    input::placeholder {
      font-weight: 500;
    }
  
    .ola-svg {
      pointer-events: none;
      display: inline-block;
      width: 24px;
      height: 24px;
      fill: currentcolor;
      stroke: none;
    }

    .suggestion-list.close {
      display: none;
    }

    .suggestion-list {
      position: absolute;
      top: 29px;
      width: 442px;
      max-height: 292px;
      left: -48px;
      padding: 0;
      box-shadow: 0px 0px 1px rgba(0, 0, 0, 0.24), 0px 8px 16px rgba(0, 0, 0, 0.12);
      background-color: #fff;
      overflow-y: scroll;
      z-index: 4;
    }

    .suggestion-list > li {
      background-color: #fff;
      padding: 16px 31px 16px 49px;
      font-size: 16px;
      line-height: 20px;
      cursor: pointer;
    }

    .suggestion-list > li:hover {
      background-color: rgba(0, 0, 0, 0.05);
    }
  
    @media (max-width: 910px) {
      .card {
        border: none !important;
        width: 100%;
        padding: 16px 62px 16px 50px;
      }
      .card.card:after {
        top: 98%;
        left: 9px;
        width: 38px;
        transform: rotate(90deg);
        z-index: 1;
      }
      .row-sm {
        justify-content: flex-start;
      }
    }

    .ow-button-container {
      width: 100%;
    }
  
    .ow-button {
      /* border-radius: 4px;
      border: none;
      font-size: 18px;
      font-weight: 300;
      box-shadow: inset 0 -1px 0 0 rgba(255, 255, 255, 0.2);
      background-color: #000000;
      color: #cddc39;
      text-align: center;
      box-sizing: border-box;
      outline: none;
      cursor: pointer; */
      position: relative;
      cursor: pointer;
      box-shadow: -3px 3px 0 #32c86e;
      padding: 18px;
      margin: 20px 0;
      font-family: Gentona,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Open Sans,Helvetica Neue,sans-serif;
      box-sizing: border-box;
      width: 282px;
      margin: 0 16px;
      text-align: left;
      background-image: url(https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/ola_cabs_back.svg), radial-gradient(127.68% 2996.56% at 12.65% 127.68%, #000000 0%, #222222 100%);
      background-repeat: no-repeat;
      background-position: bottom;
      border: none;
    }
  
    .ow-button--primary {
      background-color: #000000;
      /* color: #cddc39; */
    }
  
    .ow-button--secondary {
      background-color: #000;
    }
  
    .ow-button--grey {
      background-color: #dedede;
      color: #000000;
    }
  
    .disabled {
      width: 100%;
      height: 44px;
      border-radius: 4px;
      border: none;
      font-size: 16px;
      background-color: #000000;
      box-shadow: inset 0 -1px 0 0 rgba(255, 255, 255, 0.2);
      text-align: center;
      outline: none;
      color: rgba(239, 255, 33, .3);
      font-weight: 300;
    }
  
    .inline {
      display: inline-block;
    }
  
    @media (max-width: 910px) {
      .main-sub-container {
        display: block;
      }
      .booking-widget {
        z-index: 1;
        position: relative;
        top: 0;
      }
      .card {
        margin: 0;
      }
      .page-container {
        margin-top: -8vh;
        margin-bottom: 20px;
      }
      .max-width {
        width: 100%;
      }
      .ow-button {
        width: 100%;
        margin: 0 0 0 8px;
      }
      .suggestion-list {
        width: 350px;
        z-index: 3;
        top: 20px;
        left: -3px;
      }
      .value {
        width: 100%;
      }
    }
    @media only screen and (max-width: 910px) {
      #error-comp {
        width: auto;
        left: 22px;
        right: 22px;
        top: 133px;
        height: 60px;
      }
      .suggestion-list {
        width: 80vw;
      }
      .ow-button {
        background: url('https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/ola_cabs_back.svg') no-repeat 10px 16px/80% #000;
      }
    }
    @media only screen and (min-width:911px) {
        .max-width {
            max-width: 90vw;
            margin: auto;
        }
    }
    @media only screen and (min-width:1025px) {
      .max-width {
          max-width: 67vw;
          margin: auto;
      }
    }
  @media only screen and (min-width:2000px) {
      .max-width {
          max-width: 50vw;
          margin: auto;
      }
  }
  </style>

  <div class='booking-widget'>
    <div class="snackbar font-16 lh-20" id="snackbar"></div>
    <div class="page-container max-width">
      <div class="tab-container" id="tab-container">
      </div>
      <div class="main-container">
        <div class="main-sub-container">
          <div id="loader">
            <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/dot-loader.gif" alt="">
          </div>
          <div id="current-location" class="widget-location-input card bg-dark pickup dot green">
            <div class="row-sm ptr">
              <input type="text" placeholder="Current Location" class="value text" />
              <div id="select-curr-loc" class="current-location-icon">
                <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/current-location.svg" alt="">
              </div>
              <ul class='suggestion-list close'></ul>
            </div>
          </div>

          <div class="seperator" id="seperator"></div>

          
          <div id="destination-input" class="widget-location-input card bg-dark dot red">
            <div class="row-sm ptr">
              <input type="text" placeholder="Enter Destination" class="value text"/>
              <ul class='suggestion-list close'></ul>
            </div>
          </div> 

          <div id="select-package-input" class="widget-location-input card bg-dark">
            <div class="row-sm ptr">
              <p class="value text select-package"> 
                Select Package
              </p>
              <div id="select-curr-loc" class="clock-logo">
                <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/clock.svg" alt="">
              </div>
              <ul class='suggestion-list close'></ul>
            </div>
          </div>

          <div id='search-cabs' class="ow-button-container">
            <button class="ow-button event-elem"
            >
              <ow-icon name="icon"></ow-icon>
              <span>
                <span class="search-text-in-cta">SEARCH </span> 
                <span id='search-btn' class="search-text-in-cta cab-type-in-cta">
                  OUTSTATION CABS
                </span>
                <span class='forward-icon'><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/forward-arrow.svg" alt=""></span>
              </span>
            </button>
          </div>
          <div id='error-comp'>
            <p></p>
            <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/current-location.svg" alt="">
            <a class="close_btn">&times;</a>
          </div>
        </div>
      </div>
    </div>
  </div>
`
class BookingWidget extends HTMLElement {
  constructor() {
    super();
    this.currentLocationInput = null;
    this.root = null;
    this.tabItems = ['Daily', 'Rental', 'Outstation'];
    this.activeTab = '';
    this.currentCordinates = null;
    this.packageSelected = null;
    this.listElement = null;
    this.booking = {
      fromLocation: {
        lat: '',
        lng: '',
        formattedAddress: ''
      },
      toLocation: {
        lat: '',
        lng: '',
        formattedAddress: ''
      },
      selectedPackage: '',
      isCurrentLocationSelected: false,
      packages: {},
    }
  }

  connectedCallback() {
    const shadowRoot = this.attachShadow({ mode: 'closed' });
    shadowRoot.appendChild(widgetContainer.content);

    this.root = shadowRoot;
    
    // For CurrentLocation Input
    this.currentLocationInput = this.root.getElementById('current-location').querySelector('input');
    let debouncedSearchCurr = this.debounce(() => this.locationInputCallback(this.currentLocationInput, PICKUP));
    this.attachEvent(this.currentLocationInput, 'keyup', () => debouncedSearchCurr());
    this.attachEvent(this.currentLocationInput, 'click', () => this.closeDropDown());;

    // For Destination Input
    this.destinationInput = this.root.getElementById('destination-input').querySelector('input');
    let decouncedSearchDes = this.debounce(() => this.locationInputCallback(this.destinationInput, DROP));
    this.attachEvent(this.destinationInput, 'keyup', () => decouncedSearchDes());
    this.attachEvent(this.destinationInput, 'click', () => this.closeDropDown());;

    //Current Location
    this.currentLocPointer = this.root.getElementById('select-curr-loc');
    this.attachEvent(this.currentLocPointer, 'click', this.setCurrentLocationCallback.bind(this));

    // rendering tabs
    this.tabContainer = this.root.getElementById('tab-container');
    this.renderTabs();

    //initialising loader elem
    this.loader = this.root.getElementById('loader');

    //Initialising custom error block
    this.errorElem = this.root.getElementById('error-comp');
    this.crossOnError = this.errorElem.getElementsByClassName('close_btn')[0];
    this.crossOnError.addEventListener('click', this.hideCustomError.bind(this));
    this.hideCustomError();

    //Initialising Search Cabs Button
    this.searchButton = this.root.getElementById('search-cabs').querySelector('button');
    this.searchButton.classList.add("event-elem")
    this.searchButton.setAttribute("event-name", "desktop_booking_widget_" + this.activeTab.toLocaleLowerCase() + "_search")
    this.attachEvent(this.searchButton, 'click', () => this.searchCabs())

    this.selectPackageInput = this.root.getElementById('select-package-input').querySelector('p');
    this.attachEvent(this.selectPackageInput, 'click', this.packageInputCallback.bind(this));

    this.listElementPackage = this.root.getElementById('select-package-input').querySelector('.suggestion-list');
    this.attachEvent(this.listElementPackage, 'click', this.selectPackage.bind(this));


    this.listElementCurrLoc = this.root.getElementById('current-location').querySelector('.suggestion-list');

    this.listElementDestLoc = this.root.getElementById('destination-input').querySelector('.suggestion-list');

    // Close dropdown on clicking outside of it
    let body = document.getElementById("main-body");
    this.attachEvent(body, 'click', (e) => {
      if(e.target.nodeName !== 'BOOKING-WIDGET'){
        this.closeDropDown();
      }
    });

    this.attachEvent(this.listElementCurrLoc, 'click', e => this.selectLocation(e, PICKUP));
    this.attachEvent(this.listElementDestLoc, 'click', e => this.selectLocation(e, DROP));
    // to call all the events of this component
    this.root.querySelectorAll(".event-elem").forEach((a) => a.addEventListener("click", () => window.callCustomEvents(a)))
  }

  disconnectedCallback() {
    this.removeEvent(this.currentLocationInput, 'keyup', this.locationInputCallback.bind(this, this.currentLocationInput));
    this.removeEvent(this.listElementCurrLoc, 'click', e => this.selectLocation(e, PICKUP));
    this.removeEvent(this.listElementDestLoc, 'click', e => this.selectLocation(e, DROP));
    this.removeEvent(body, 'click', (e) => {
      if(e.target.nodeName !== 'BOOKING-WIDGET'){
        this.closeDropDown();
      }
    });
    this.root.querySelectorAll(".event-elem").forEach((a) => a.removeEventListener("click", () => window.callCustomEvents(a)))
    this.removeEvent(this.currentLocationInput, 'keyup', () => debouncedSearchCurr());
    let decouncedSearchDes = this.debounce(() => this.locationInputCallback(this.destinationInput, DROP));
    this.removeEvent(this.destinationInput, 'keyup', () => decouncedSearchDes());
    this.removeEvent(this.currentLocPointer, 'click', this.setCurrentLocationCallback.bind(this));
    this.removeEvent(this.searchButton, 'click', () => this.searchCabs())
    this.removeEvent(this.selectPackageInput, 'click', this.packageInputCallback.bind(this));
    this.removeEvent(this.listElementPackage, 'click', this.selectPackage.bind(this));

  }

  // ---------API CALLERS----------

  async GetPackageList (lat, lng) {
    let packagesList = {};
    try {
      let res = await fetch(`
        /web-api/products?${new URLSearchParams({
          pickupLat: lat,
          pickupLng: lng,
          serviceType: "rental",
          polling: false,
          silent: false
        })}`, {
        headers: {
          'Content-Type': 'application/json'
        },
        
      })
      packagesList = await res.json();
      packagesList = packagesList.data.rental.packages;
    } catch (err) {
      console.log(err.message);
      this.openSnackBar(ERROR_FETCHING_PACKAGES);
    }
    return packagesList;
  }

  async LocationAutoComplete (req) {
    let locationsList = [];
    try {
      let res = await fetch(`/booking-widget/search/autocomplete?query=${req.query}&lat=${req.lat}&lng=${req.lng}&serviceType=${req.serviceType}&tag=${req.tag}`, {
        headers: {
          'Content-Type': 'application/json'
        }
      })
      locationsList = await res.json();
      locationsList = locationsList.data[0].list;
    } catch (err) {
      console.log(err.message);
    }
    return locationsList;
  }

  async ReverseGeocode (lat, lng) {
    let response;
    try {
      let res = await fetch(`/bookingapi/reverse-geocode?lat=${lat}&lng=${lng}`, {
        headers: {
          'Content-Type': 'application/json'
        },
      })
      response = await res.json();
    } catch (err) {
      console.log(err.message);
    }
    return response.data.formattedAddress || {};
  }

  async GetPlace (placeId) {
    let place;
    try {
      let res = await fetch(`/booking-widget/search/place?placeId=${placeId}`, {
        headers: {
          'Content-Type': 'application/json'
        },
      })
      place = await res.json();
    } catch (err) {
      console.log(err.message);
    }
    return place.data || {};
  }
  

  // ---------SEARCH CABS BUTTON LOGIC---------

  getServiceType () {
    switch (this.activeTab) {
			case 'Daily':
				return { id: 'p2p', index: 0, name: 'City Taxi', route: '' }
			case 'Outstation':
				return { id: 'outstation', index: 1, name: 'Outstation', route: 'outstation-cabs' }
			case 'Rental':
				return { id: 'rentals', index: 2, name: 'Rentals', route: 'rental-cabs' }
      default: 
        return {};
		}
  }

  searchCabsParams() {
    let params = { serviceType: this.getServiceType().id, utm_source: 'widget_on_olacabs' }
    const {fromLocation, toLocation, selectedPackage} = this.booking;
    params.drop_lat = toLocation && toLocation.lat;
    params.drop_lng = toLocation && toLocation.lng;
    params.drop_name = toLocation && toLocation.formattedAddress;

    switch (this.activeTab) {
      case 'Rental': {
        params.selectedPackage = selectedPackage;
        break;
      }
      default: { 
        break;
      } 
    }

    if (this.isCurrentLocationSelected) {
      params.pickup = 'current_location'
    }
  
    params.lat = fromLocation && fromLocation.lat;
    params.lng = fromLocation && fromLocation.lng;
    params.pickup_name = fromLocation && fromLocation.formattedAddress;

    return params
  }

  isLocationParamError() {
    const {fromLocation, toLocation, selectedPackage} = this.booking;
    const noFromLocation = !(fromLocation.lat && fromLocation.lng);
    const noToLocation = !(toLocation.lat && toLocation.lng);
    let locationParamError = false;
    if(noFromLocation && noToLocation) {
      locationParamError = true;
      this.openSnackBar(SELECT_LOC_COMM);
    } else if(noFromLocation) {
      locationParamError = true;
      this.openSnackBar(NO_FROM_LOC);
    } else if(noToLocation && this.activeTab !== 'Rental') {
      locationParamError = true;
      this.openSnackBar(NO_TO_LOC);
    }

    if(!selectedPackage && this.activeTab === 'Rental' && !locationParamError) {
      locationParamError = true;
      this.openSnackBar(NO_PACKAGE_SELECTED);
    }
    return locationParamError;
  }

  searchCabs () {
    if(!this.isLocationParamError()){
      this.triggerSearchCabs()
    }
  }

  async getBookingPageUrl () {
    let url = '';
    try {
      let res = await fetch('/get-booking-page');
      url = await res.json();
    } catch (e) {
      console.log(e.message);
    }
    return url.url;
  }

  async triggerSearchCabs () {
    let baseUrl = await this.getBookingPageUrl();
    console.log('baseUrl', baseUrl);
    if (baseUrl) {
      let urlWithParams = Object.keys(this.searchCabsParams() || {}).reduce((url, key, i) => {
        return i === 0
          ? url + '?' + key + '=' + this.searchCabsParams()[key]
          : url + '&' + key + '=' + this.searchCabsParams()[key]
      }, baseUrl + this.getServiceType().route)
      console.log('urlWithParams', urlWithParams);
      setTimeout(() => {
          window.open(encodeURI(urlWithParams), '_blank');
      });
    }
  }

  // ---------CURRENT GEO LOCATION LOGIC---------

  toggleCurrentLocSelected (hide) {
    if (this.currentLocPointer.classList.contains('selected') || hide){
      this.currentLocPointer.classList.remove('selected');
      this.isCurrentLocationSelected = false;
    } else {
      this.currentLocPointer.classList.add('selected');
      this.isCurrentLocationSelected = true; 
    }
  }

  async setCurrentLocationCallback () {
    this.toggleCurrentLocSelected();
    this.hideCustomError();
    if(this.isCurrentLocationSelected) {
      this.showLoader();
      this.getCurrentLocation(async (val) => {
        let currLoc = await this.ReverseGeocode(val.lat, val.lng);
        this.currentLocationInput.value = currLoc;
        console.log('current location:', val);
        this.booking.fromLocation.lat = val.lat;
        this.booking.fromLocation.lng = val.lng;
        this.booking.fromLocation.formattedAddress = "";
        this.hideLoader();
        if (this.activeTab === 'Rental') {
          this.renderPackageInput(val.lat, val.lng);
        }
      });
    } else {
      this.currentLocationInput.value = '';
    }
  }

  getCurrentLocation (callback) {
    const options = {
      enableHighAccuracy: false,
      timeout: 5000,
      maximumAge: Infinity
    };
    
    function success(pos, callback) {
      this.isLocationError = false;
      const crd = pos.coords;
      this.currentCordinates = {
        lat: crd.latitude,
        lng: crd.longitude
      }
      callback(this.currentCordinates);
    }

    let that = this;
    
    function error(err) {
      that.hideLoader();
      that.resetPackages();
      that.isLocationError = true;
      if(err.code != 3) {
        that.customError(ENABLE_LOC_PERM_COMM);
        that.toggleCurrentLocSelected(true); 
      }
      console.warn(`ERROR(${err.code}): ${err.message}`);
    }
    
    navigator.geolocation.getCurrentPosition(async (pos) => {
      success.call(this, pos, callback);
    }, error, options);
  }

  // ---------NAVIGATION TABS LOGIC--------


  renderWidgetInputs (type = "") {
    const destinationElement = this.root.getElementById('destination-input');
    const packagesInputElement = this.root.getElementById('select-package-input');
    const searchButton = this.root.getElementById('search-btn');
    this.show(destinationElement);
    this.hide(packagesInputElement);
    this.closeDropDown();
    if(type == "INIT") {
      this.toggleCurrentLocSelected(true);
      this.destinationInput.value = null;
      this.currentLocationInput.value = null;
      this.clearBookingDetails();
    }
    this.hideCustomError();

    switch (this.activeTab) {
      case 'Rental': {
        this.hide(destinationElement);
        this.show(packagesInputElement);
        searchButton.innerHTML = 'RENTAL CABS';
        break;
      }
      case 'Daily': {
        searchButton.innerHTML = 'OLA CABS';
        break;
      }
      case 'Outstation': {
        searchButton.innerHTML = 'OUTSTATION CABS';
        break;
      }
      default: {
        searchButton.innerHTML = 'OLA CABS';
        break;
      } 
    }
  }

  renderTabs() {
    this.tabContainer.innerHTML = '';
    this.tabItems.forEach((item, index) => {
      const tabItem = document.createElement("div");
      tabItem.classList.add("tab-item");
      if (index === 0 && !this.activeTab) {
        tabItem.classList.add("active");
        this.activeTab = item;
      }
      tabItem.textContent = item;
      tabItem.setAttribute("data-tab", item);
      this.tabContainer.append(tabItem);
    });
    this.tabContainer.classList.add("event-elem");
    this.tabContainer.setAttribute("event-name", "desktop_booking_widget_" + this.activeTab.toLocaleLowerCase());
    this.renderWidgetInputs("INIT");
    this.attachEvent(this.tabContainer, 'click', this.setActiveTab.bind(this));
  }

  setActiveTab(event) {
    const tabName = event.target.dataset['tab'];
    if (tabName && this.activeTab !== tabName) {
      Array.from(this.tabContainer.children).forEach(child => child.classList.remove("active"));
      this.activeTab = tabName;
      event.target.classList.add("active");
    }
    if(this.activeTab == "Rental") {
      // Remove line for rental
      if(window.innerWidth < 910) {
        this.root.getElementById('current-location').classList.add('rental-no-line');
      }
    } else {
      if(window.innerWidth < 910) {
        this.root.getElementById('current-location').classList.remove('rental-no-line');
      }
    }
    this.tabContainer.setAttribute("event-name", "desktop_booking_widget_" + this.activeTab.toLocaleLowerCase());
    this.searchButton = this.root.getElementById('search-cabs').querySelector('button');
    this.searchButton.setAttribute("event-name", "desktop_booking_widget_" + this.activeTab.toLocaleLowerCase() + "_search")
    this.renderWidgetInputs();
  }

  // --------PACKAGE SELECT FOR RENTALS LOGIC-------
  
  isSelectPackageElement (elm) {
    return elm.closest('#select-package-input');
  }

  isPackagesPresent(packages) {
    return packages && Object.keys(packages).length > 0 && !packages.hasOwnProperty('data');
  }

  async renderPackageInput (lat, lng) {
    this.showLoader();
    this.packages = await this.GetPackageList(lat, lng) || {};
    this.hideLoader();
    if(!this.isPackagesPresent(this.packages)) {
      this.resetPackages();
      this.openSnackBar(NO_PACKAGES_FOUND);
    }
  }

  packageInputCallback () {
    this.listElement = this.listElementPackage;
    if(this.isPackagesPresent(this.packages) && this.currentLocationInput.value){
      this.openDropDown();
      this.populatePackagesList(this.packages)
    } else if(!this.currentLocationInput.value) {
      this.customError(SELECT_LOC_COMM);
    } else {
      this.openSnackBar(NO_PACKAGES_FOUND);
    }
  }

  resetPackages() {
    this.listElementPackage.innerHTML = null;
    this.selectPackageInput.innerHTML = "Select Package";
  }

  populatePackagesList (list) {
    this.listElement.innerHTML = Object.keys(list).reduce((acc, key) => acc + `<li class="text" id="${key}">${list[key].description}</li>`, '');
  }

  selectPackage (e) {
    let target = e.target;
    this.packageSelected = target.innerHTML;
    this.selectPackageInput.innerHTML = this.packageSelected;
    this.booking.selectedPackage = target.getAttribute("id");
    this.closeDropDown();
  }

  // -------LOCATION INPUT LOGIG--------

  clearBookingDetails () {
    this.booking = {
      fromLocation: {
        lat: '',
        lng: '',
        formattedAddress: ''
      },
      toLocation: {
        lat: '',
        lng: '',
        formattedAddress: ''
      },
      selectedPackage: ''
    }
  }

  async locationInputCallback (elem, type) {
    if(!elem.value) {
      if(type === PICKUP) {
        this.currentLocationInput.value = '';
        this.booking.fromLocation.lat = '';
        this.booking.fromLocation.lng = '';
      } else if(type === DROP) {
        this.destinationInput.value = '';
        this.booking.toLocation.lat = '';
        this.booking.toLocation.lng = '';
      }
      this.resetPackages();
    }

    this.currentLocPointer.classList.remove('selected');
    this.listElement = type === DROP ? this.listElementDestLoc : this.listElementCurrLoc;
    let query = elem.value;
    if (query) {
      let places = await this.fetchAutocomplete(type, query)
      this.openDropDown();
      this.populateList(places, type);
    } else {
      this.closeDropDown();
    }
  }

  populateList (list) {
    if(this.listElement) {
      this.listElement.innerHTML = list.reduce((acc, item) => acc + `<li class="text" id="${item.placeId}">${item.name}, ${item.address}</li>`, '');
    }
  }

  async selectLocation (e, type) {
    this.closeDropDown();
    let target = e.target;
    let placeId = target.getAttribute("id");
    this.showLoader();
    let placeData = await this.GetPlace(placeId);
    this.hideLoader();
    if (type === DROP) {
      this.booking.toLocation.lat = placeData.lat;
      this.booking.toLocation.lng = placeData.lng;
      this.booking.toLocation.formattedAddress = placeData.formattedAddress;
      this.destinationInput.value = placeData.formattedAddress;
    } else {
      this.booking.fromLocation.lat = placeData.lat;
      this.booking.fromLocation.lng = placeData.lng;
      this.booking.fromLocation.formattedAddress = placeData.formattedAddress;
      this.currentLocationInput.value = placeData.formattedAddress;
      if (this.activeTab === 'Rental') {
        this.hideCustomError();
        this.renderPackageInput(placeData.lat, placeData.lng);
      }
    }
  }

  async fetchAutocomplete (locationType, query, lat = "", lng = "") {
    return await this.LocationAutoComplete({
      query: query,
      lat: lat,
      lng: lng,
      serviceType: '',
      tag: locationType
    });
  }


  // -------UTILS FUNCTIONS-------

  openSnackBar(content) {
    const snackbar = document.querySelector("#snackbar");
    snackbar.innerHTML = content;
    snackbar.style.display = "block";
    snackbar.classList.remove('fade');
    setTimeout(() => {
      snackbar.classList.add('fade');
    }, 2000);
  }

  debounce (func, timeout = 300) {
    let timer;
    return (...args) => {
      clearTimeout(timer);
      timer = setTimeout(() => { func.apply(this, args) }, timeout);
    };
  }

  attachEvent(elem, event, callback) {
    elem && elem.addEventListener(event, callback);
  }

  removeEvent(elem, event, callback) {
    elem && elem.removeEventListener(event, callback);
  }

  closeDropDown () {
    this.listElement && this.listElement.classList.add('close');
    this.listElement = null;
  }

  openDropDown () {
    this.listElement && this.listElement.classList.remove('close');
  }

  hideLoader () {
    this.loader.classList.remove('show');
  }

  showLoader () {
    this.loader.classList.add('show');
  }

  hide (elm) {
    elm.classList.add('hide');
  }

  show (elm) {
    elm.classList.remove('hide');
  }

  customError (message) {
    this.errorElem && this.errorElem.classList.remove('hide');
    let messageElem = this.errorElem.getElementsByTagName('p')[0];
    messageElem.textContent = message;
  }

  hideCustomError () {
    this.errorElem && this.errorElem.classList.add('hide');
  }
}

customElements.define('booking-widget', BookingWidget);