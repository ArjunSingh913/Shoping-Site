const videoTemplate = document.createElement('template');

videoTemplate.innerHTML = `
    <style>
        * {
            box-sizing: border-box;
            margin: 0px;
            padding: 0px;
        }
        #video-wrapper {
            width: 100%;
            height: auto;
        }
    </style>

    <video 
        id="video-wrapper"
        controlsList="nodownload"
        playsinline
        autoplay
        muted
        loop
        >
        <source id="video-element" src="" type="" />
        Your browser does not support the video.
    </video>
`;
class video extends HTMLElement {
    constructor() {
        super();
    }

    connectedCallback() {
        const shadowRoot = this.attachShadow({ mode: 'open' });
        shadowRoot.appendChild(videoTemplate.content.cloneNode(true));

        const height = this.getAttribute('height');
        const width = this.getAttribute('width');
        const poster = this.getAttribute('poster');
        let videoWrapper = shadowRoot.getElementById('video-wrapper');
        if (videoWrapper) {
            videoWrapper.style.width = width;
            videoWrapper.style.height = height;
            if(poster) {
                videoWrapper.setAttribute('poster', poster);
            }
        }
        if(isAppleProduct()) {
            videoWrapper.load(); // fixes issue where videos don't load on ios and safari.
            // https://stackoverflow.com/questions/73882704/video-tag-does-not-work-in-safari-when-using-domparser
        }

        const videoSrc = this.getAttribute('videoSrc') || this.getAttribute('video-src'); 
        const videoType = this.getAttribute('videoType') || this.getAttribute('video-type');
        let videoElm = shadowRoot.getElementById('video-element');
        if (videoElm) {
            videoElm.setAttribute('src', videoSrc);
            videoElm.setAttribute('type', videoType);
        }
    }
}

customElements.define('video-component', video);