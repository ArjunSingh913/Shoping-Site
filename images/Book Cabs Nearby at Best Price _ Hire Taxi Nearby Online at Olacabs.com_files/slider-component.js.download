const sliderTemplate = document.createElement('template');

sliderTemplate.innerHTML = `
    <style>
        * {
            box-sizing: border-box;
            margin: 0px;
            padding: 0px;
        }
        .title {
            font-weight: 500;
            font-size: 32px;
            line-height: 32px;
            letter-spacing: -0.02em;
            color: #000000;
            text-shadow: 1.152px 1.152px 0px #FFFFFF, 1.728px 1.728px 0px #92C83E;
            margin: 0px 0px 24px 0px;
        }
        .slider-item {
            display: flex;
        }
        .bg-color {
            background: #F0F4F4;
            border: 1px solid rgba(0, 0, 0, 0.05);
        }
        .item-details {
            flex-grow: 1;
        }
        .item-header {
            font-weight: 500;
            font-size: 22px;
            line-height: 24px;
            letter-spacing: -0.01em;
            color: #000000;
            margin-bottom: 16px;
        }
        .item-subheader {
            font-weight: 400;
            font-size: 16px;
            line-height: 20px;
            letter-spacing: -0.01em;
            color: rgba(0, 0, 0, 0.6);
        }
        .item-link {
            font-weight: 500;
            font-size: 16px;
            line-height: 130%;
            letter-spacing: -0.02em;
            color: #16AA51;
            text-decoration: none;
        }
        .arrow-img {
            margin-left: 8px;
        }

        .link-header {
            display: flex;
            flex-direction: row;
            align-items: center;
            margin-right: 16px;
        }
        .slider-item {
            cursor: pointer;
        }
        .slider-item:hover .link-header {
            color: #16AA51;
            cursor: pointer;
        }
        .slider-item:hover .black-arrow {
            display: none;
        }
        .slider-item:hover .green-arrow {
            display: block;
        }
        .event-elem {
            text-decoration: none;
        }
        .link-header .black-arrow {
            display: block;
        }
        .link-header .green-arrow {
            display: none;
        }

        @media only screen and (min-width: 768px) {
            .title {
                margin-bottom: 56px;
                font-weight: 500;
                font-size: 48px;
                line-height: 56px;
            }

            .ver-grid .slider-item{
                margin-bottom: 48px;
                align-items: center;
            }
            .ver-grid .row-reverse {
                flex-direction: row-reverse;
            }
            .ver-grid .row {
                flex-direction: row;
            }
            .ver-grid .item-details {
                padding: 70px 58px;
            }
            .ver-grid .item-image {
                width: 65%;
                height: auto;
            }
            .ver-grid .link-header .black-arrow {
                display: none;
            }

            .hor-grid {
                display: grid;
                grid-gap: 24px;
                width: 100%;
            }
            .hor-grid .slider-item {
                flex: 1;
                flex-direction: column;
            }
            .hor-grid .item-img{
                width: 100%;
                height: auto;
            }
            .hor-grid .item-details{
                padding: 16px 0px;
            }
        }

        @media only screen and (max-width: 576px) {
            .slider-item:hover .green-arrow {
                display: none;
            }
            .slider-item:hover .link-header {
                color: black;
                cursor: pointer;
            }
            .slider-container {
                padding: 0px;
                margin: 0px -16px;
            }
            .title {
                padding: 0px 16px;
                max-width: 300px;
            }
            #slider-wrapper {
                display: flex;
                flex-direction: row;
                width: 100vw;
                overflow-x: scroll;
                padding: 0px 16px;
            }
            #slider-wrapper::-webkit-scrollbar {
                display: none;
            }
            .slider-item {
                flex-direction: column;
                width: calc(100vw - 48px);
            }
            .slider-item:not(:last-child) {
                margin-right: 16px;
            }
            .item-details {
                padding: 16px 0px;
            }
            .bg-color .item-details{
                padding: 16px;
            }
            .item-image {
                width: inherit;
                height: auto;
            }
        }
    </style>
    <div class="slider-container">
        <p class="title" id="slider-title"></p>
        <div id="slider-wrapper"></div>
    </div>
`;

class slider extends HTMLElement {
    constructor() {
        super();
    }

