const iosElectric = "https://apps.apple.com/in/app/ola-electric/id1537809074";
const andElectric = "https://play.google.com/store/apps/details?id=com.olaelectric.companion";
const iosOla = "https://apps.apple.com/in/app/ola-the-top-ride-hailing-app/id539179365";
const andOla = "https://play.google.com/store/apps/details?id=com.olacabs.customer&hl=en_IN&gl=US";
const andDriver = "https://play.google.com/store/apps/details?id=com.olacabs.oladriver&hl=en_IN&gl=US";

(_ => {
  if(getOs() == "ios") {
    let elements = document.querySelectorAll(".hiddenIos");
    elements.forEach(element => {
      element.setAttribute("hidden", '');
    });
  }
})();

function getOs() {
    var userAgent = window?.navigator?.userAgent;
    if (userAgent.match(/iPad/i) || userAgent.match(/iPhone/i)) {
      return 'ios';
    } else if (userAgent.match(/android/i)) {
      return 'android';
    } else {
      return 'desktop';
    }
};

function isAppleProduct() {
  var userAgent = window?.navigator?.userAgent;
  if (userAgent.match(/iPad/i) || userAgent.match(/iPhone/i) || userAgent.match(/Safari/i)) {
    return true;
  } else {
    return false;
  }
};

function openSnackBar(content) {
  const snackbar = document.querySelector("#snackbar");
  snackbar.innerHTML = content;
  snackbar.style.display = "block";
  snackbar.classList.remove('fade');
  setTimeout(() => {
    snackbar.classList.add('fade');
  }, 2000);
}

function checkRedirect(cbIos, cbAnd, cb, ...props) {
    let osType = getOs()
    if(osType == "ios") {
      cbIos(...props)
    } else if(osType == "android") {
      cbAnd(...props)
    } else {
      cb(...props)
    }
}

function downloadIos (appName) {
    if(appName == "electric") {
        window.location.href = iosElectric
    } else if(appName == "driver") {
        return
    } else {
        window.location.href = iosOla
    }
}

function downloadAnd (appName) {
    if(appName == "electric") {
        window.location.href = andElectric
    } else if(appName == "driver") {
        window.location.href = andDriver
    } else {
        window.location.href = andOla
    }
}