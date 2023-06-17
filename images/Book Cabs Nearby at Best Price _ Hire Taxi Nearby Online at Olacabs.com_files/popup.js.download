const popupTemplate = document.createElement('template');

popupTemplate.innerHTML = `
  <style>
  .popupContainer {
      display: block;
      position: fixed;
      top: 0;
      width: 100vw;
      height: 100vh;
      z-index: 1;
  }
  .backDrop {
      width: 100vw;
      height: 100vh;
      background: rgba(0, 0, 0, 0.2);;
      position: fixed;
      top: 0;
  }
  .frontDrop {
      background: white;
      position:relative;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      width: 100%;
      height: 100%;
      padding: 32px;
  }
  .sloot {
      z-index: 10;
      position: absolute;
  }
  .cross {
    position: absolute;
    color: black;
    right: 16px;
    top: 16px;
    width: 24px;
    cursor: pointer;
  }
  </style>
<section class="outer-wrapper">
<div class="popupContainer">
  <div class="backDrop"></div>
    <div class="frontDrop">
      <slot name="popup" class="sloot"></slot>
      <div class="cross"><img src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/close.svg"/></div>
    </div>
  </div>
</section>
`;

class SectionPopup extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    const shadowRoot = this.attachShadow({ mode: 'open'});
    shadowRoot.appendChild(popupTemplate.content.cloneNode(true));

    let divs = shadowRoot.querySelectorAll("div")
    const popupId = this.getAttribute('id');
    closePopup(popupId)

    divs[1] && divs[1].addEventListener('click', ()=>{
      closePopup(popupId)
    });

    divs[3] && divs[3].addEventListener('click', ()=>{
      closePopup(popupId)
    });

    const width = this.getAttribute('width');
    const height = this.getAttribute('height');

    if(width) {
      divs[2].style.maxWidth = width + 'px'
    }
    if(height) {
      divs[2].style.maxHeight = height + 'px'
    }

  }
}

customElements.define('section-popup', SectionPopup);

function showPopup(appName,popupId) {
  let tmp = document.getElementById(popupId)
  tmp.style.visibility = "visible"
  document.body.style.overflow = "hidden"
}

function closePopup(popupId) {
  document.getElementById(popupId).style.visibility = 'hidden'
  document.body.style.overflow = "auto"
}