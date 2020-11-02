const initDOM = () => setLblValue();
document.addEventListener("DOMContentLoaded", initDOM);

function setLblValue() {
    document.getElementById('lblValue').innerHTML = 'x' + (+document.getElementById('volume').value);
}

function sourceImgLoader() {
    let path = document.getElementById("inputFile").files[0];
    let reader = new FileReader();
    reader.onload = function() {
        let img = document.getElementById("imgSource");
        img.src = reader.result;
        img.style.visibility = "visible";
    }
    reader.readAsDataURL(path);
}

function showDownload() {
    let src = document.getElementById("imgAltered").getAttribute("src");
    let div = document.getElementById("div_download");
    let jpeg = document.getElementById("download_jpeg");
    let png = document.getElementById("download_png");
    let webp = document.getElementById("download_webp");
    let tiff = document.getElementById("download_tiff");
    let bmp = document.getElementById("download_bmp");
    let raw = document.getElementById("download_raw");
    let gif = document.getElementById("download_gif");

    div.style.display = "block";

    jpeg.setAttribute("href", src);
    png.setAttribute("href", src);
    webp.setAttribute("href", src);
    tiff.setAttribute("href", src);
    bmp.setAttribute("href", src);
    raw.setAttribute("href", src);
    gif.setAttribute("href", src);
}

function getAlgoType() {
    if (document.getElementById("rbtn_smooth").checked) {
        return document.getElementById("rbtn_smooth").value;
    } else {
        return document.getElementById("rbtn_rough").value;
    }
}