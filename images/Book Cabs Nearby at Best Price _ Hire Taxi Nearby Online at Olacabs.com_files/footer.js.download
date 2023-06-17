const footerTemplate = document.createElement('template');
let footerData = {
  icon: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/OLA.svg",
  socialLinks: [
    {icon: 'https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/insta.svg', links: 'https://www.instagram.com/olacabs', event: 'desktop_footer_instagram'},
    {icon: 'https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/youtube.svg', links: 'https://www.youtube.com/user/OfficialOlacabs', event: 'desktop_footer_youtube'},
    {icon: 'https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/twitter.svg', links: 'https://twitter.com/Olacabs', event: 'desktop_footer_twitter'}
  ],
  routeColumn1: [
    {label: 'Book a cab', links: 'https://book.olacabs.com?utm_source=book_now_top_right', event:'desktop_footer_book_now'},
    {label: 'Drive with us', links: 'https://partners.olacabs.com/', event:'desktop_footer_drive_with_ola'},
    {label: 'Outstation', links: '/outstation', event:''},
    {label: 'Rental', links: '/rental', event:''},
    {label: 'Ola Money', links: 'https://www.olamoney.com', event:'desktop_footer_ola_money'},
    {label: 'Corporate', links: 'https://corporate.olacabs.com', event:'desktop_footer_ola_corporate'}
  ],
  routeColumn2: [
    {label: 'About Us', links: '/about', event:'desktop_footer_about_us'},
    {label: 'Contact Us', links: '/contact', event:'desktop_footer_contact_us'},
    {label: 'Support', links: 'https://help.olacabs.com/support', event:'desktop_footer_support'},
    {label: 'Careers', links: '/careers', event:'desktop_footer_careers'},
    {label: 'Media Centre', links: 'https://www.olacabs.com/media', event:'desktop_footer_media_centre'}
  ],
  routeColumn3: [
    {label: 'Ola S1', links: 'https://olaelectric.com/s1?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB', event:'desktop_footer_ola_s1'},
    {label: 'Futurefactory', links: 'https://olaelectric.com/future-factory?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB', event:'desktop_footer_ola_future_factory'},
    {label: 'Electric', links: 'https://olaelectric.com/?utm_source=Olacabs&utm_medium=CLM&utm_campaign=HHB/', event:'desktop_footer_ola_electric'}
  ],
  subscribe:{
    label: 'Stay upto date',
    placeholder: 'Enter your email',
    cta: 'SUBSCRIBE TO  NEWSLETTER',
    image: 'https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/right.svg'
  },
  copyright: {
    description: "Copyright © 2022 Ola Electric Mobility Pvt Ltd. All Rights Reserved.",
    internalLinks: [
      {label: 'Notices', links: 'https://www.olacabs.com/info/faqs#notices', event: 'desktop_footer_notices'},
      {label: 'Privacy Policy', links: 'https://www.olacabs.com/info/faqs#privacyPolicy', event: 'desktop_footer_privacy_policy'},
      {label: 'Terms of Service', links: 'https://www.olacabs.com/info/faqs#termsAndConditions', event: 'desktop_footer_tncs'}],
    externalLinks: [
      {label: 'India', links: '/'},
      {label: 'AU', links: '/au'},
      {label: 'UK', links: '/gb'},
      {label: 'NZ', links: '/nz'}
    ]
  }
};
footerTemplate.innerHTML += `
  <style>
    .footerContainer{
      background: #F2F4F6;
      clip-path: polygon(0 11%, 100% 0%, 100% 100%, 0 100%);
    }
    .footerTopContainer{
      max-width: 980px;
      margin: 0 auto;
      padding: 106px 20px 20px;
    } 
    .socialContainer{
      display: flex;
      justify-content: space-between;
    }
    .socialContainer a{
      text-decoration:none;
      font-weight: 400;
      font-size: 16px;
      line-height: 22px;
      color: #000000;
    }
    .social_links{
      display: flex;
      justify-content: space-between;
    }
    .social_links a{
      padding: 24px 30px 0 0;
    }
    .subscribeContainer{
      float: right;
    }
    .subscribeContainer, .inputContainer{
      width: 296px;
    }
    .inputContainer input {
      font-family: Gentona;
      font-weight: 400;
      font-size: 18px;
      line-height: 140%;
      letter-spacing: -.01em;
      color: #707070;
      background: #fff;
      border: 1.5px solid #e0e0e0;
      padding: 16px;
      width: 261px;
    }
    .btnContainer {
      cursor: pointer;
      background: radial-gradient(127.68% 2996.56% at 12.65% 127.68%,#000 0,#222 100%);
      box-shadow: -3px 3px 0 #32c86e;
      padding: 18px;
      margin: 20px 0;
    }
    .title{
      padding-bottom: 12px;
      margin: 0;
      font-style: italic;
      font-weight: 500;
      font-size: 16px;
      line-height: 22px;
    }
    .btnContainer p {
      font-weight: 500;
      font-size: 17px;
      line-height: 20px;
      color: #fff;
      margin: 0;
    }
    .btnContainer img {
      float: right;
    }
    .txGreen{
      color: #32C86E;
    }
    ol, ul {
      list-style: none;
      padding: 0;
      margin: 0;
    }
    .routeContainer li {
      font-weight: 400;
      font-size: 16px;
      line-height: 22px;
      padding: 0 48px 12px 0;
    }
    .divider{
      border-bottom: 1px solid #E0E0E0;
    }
    .footerBottomContainer{
      max-width: 980px;
      margin: 0 auto;
      padding: 24px 0;
      display: flex;
      justify-content: space-between;
    }
    .footerBottomContainer .desc{
      font-style: normal;
      font-weight: 400;
      font-size: 12px;
      line-height: 120%;
      color: #000000;
      opacity: 0.3;
    }
    .otherlinks ul li{
      display: inline;
      padding: 0 20px;
    }
    .otherlinks a{
      font-weight: 400;
      font-size: 14px;
      line-height: 20px;
      text-decoration-line: underline;
      color: #000000;
      opacity: 0.4;
    }
    #successMsg{
      color: green;
    }
    #errorMsg{
      color: red;
    }
    .web{
      display: block;
    }
    .mob{
      display: none;
    }
    .country-select {
      position: relative;
      cursor: pointer;
      margin-top: 2px;
    }
    .country-select .selected{
      font-weight: 400;
      font-size: 14px;
      line-height: 120%;
      color: #49494A;
    }
    .country-select .select {
      padding: 0 10px;
      width: 42px;
      position: relative;
      line-height: 34px;
    }
    .country-select .select .down-icon {
      position: absolute;
      right: 5px;
      top: 50%;
      -webkit-transform: translateY(-50%);
              transform: translateY(-50%);
      pointer-events: none;
    }    
    .country-select .select-options {
      list-style: none;
      margin: 0;
      padding: 0;
      background: #FFFFFF;
      position: absolute;
      right: 0;
      width: 100px;
      top: -100px;
      z-index: 2;
      box-shadow: 0px 0px 1px rgba(0, 0, 0, 0.24), 0px 8px 16px rgba(0, 0, 0, 0.12);
    }
    .country-select .select-options li {
      color: #000000;
      font-weight: 300;
      cursor: pointer;
      padding: 6px 16px;
      font-weight: 400;
      font-size: 16px;
      line-height: 22px;
      display: block;
    }
    .country-select .select-options li a {
      color: #000000;
      opacity: 1;
      display: block;
      margin: 0;
      text-decoration: none;
    }
    #india-selected, .country-select .select-options li:hover, .country-select .select-options li a:hover {
      color: #16AA51;
    }
    .pull-right {
      float: right;
      display: inline-block;
      vertical-align: middle;
    }
    .hide {
      display: none !important;
    }
    @media only screen and (max-width: 768px){
      .footerContainer {
        clip-path: none;
      }
      .subscribeContainer {
        float: none;
      }
      .subscribeContainer .title {
        padding-bottom: 24px;
        margin: 0;
        font-style: normal;
        font-weight: 500;
        font-size: 32px;
        line-height: 32px;
        letter-spacing: -0.02em;
        color: #000000;
        text-shadow: 1.152px 1.152px 0px #FFFFFF, 1.728px 1.728px 0px #92C83E;
      }
      .btnContainer p {
        font-style: italic;
      }
      .socialContainer, .footerBottomContainer {
        display: block;
        justify-content: normal;
      }
      .footerTopContainer {
        max-width: 100%;
        margin: 0 auto;
        padding: 48px 16px 16px;
      }
      .subscribeContainer, .inputContainer{
        width: 100%;
      }
      .inputContainer input {
        width: 90%;
      }
      .btnContainer {
        margin: 16px 0 40px;
      }
      .web{
        display: none !important;
      }
      .mob{
        display: block;
      }
      .routeContainer{
        margin-bottom: 36px;
      }
      .routeContainer li {
        font-weight: 400;
        font-size: 16px;
        line-height: 22px;
        padding: 12px 0;
        border-bottom: 0.5px solid #E0E0E0;
      }
      .footerBottomContainer {
        max-width: 100%;
        margin: 0 auto;
        padding: 4px 0;
      }
      .otherlinks ul li {
        padding: 0 16px;
      }
      .footerBottomContainer .desc {
        padding: 24px 16px 40px;
        font-size: 12px;
        line-height: 120%;
        color: #000000;
        opacity: 0.4;
      }
      .socialMobContainer{
        padding: 18px 16px 0;
        display: flex;
        justify-content: space-between;
      }
      .footerIcon{
        width: 40px;
      }
      .social_links a {
        padding: 6px 15px 0 15px;
      }
      .country-select {
        margin-top: 6px;
      }
      .country-select .select-options {
        top: -30px;
      }
    }
  </style>
  <footer class="ola-footer">
    <div class="footerContainer" id="footerContainer">
      <div class="footerTopContainer">
        <div class="subscribeContainer">
          <p class="title">`+footerData.subscribe.label+`</p>
          <div class="inputContainer">
            <input type="email" name="email" placeholder="`+footerData.subscribe.placeholder+`" value="" id="emailInput">
          </div>
          <div id="successMsg"></div>
          <div id="errorMsg"></div>
          <div class="btnContainer" id="subscribe">
            <p>SUBSCRIBE TO <span class="txGreen">NEWSLETTER</span> <img src="`+footerData.subscribe.image+`"> </p>
          </div>
        </div>
        <div class="socialContainer">
          <div class="web">
            <img src="`+footerData.icon+`" alt="OLA"/>
            <div class="social_links">
              <a href="`+footerData.socialLinks[0].links+`" event-name="`+footerData.socialLinks[0].event+`" class="event-elem" target="_blank"><img src="`+footerData.socialLinks[0].icon+`"></a>
              <a href="`+footerData.socialLinks[1].links+`" event-name="`+footerData.socialLinks[1].event+`" class="event-elem" target="_blank"><img src="`+footerData.socialLinks[1].icon+`"></a>
              <a href="`+footerData.socialLinks[2].links+`" event-name="`+footerData.socialLinks[2].event+`" class="event-elem" target="_blank"><img src="`+footerData.socialLinks[2].icon+`"></a>
            </div>
          </div>
          <div class="routeContainer"><ul>
            <li><a href="`+footerData.routeColumn1[0].links+`" event-name="`+footerData.routeColumn1[0].event+`" class="event-elem">`+footerData.routeColumn1[0].label+`</a></li>
            <li><a href="`+footerData.routeColumn1[1].links+`" event-name="`+footerData.routeColumn1[1].event+`" class="event-elem">`+footerData.routeColumn1[1].label+`</a></li>
            <li><a href="`+footerData.routeColumn1[2].links+`" event-name="`+footerData.routeColumn1[2].event+`" class="event-elem">`+footerData.routeColumn1[2].label+`</a></li>
            <li><a href="`+footerData.routeColumn1[3].links+`" event-name="`+footerData.routeColumn1[3].event+`" class="event-elem">`+footerData.routeColumn1[3].label+`</a></li>
            <li><a href="`+footerData.routeColumn1[4].links+`" event-name="`+footerData.routeColumn1[4].event+`" class="event-elem">`+footerData.routeColumn1[4].label+`</a></li>
            <li><a href="`+footerData.routeColumn1[5].links+`" event-name="`+footerData.routeColumn1[5].event+`" class="event-elem">`+footerData.routeColumn1[5].label+`</a></li>
          </ul></div>
          <div class="routeContainer"><ul>
            <li><a href="`+footerData.routeColumn2[0].links+`" event-name="`+footerData.routeColumn2[0].event+`" class="event-elem">`+footerData.routeColumn2[0].label+`</a></li>
            <li><a href="`+footerData.routeColumn2[1].links+`" event-name="`+footerData.routeColumn2[1].event+`" class="event-elem">`+footerData.routeColumn2[1].label+`</a></li>
            <li><a href="`+footerData.routeColumn2[2].links+`" event-name="`+footerData.routeColumn2[2].event+`" class="event-elem">`+footerData.routeColumn2[2].label+`</a></li>
            <li><a href="`+footerData.routeColumn2[3].links+`" event-name="`+footerData.routeColumn2[3].event+`" class="event-elem">`+footerData.routeColumn2[3].label+`</a></li>
            <li><a href="`+footerData.routeColumn2[4].links+`" event-name="`+footerData.routeColumn2[4].event+`" class="event-elem">`+footerData.routeColumn2[4].label+`</a></li>
          </ul></div>
          <div class="routeContainer"><ul>
            <li><a href="`+footerData.routeColumn3[0].links+`" event-name="`+footerData.routeColumn3[0].event+`" class="event-elem">`+footerData.routeColumn3[0].label+`</a></li>
            <li><a href="`+footerData.routeColumn3[1].links+`" event-name="`+footerData.routeColumn3[1].event+`" class="event-elem">`+footerData.routeColumn3[1].label+`</a></li>
            <li><a href="`+footerData.routeColumn3[2].links+`" event-name="`+footerData.routeColumn3[2].event+`" class="event-elem">`+footerData.routeColumn3[2].label+`</a></li>
          </ul></div>
        </div>
      </div>

      <div class="divider web"></div>

      <div class="footerBottomContainer">
        <div class="desc web">
          `+footerData.copyright.description+`
        </div>
        <div class="otherlinks">
          <ul>
            <li><a href="`+footerData.copyright.internalLinks[0].links+`" event-name="`+footerData.copyright.internalLinks[0].event+`" class="event-elem">`+footerData.copyright.internalLinks[0].label+`</a></li>
            <li><a href="`+footerData.copyright.internalLinks[1].links+`" event-name="`+footerData.copyright.internalLinks[1].event+`" class="event-elem">`+footerData.copyright.internalLinks[1].label+`</a></li>
            <li><a href="`+footerData.copyright.internalLinks[2].links+`" event-name="`+footerData.copyright.internalLinks[2].event+`" class="event-elem">`+footerData.copyright.internalLinks[2].label+`</a></li>
            <li class="web">
              <div class="pull-right">
                <div class="country-select" id="country-select">
                  <div class="select">
                    <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/down-arrow.svg" class="down-icon"/>
                    <div class="selected"> India</div>
                  </div>
                  <ul class="select-options country-options hide" id="country-options">
                    <li id="india-selected">India</li>
                    <li><a href="/au">AU</a></li>
                    <li><a href="/gb">UK</a></li>
                    <li><a href="/nz">NZ</a></li>
                  </ul>
                </div>
              </div>
            </li>
          </ul>
        </div>
        <div class="mob socialMobContainer">
          <img src="`+footerData.icon+`" alt="OLA" class="footerIcon"/>
          <div class="social_links">
            <a href="`+footerData.socialLinks[0].links+`" event-name="`+footerData.socialLinks[0].event+`" class="event-elem" target="_blank"><img src="`+footerData.socialLinks[0].icon+`"></a>
            <a href="`+footerData.socialLinks[1].links+`" event-name="`+footerData.socialLinks[1].event+`" class="event-elem" target="_blank"><img src="`+footerData.socialLinks[1].icon+`"></a>
            <a href="`+footerData.socialLinks[2].links+`" event-name="`+footerData.socialLinks[2].event+`" class="event-elem" target="_blank"><img src="`+footerData.socialLinks[2].icon+`"></a>
          </div>
          <div class="pull-right">
            <div class="country-select" id="country-select-mob">
              <div class="select">
                <img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/down-arrow.svg" class="down-icon"/>
                <div class="selected"> India</div>
              </div>
              <ul class="select-options country-options hide" id="country-options-mob">
                <li>India</li>
                <li><a href="/au">AU</a></li>
                <li><a href="/gb">UK</a></li>
                <li><a href="/nz">NZ</a></li>
              </ul>
            </div>
          </div>
        </div>
        <div class="desc mob">
          `+footerData.copyright.description+`
        </div>
      </div>
    </div>    
  </footer> 
`;
class Footer extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    const shadowRoot = this.attachShadow({ mode: 'closed' });
    shadowRoot.appendChild(footerTemplate.content);

    // to call all the events of this component
    shadowRoot.querySelectorAll(".event-elem").forEach((a) => a.addEventListener("click", () => window.callCustomEvents(a)))

    this.err = shadowRoot.getElementById('errorMsg');
    this.success = shadowRoot.getElementById('successMsg');

    let subscribeEvent = shadowRoot.getElementById("subscribe");
    subscribeEvent.addEventListener('click', ()=>{
      subscribe(shadowRoot.getElementById('emailInput').value, this.err, this.success)
    });

    let contryEvent = shadowRoot.getElementById("country-select");
    let countryOptions = shadowRoot.getElementById("country-options");
    contryEvent.addEventListener('click', ()=>{
      countryOptions.classList.remove("hide");
    });

    let contryEventMob = shadowRoot.getElementById("country-select-mob");
    let countryOptionsMob = shadowRoot.getElementById("country-options-mob");
    contryEventMob.addEventListener('click', ()=>{
      countryOptionsMob.classList.remove("hide");
    });

    let footerEvent = shadowRoot.getElementById("footerContainer");
    footerEvent.addEventListener('mouseup', ()=>{
      countryOptions.classList.add("hide");
      countryOptionsMob.classList.add("hide");
    });
  }
}

