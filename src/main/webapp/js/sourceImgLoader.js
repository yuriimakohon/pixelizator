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
