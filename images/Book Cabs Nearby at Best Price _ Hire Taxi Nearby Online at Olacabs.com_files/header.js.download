const headerTemplate = document.createElement('template');

headerTemplate.innerHTML = `
  <header class="ola-header-sticky">
    <div id="header" class="secondary-header">
      <div class="max-width">
        <div class="pull-left pd-16">
          <div class="navbar-mb">
            <div class="ola-logo">
              <div class="display-flex">
                <a href="" class="event-elem" event-name="desktop_header_ola_logo">
                  <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/ola-white-logo.svg" />
                </a>
              </div>
            </div>
            <div class="pull-right">
              <a id="desktop_top_menu_ola_s1" event-name="desktop_top_menu_ola_s1" class="navbar-new-option event-elem" href="https://olaelectric.com/s1?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB" translation-key="ola_s1">Ola S1</a>
              <a id="desktop_top_menu_ola_electric" event-name="desktop_top_menu_ola_electric" class="navbar-new-option event-elem" href="https://olaelectric.com?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB" translation-key="ola_electric">Ola Electric</a>
              <a id="desktop_top_menu_ola_future_factory" event-name="desktop_top_menu_ola_future_factory" class="navbar-new-option event-elem" href="https://olaelectric.com/future-factory?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB" translation-key="ola_futurefactory">Ola Futurefactory</a>
            </div>
          </div>
        </div>
        <div>
          <a id="desktop_top_menu_book_now" event-name="desktop_top_menu_book_now" href="https://book.olacabs.com?utm_source=book_now_top_right" class="event-elem book-cab" translation-key="book_ola_cab">Book an Ola Cab</a>
          <a id="desktop_top_menu_free_s1_test_ride_oc_header" event-name="desktop_top_menu_free_s1_test_ride_oc_header" class="event-elem test-ride" href="https://tr.olaelectric.com/trInfo?utm_source=Olacabs&utm_medium=CLM&utm_campaign=Header" translation-key="free_s1_tr">Free S1 Test Ride</a>
          <button class="hamburger event-elem">
            <img class="hamburger-mb" src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/Hamburger.svg"/>
          </button>
        </div>
        <div class="clearfix"></div>
      </div>
    </div>
    <!-- Desktop Hamburger Menu Options -->
    <div id="sidebar_nav" class="sidebar_navigation hide-xs">
      <div class="close_btn cross" id="hamburger_close"><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/close.svg"/></div>
      <div class="clearfix"></div>
      <div class="option-wrapper">
        <ul class="ui-menu-options">
            <li><a id="desktop_side_nav_book_now" event-name="desktop_side_nav_book_now" class="event-elem li-menu-options " href="https://book.olacabs.com?utm_source=book_now_top_right">Book an Ola Cab</a></li>
            <li><a id="desktop_side_nav_drive_with_ola" event-name="desktop_side_nav_drive_with_ola" class="event-elem li-menu-options " href="https://partners.olacabs.com/">Drive with Ola</a></li>
            <li><a id="desktop_side_nav_ola_s1" event-name="desktop_side_nav_ola_s1" class="event-elem li-menu-options " href="https://olaelectric.com/s1?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB">Ola S1</a></li>
            <li><a id="desktop_side_nav_ola_electric" event-name="desktop_side_nav_ola_electric" class="event-elem li-menu-options " href="https://olaelectric.com?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB">Ola Electric</a></li>
            <li><a id="desktop_side_nav_ola_future_factory" event-name="desktop_side_nav_ola_future_factory" class="event-elem li-menu-options " href="https://olaelectric.com/future-factory?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB">Ola FutureFactory</a></li>
            <li><a id="desktop_side_nav_ola_corporate" event-name="desktop_side_nav_ola_corporate" class="event-elem li-menu-options " href="https://corporate.olacabs.com">Ola Corporate</a></li>
            <li><a id="desktop_side_nav_ola_foundation" event-name="desktop_side_nav_ola_foundation" class="event-elem li-menu-options " href="https://ola.foundation/">Ola Foundation</a></li>
            <li><a id="desktop_side_nav_support" event-name="desktop_side_nav_support" class="event-elem li-menu-options " href="https://help.olacabs.com/support">Support</a></li>
        </ul>
      </div>
      <div class="fix-bottom">
          <a class="offers-banner-mb event-elem" event-name="desktop_feed_card_free_s1_test_ride" onclick="window.open('https://tr.olaelectric.com', '_blank');return false;">
            <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/pink-banner-mob.png" class="cursor-pointer" height="100%" width="100%"/>
          </a>
          <div class="bottom-div">
            <a href="/careers" class="bottom-options event-elem" event-name="desktop_navbar_careers">Careers</a>
            <a href="https://www.olacabs.com/info/faqs#notices" class="bottom-options event-elem" event-name="desktop_navbar_notices">Notices</a>
            <a href="https://www.olacabs.com/info/faqs#privacyPolicy" class="bottom-options event-elem" event-name="desktop_navbar_privacy">Privacy</a>
            <a href="https://www.olacabs.com/info/faqs#termsAndConditions" class="bottom-options event-elem" event-name="desktop_navbar_tnc">T&C</a>
          </div>
          <div class="bottom-div">
            <div>
              <a href="" class="event-elem" event-name="desktop_navbar_ola_logo"><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/OLA-black.svg"/></a>
            </div>
            <div>
              <a href="https://www.instagram.com/olacabs" target="_blank" class="event-elem" event-name="desktop_navbar_instagram"><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/instagram-icon.svg" class="mL-26"></a>
              <a href="https://www.youtube.com/user/OfficialOlacabs" target="_blank" class="event-elem" event-name="desktop_navbar_youtube"><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/youtube-icon.svg" class="mL-26"></a>
              <a href="https://twitter.com/Olacabs" target="_blank" class="event-elem" event-name="desktop_navbar_twitter"><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/twitter-icon.svg" class="mL-26"></a>
            </div>
          </div>
        </div>
    </div>
    <div class="body-overlay overlay-hide">
  </header>
  <style>
    .fix-bottom {
      bottom: 0;
      position: absolute;
      width: 100%;
    }
    .clearfix {
      clear: both;
    }
    .hide-xs {
      display: none;
    }
    .display-flex {
      display: flex !important;
    }
    .pd-16 {
      padding: 16px 0px;
    }
    .mL-26 {
      margin-left: 26px;
    }
    .pull-right {
      float: right;
    }
    .pull-left {
      float: left !important;
    }
    .ola-header-sticky {
      position: fixed;
      z-index: 99;
      width: 100%;
      top: 0;
      left: 0;
      transition: all 0.2s ease;
    }
    .secondary-header {
      background: #000000;
      border-radius: 0px;
      box-shadow: 0px 2px 4px 0px rgb(0 0 0 / 14%);
      overflow: hidden;
      text-align: right;
      z-index: 100;
      height: 64px;
      width: 100%;
    }
    .cursor-pointer {
      cursor: pointer;
    }
    .max-width {
      max-width: 1366px;
      margin: auto;
    }
    .navbar-mb {
      top: 0;
      left: 0;
      right: 0;
      z-index: 1;
      display: flex;
      flex-direction: row;
      justify-content: space-between;
      align-items: center;
    }
    .ola-logo {
      display: flex;
      flex-direction: column;
      justify-content: center;
      margin-right: 40px;
      margin-left: 16px;
    }
    .event-elem {
      text-decoration: none;
      display: inline-block;
      vertical-align: middle;
      cursor: pointer;
    }
    .test-ride {
      color: #000000;
      background: #FFFFFF;
      padding: 14px 12px;
      line-height: 16px;
      margin: 10px;
    }
    .navbar-new-option {
      color: white;
      font-size: 14px;
      font-weight: 500;
      padding: 5px 12px;
    }
    .book-cab {
      color: white;
      background: rgba(255, 255, 255, 0.17);
      padding: 14px 12px;
      line-height: 16px;
      margin: 10px;
    }
    .hamburger {
      padding: 12px;
      background: border-box;
      border: none;
    }
    .menu-icon {
      padding: 12px;
      background: border-box;
      border: none;
    }
    .sidebar_navigation {
      width: 376px;
      position: fixed;
      top: 0;
      background: #FFFFFF;
      height: 100%;
      z-index: 12;
      overflow-x: hidden;
      opacity: 1;
      box-shadow: 0 0 2px 1px rgb(0 0 0 / 20%);
      float: right;
      right: 0px;
    }
    .cross {
      position: absolute;
      color: black;
      right: 0;
      top: 4px;
      width: 24px;
      cursor: pointer;
    }
    .close_btn {
      width: 40px;
      height: 40px;
      font-size: 32px;
      line-height: 40px;
      color: #333;
      float: right;
      cursor: pointer;
      text-align: center;
      margin: 0px 16px;
      position: relative;
    }
    .ui-menu-options {
      list-style: none;
      margin: 0;
      padding: 0;
      text-align: center;
    }
    .li-menu-options {
      width: 100%;
      float: left;
      padding: 15px 0px;
      color: #4A4A4A;
      text-decoration: none;
      font-size: 18px;
      line-height: 22px;
      font-weight: 400;
    }
    .offers-banner-mb {
      margin: 24px;
      margin-bottom: 0;
    }
    .bottom-div {
      display: flex;
      justify-content: space-between;
      margin: 24px;
    }
    .bottom-options {
      color: black;
      opacity: 0.4;
      font-size: 14px;
      font-weight: 400;
      line-height: 140%;
    }
    .option-wrapper {
      display: flex;
      flex-direction: column;
      justify-content: space-between;
      max-height: 65vh;
      overflow: scroll;
    }
    @media only screen and (max-width: 768px){
      .option-wrapper {
        max-height: calc(100vh - 300px);
        overflow-y: scroll;
      }
      .fix-bottom {
        position: fixed;
      }
      .ui-menu-options {
        max-height: 100vh;
        overflow: scroll;
      }
      .secondary-header {
        background: none;
        box-shadow: none;
        border-radius: 0px;
        overflow: hidden;
        text-align: right;
        z-index: 100;
        height: 64px;
        width: 100%;
      }
      .secondary-header-box {
        background: #000000;
        box-shadow: 0px 2px 4px 0px rgb(0 0 0 / 14%);
      }
      .pull-right, .book-cab, .test-ride {
        display: none;
      }
      .ola-logo {
        margin-left: 16px;
      }
      .hamburger {
        height: 32px;
        width: 32px;
        background: white;
        border-radius: 50%;
        margin: 16px;
        padding: 0px;
        position: relative;
      }
      .hamburger-mb {
        filter: invert(100%);
        position: absolute;
        top: 10px;
        left: 8px;
      }
      .sidebar_navigation {
        width: 100%;
      }
    }
    @media only screen and (max-width: 375px){
      .fix-bottom {
        position: inherit;
      }
    }
  </style>
`;

