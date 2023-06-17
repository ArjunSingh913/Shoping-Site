const storiesTemplate = document.createElement('template');

storiesTemplate.innerHTML = `
    <style>
        * {
            box-sizing: border-box;
            margin: 0px;
            padding: 0px;
        }
        .title {
            font-weight: 500;
            font-size: 48px;
            line-height: 56px;
            letter-spacing: -1px;
            color: #000000;
            text-shadow: 1.152px 1.152px 0px #FFFFFF, 1.728px 1.728px 0px #92C83E;
            margin-bottom: 40px;
        }
        .stories-container {
            display: flex;
            flex-direction: row;
            align-items: center;
        }
        .images-container {
            width: 490px;
            height: auto;
            margin-right: 58px;
            overflow-x: hidden;
        }
        #images-wrapper {
            display: flex;
            flex-direction: row;
            transition-duration: 1s;
        }
        #images-wrapper img {
            width: 490px;
            height: auto;
        }
        .stories-details {
            flex-grow: 1;
        }
        .descriptions-wrapper {
            display: flex;
            flex-direction: row;
            margin-bottom: 32px;
        }
        .progress-bar {
            height: 100%;
            width: 4px;
            background: rgba(22, 170, 81, 0.24);
            margin-right: 32px;
            display: flex;
            background-image: -webkit-linear-gradient(
                top,
                #16AA51 0%,
                #16AA51 50%,
                rgba(22, 170, 81, 0.24) 50.001%,
                rgba(22, 170, 81, 0.24) 100%
            );
            background-repeat: no-repeat;
            background-size: 100% 200%;
            background-color: rgba(22, 170, 81, 0.24);
            background-position: 100% 100%;
            animation-timing-function: linear;
            animation-duration: 5s;
        }
        .progress-bar.active {
            animation-name: Loader;
        }
        @keyframes Loader {
            0% {
                background-position: 100% 100%;
            }
            100% {
                background-position: 100% 0;
            }
        }
        .description {
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: flex-start;
        }
        .header {
            font-weight: 500;
            font-size: 24px;
            line-height: 120%;
            color: #000000;
            margin-bottom: 8px;
        }
        .subheader {
            font-weight: 400;
            font-size: 20px;
            line-height: 120%;
            color: #000000;
            opacity: 0.7;
        }
        @media only screen and (max-width:1024px) {
            .images-container {
                width: 50vw;
            }

            #images-wrapper img {
                width: 50vw;
            }
        }
    </style>

    <div class="stories-container">
        <div>
            <div class="images-container">
                <div id="images-wrapper"></div>
            </div>
        </div>
        <div class="stories-details">
            <p class="title">Making innovations since 2011</p>
            <div id="stories-wrapper"></div>
        </div>
    </div>
`;

class stories extends HTMLElement {
    constructor() {
        super();
    }

    setOpacity = (element) => {
        var op = 0.1;
        element.style.display = 'block';
        var timer = setInterval(function () {
            if (op >= 1){
                clearInterval(timer);
            }
            element.style.opacity = op;
            element.style.filter = 'alpha(opacity=' + op * 100 + ")";
            op += op * 0.1;
        }, 10);
    };

    unsetOpacity = (element) => {
        var op = 1;
        var timer = setInterval(function () {
            if (op <= 0.1){
                clearInterval(timer);
                element.style.display = 'none';
            }
            element.style.opacity = op;
            element.style.filter = 'alpha(opacity=' + op * 100 + ")";
            op -= op * 0.1;
        }, 50);
    };

    connectedCallback() {
        const shadowRoot = this.attachShadow({ mode: 'open' });
        shadowRoot.appendChild(storiesTemplate.content.cloneNode(true));

        let data = [
            {
                videoSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/for-riders.mp4",
                videoType: "video/mp4",
                placeholder: "making-innovations",
                header: "For Riders",
                subheader: "We constantly experiment to come up with industry-first features for our riders that eventually become a norm.",
                type: "video",
                duration: "16000"
            },
            {
                videoSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/for-drivers.mp4",
                videoType: "video/mp4",
                placeholder: "making-innovations",
                header: "For Drivers",
                subheader: "Our drivers get real time stats to help optimize their rides better and earn more, straight from the app.",
                type: "video",
                duration: "16000"
            }
        ];

        let wrapperElm = shadowRoot.getElementById('stories-wrapper');
        let imagesElm = shadowRoot.getElementById('images-wrapper');
        if (wrapperElm) {
            for (let i in data) {
                imagesElm.innerHTML += data[i].type === 'image' ? `<img src="${data[i].imageSrc}" alt="${data[i].placeholder}" />` : `<video-component videoSrc="${data[i].videoSrc}" videoType="${data[i].videoType}" height="auto" width="${window.innerWidth < 1024 ? "50vw" : "490px"}"></video-component>`;
                wrapperElm.innerHTML += `<div class="descriptions-wrapper"><div><div class="progress-bar ${i == 0 ? 'active' : ''}" style="animation-duration: ${data[i].duration/1000 || 5}s" ${i == 0 ? 'active' : ''}" id="progress-bar-${i}"></div></div><div class="description"><p class="header">${data[i].header}</p><p class="subheader">${data[i].subheader}</p></div></div>`;
            }
        }

        let activeInd = 0;
        var that = this;
        (function animateMedia() {
            let nextElm = shadowRoot.getElementById(`progress-bar-${activeInd}`);
            if (nextElm) {
                nextElm.classList.add('active');
            }
            
            let currentMedia = shadowRoot.querySelector("#images-wrapper");
            if(activeInd == 0){
                currentMedia.lastChild.style.opacity && that.unsetOpacity(currentMedia.lastChild);
            } else if(activeInd > 0 && currentMedia.children[activeInd-1].style.opacity){
                that.unsetOpacity(currentMedia.children[activeInd-1]);
            }

            if (activeInd < data.length - 1) {
                that.setOpacity(currentMedia.children[activeInd]);
                activeInd += 1;
            } else {
                activeInd = 0;
            }

            let currElm = shadowRoot.getElementById(`progress-bar-${activeInd}`);
            if (currElm) {
                currElm.classList.remove('active');
            }
            setTimeout(animateMedia, data[activeInd].duration || 5000);
        })();
        
    }
}

customElements.define('stories-component', stories);
