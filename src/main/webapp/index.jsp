<html>
<head>
    <title>Pixelizator</title>

    <script src="js/option.js"></script>
    <script src="js/sourceImgLoader.js"></script>
    <script src="js/pixelateRequest.js"></script>

    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Pixelizator</h1>
    <div id="control">
        <label id="lblChoose">Choose image from your computer</label>
        <input accept="image/*" id="inputFile" name="myFile" type="file" onchange="sourceImgLoader()">
        <div>
            <input type="range" id="volume" name="volume"
                   min="2" max="30" onchange="setLblValue()">
            <label id="lblValue" for="volume"></label>
        </div>
        <input type="button" value="Pixelate" onclick="pixelateRequest()">
        <br>
        <input type="button" value="Download">
    </div>
    <div id="imageView">
        <img id="imgSource" src="" alt="source image">
        <br>
        <img id="imgAltered" src="" alt="altered image">
    </div>
</body>
</html>