function subscribe(email, errmsg, successmsg) {
  if(email == '' || email == null || !this.validateEmail(email)){
    errmsg.innerHTML = ""
    successmsg.innerHTML = ""
    errmsg.innerHTML = "Please enter valid email address.";
    return;
  }
  let url = "/subscribe";
  let paylaod = {
      "email": email,
  }  
  $.ajax({
      type: 'POST',
      url: url,
      data: {data:JSON.stringify(paylaod)},
      dataType: 'json',
      headers : {
        'csrf-token': this.rxReadCookie("XSRF-TOKEN"),
      },
      success: function(data){
        if(data.status=='failure'){
          errmsg.innerHTML = data.data.displayMessage;
          successmsg.innerHTML ="";
        }else{
          errmsg.innerHTML = "";
          successmsg.innerHTML ="Thank you.";
        }
      },
      error: function(xhr, status, error){
        successmsg.innerHTML = ""
        errmsg.innerHTML = "Something went wrong. Please try after some time.";
        console.log(xhr.statusText);
        console.log(xhr.status);
      }
  });

};
function rxReadCookie(cName) {
  let rslt = new RegExp(cName + "=([^;]+)\\;?", "i").exec(document.cookie ? unescape(document.cookie) : "");
  return rslt ? rslt[1] : "";
}
function validateEmail(email) {
    var re = /\S+@\S+\.\S+/;
    return re.test(email);
}
customElements.define('footer-component', Footer);