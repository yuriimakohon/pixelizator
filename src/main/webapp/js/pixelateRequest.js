function pixelateRequest() {
    let imgAltered = document.getElementById("imgAltered");
    let imgSourcePath = document.getElementById("inputFile").files[0];
    let pixSize = document.getElementById("volume").value;
    const formData = new FormData();

    formData.append('file', imgSourcePath);
    formData.append('pix_size', pixSize);

    fetch("http://localhost:8080/pixelate", {
        method: 'POST',
        body: formData
    }).then(r => r.arrayBuffer())
        .then(blobParts => {
            let blob = new Blob([blobParts], {type: 'image/jpg'});
            return URL.createObjectURL(blob);
        })
        .then(src => {
            imgAltered.src = src;
            imgAltered.style.visibility = "visible";
        })
        .catch(console.error);
}
