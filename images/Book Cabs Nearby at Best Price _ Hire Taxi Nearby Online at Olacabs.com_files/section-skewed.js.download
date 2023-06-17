const sectionTemplate = document.createElement('template');

sectionTemplate.innerHTML = `
  <style>
  .outer-wrapper {
    width: 100%;
    min-height: 200px;
  }

  .outer-wrapper.end {
    padding-top: 0;
    padding-bottom: 0;
    clip-path: polygon(0 0, 100% 0, 100% 80%, 0% 100%) !important;
  }

  .outer-wrapper.start {
    padding-top: 0;
    padding-bottom: 0;
    clip-path: polygon(0 20%, 100% 0, 100% 100%, 0% 100%) !important;
  }

  .outer-wrapper.both {
    padding-top: 0;
    padding-bottom: 0;
    clip-path: none !important;
    transform: skewY(-2deg);
  }

  @media only screen and (max-width: 834px) {
    .outer-wrapper.start {
      clip-path: polygon(0 6%, 100% 0, 100% 100%, 0% 100%) !important;
    }
    .outer-wrapper.end {
      clip-path: polygon(0 0, 100% 0, 100% 94%, 0% 100%) !important;
    }
  }
  </style>
<section class="outer-wrapper">
  <slot name="outer-wrapper-children"></slot>
</section>
`;

class SectionSkewed extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    const shadowRoot = this.attachShadow({ mode: 'open'});
    shadowRoot.appendChild(sectionTemplate.content.cloneNode(true));
    const typeOfSkew = this.getAttribute('skew');
    const background = this.getAttribute('background');
    const name = this.getAttribute('name');
    const skewedSection = shadowRoot.querySelector('section');
    if(typeOfSkew){
      skewedSection.classList.add(typeOfSkew);
    }
    if(background) {
      skewedSection.style.background = background;
    }
    if(skewedSection.classList.contains('both')) {
      skewedSection.querySelector('slot').assignedNodes()[0].classList.add('skew-reset');
    }
    if(name == 'header' && window.innerWidth <= 576) {
      skewedSection.classList.remove('outer-wrapper');
    }
  }
}

customElements.define('section-skewed', SectionSkewed);