class Header extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    const shadowRoot = this.attachShadow({ mode: 'open' });

    shadowRoot.appendChild(headerTemplate.content);

    // to call all the events of this component
    shadowRoot.querySelectorAll(".event-elem").forEach((a) => a.addEventListener("click", () => window.callCustomEvents(a)))

    // Open Sidebar
    let hamburgerValues = shadowRoot.querySelectorAll(".hamburger");
    hamburgerValues[0] && hamburgerValues[0].addEventListener('click', () => {
      shadowRoot.getElementById("sidebar_nav").style.display = "block"
      document.querySelector("body").style.overflow = 'hidden';
    });

    // Close sidebar
    shadowRoot.getElementById("hamburger_close").addEventListener("click", (e) => {
      if(e.target.nodeName !== 'header'){
        shadowRoot.getElementById("sidebar_nav").style.display = "none";
      }
    });

    // Close sidebar on clicking outside of it
    let body = document.getElementById("main-body");
    body.addEventListener('click', (e) => {
      if(e.target.nodeName !== 'HEADER-COMPONENT'){
        shadowRoot.getElementById("sidebar_nav").style.display = "none";
      }
    });

    document.addEventListener('scroll', () => {
      if(window.scrollY > 203 && shadowRoot.getElementById("header")) {
        shadowRoot.getElementById("header").classList.add("secondary-header-box");
      } else if(shadowRoot.getElementById("header")) {
        shadowRoot.getElementById("header").classList.remove("secondary-header-box");
      };
    });

    // localisation
    document.addEventListener("DOMContentLoaded", () => {
      window.translateTexts(shadowRoot);
    });
  }
}

customElements.define('header-component', Header);