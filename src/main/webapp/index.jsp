<html>
<head>
    <title>Pixelizator</title>

    <link rel="shortcut icon" href="https://cdn.dribbble.com/users/479536/screenshots/5682999/p_pixel.jpg" type="image/x-icon">

    <script src="js/option.js"></script>
    <script src="js/pixelateRequest.js"></script>

    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Pixelizator</h1>
    <div id="control">
        <label id="lblChoose">Choose image from your computer</label>
        <input accept="image/*" id="inputFile" name="myFile" type="file" onchange="sourceImgLoader()">
        <div id="div_scale">
            <label>Pixel scale</label>
            <input type="range" id="volume" name="volume"
                   min="2" max="30" onchange="setLblValue()">
            <label id="lblValue" for="volume"></label>
        </div>
        <div>
            <label class="radio">
                <input type="radio" name="algorithm" id="rbtn_smooth" value="smooth" checked="checked">
                Smooth
            </label>
            <label class="radio">
                <input type="radio" name="algorithm" id="rbtn_rough" value="rough">
                Rough
            </label>
            <input type="button" value="Pixelate" onclick="pixelateRequest()">
        </div>
        <br>
        <div id="div_download">
            <label>Download: </label>
            <a class="a_download" id="download_jpeg" href="" download="pixelated.jpeg">.jpeg</a>
            <a class="a_download" id="download_png" href="" download="pixelated.png">.png</a>
            <a class="a_download" id="download_webp" href="" download="pixelated.webp">.webp</a>
            <a class="a_download" id="download_bmp" href="" download="pixelated.bmp">.bmp</a>
            <a class="a_download" id="download_tiff" href="" download="pixelated.tiff">.tiff</a>
            <a class="a_download" id="download_raw" href="" download="pixelated.raw">.raw</a>
            <a class="a_download" id="download_gif" href="" download="pixelated.gif">.gif</a>
        </div>
    </div>
    <div id="imageView">
        <img id="imgSource" alt="source image" src="">
        <br>
        <img id="imgAltered" alt="altered image" src="">
    </div>
    <div id="div_info">
        <label id="lblSize"></label>
        <br>
        <label id="lblRes"></label>
    </div>
</body>
</html>