    connectedCallback() {
        const shadowRoot = this.attachShadow({ mode: 'open' });
        shadowRoot.appendChild(sliderTemplate.content.cloneNode(true));

        const showBgColor = this.getAttribute('showBgColor');
        const sectionName = this.getAttribute('sectionName');
        let data, title, isDesktopHorGrid = false;
        switch (sectionName) {
            case "tech-for-world": {
                title = "Tech for the world, made in India"
                data = [
                    {
                        imageSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/ola-futurefactory.png",
                        placeholder: "ola-future-factory",
                        header: "Ola Futurefactory",
                        isHeaderLink: true,
                        redirectTo: "https://olaelectric.com/future-factory",
                        eventName: "desktop_caraousel_future_factory",
                        subheader: "Powered by over 3000 AI-driven robots, the Ola Futurefactory is the world's most advanced two-wheeler manufacturing facility.",
                        type: "image",
                        bgColor: "#F0F4F4;"
                    },
                    {
                        imageSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/battery-innovation-center.png",
                        placeholder: "battery-innovation-centre",
                        header: "Battery Innovation Centre",
                        isHeaderLink: true,
                        redirectTo: "https://blog.olaelectric.com/ola-to-invest-usd-500-million-in-battery-innovation-and-indigenous-cell/",
                        eventName: "desktop_caraousel_battery_innovation_center",
                        subheader: "We're building a state of the art centre with a $500 million investment making it one of the world's largest most advanced cell R&D facility.",
                        type: "image",
                        bgColor: "#F4F3F0;"
                    },
                    {
                        imageSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/battery-img.png",
                        placeholder: "li-ion-battery",
                        header: "India's first <br/> Indigenous Cell",
                        isHeaderLink: true,
                        redirectTo: "https://blog.olaelectric.com/indias-first-indigenously-made-lithium-ion-cell/",
                        eventName: "desktop_caraousel_li_ion_battery",
                        subheader: "We're working towards making our own cell technology to scale faster and revolutionise the EV segment.",
                        type: "image",
                        bgColor: "#F4F3F0;"
                    }
                ];
                break;
            }
            case "making-innovations": {
                title = "Making innovations since 2011";
                data = [
                    {
                        videoSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/for-riders.mp4",
                        videoType: "video/mp4",
                        placeholder: "making-innovations",
                        header: "For riders",
                        subheader: "We constantly experiment to come up with industry-first features for our riders that eventually become a norm.",
                        type: "video"
                    },
                    {
                        videoSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/for-drivers.mp4",
                        videoType: "video/mp4",
                        placeholder: "making-innovations",
                        header: "For drivers",
                        subheader: "Our drivers get real time stats to help optimize their rides better and earn more, straight from the app.",
                        type: "video"
                    },
                ]
                break;
            }
            case "recent-from-blogs": {
                title = "Recent from our blogs";
                data = [
                    {
                        imageSrc: "./webstatic/img/new-images/end_for_ice_age.jpeg",
                        placeholder: "end-for-ice-age",
                        header: "2022: Beginning of the End for ICE Age",
                        linkText: "Know more",
                        redirectTo: "https://blog.olaelectric.com/2022-beginning-of-the-end-ice-age/",
                        eventName: "desktop_blog_end_for_ice_age",
                        type: "image"
                    },
                    {
                        imageSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/pli-agreement.png",
                        placeholder: "pli-agreement",
                        header: "Ola signs PLI agreement",
                        linkText: "Know more",
                        redirectTo: "https://blog.olaelectric.com/ola-signs-pli-agreement-with-ministry-of-heavy-industries/",
                        eventName: "desktop_blog_pli_agreement",
                        type: "image"
                    },
                    {
                        imageSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/ola-to-invest.png",
                        placeholder: "ola-to-invest",
                        header: "Ola to invest $500 million",
                        linkText: "Know more",
                        redirectTo: "https://blog.olaelectric.com/ola-to-invest-usd-500-million-in-battery-innovation-and-indigenous-cell/",
                        eventName: "desktop_blog_ola_investment",
                        type: "image"
                    },
                    {
                        imageSrc: "https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/indigenous-cell.png",
                        placeholder: "indegenous-cell",
                        header: "India's first indigenous cell",
                        linkText: "Know more",
                        redirectTo: "https://blog.olaelectric.com/indias-first-indigenously-made-lithium-ion-cell/",
                        eventName: "desktop_blog_li_ion_cell",
                        type: "image"
                    },
                ];
                isDesktopHorGrid = true;
                break;
            }
        }

        let titleElm = shadowRoot.getElementById('slider-title');
        titleElm.innerHTML = title;
        let wrapperElm = shadowRoot.getElementById('slider-wrapper');
        if (wrapperElm) {
            if (isDesktopHorGrid) {
                wrapperElm.classList.add('hor-grid');
                wrapperElm.style['grid-template-columns'] = `repeat(${data.length}, minmax(0, 1fr))`;
            } else {
                wrapperElm.classList.add('ver-grid');
            }
            for (let i in data) {
                let headerElm, linkElm;
                if (data[i].linkText) {
                    linkElm = `<a class="item-link event-elem" event-name="${data[i].eventName}">${data[i].linkText}<img class="arrow-img" src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/green-arrow-right.svg" alt=""></a>`
                }
                headerElm = data[i].isHeaderLink ? `<a class="event-elem" event-name="${data[i].eventName}"><p class="item-header link-header">${data[i].header}<img class="arrow-img green-arrow" src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/green-arrow-right.svg" alt="right-arrow"><img class="arrow-img black-arrow" src="https://s3-ap-southeast-1.amazonaws.com/ola-prod-website/arrow-right.svg" alt="right-arrow"></p></a>` : `<p class="item-header">${data[i].header}</p>`;
                wrapperElm.innerHTML += `<div style="background-color: ${data[i].bgColor}" class="slider-item ${i % 2 === 0 ? 'row' : 'row-reverse'} ${showBgColor === 'true' ? 'bg-color' : ''}" onclick='window.open("${data[i].redirectTo}");return false;'>${data[i].type === 'image' ? `<img src="${data[i].imageSrc}" alt="${data[i].placeholder}" class="item-image" >` : `<video-component videoSrc="${data[i].videoSrc}" videoType="${data[i].videoType}" height="auto" width="calc(100vw - 48px)"></video-component>`}<div class="item-details">${headerElm}<p class="item-subheader">${data[i].subheader || ''}</p>${data[i].linkText ? linkElm : ''}</div ></div >`;
            }
        }

    // to call all the events of this component
    shadowRoot.querySelectorAll(".event-elem").forEach((a) => a.addEventListener("click", () => window.callCustomEvents(a)))
    }
}

customElements.define('slider-component', slider);
