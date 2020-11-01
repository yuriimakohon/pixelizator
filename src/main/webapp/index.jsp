<html>
<head>
    <title>Pixelizator</title>

    <script src="js/option.js"></script>
    <script src="js/sourceImgLoader.js"></script>
    <script src="js/pixelateRequest.js"></script>
</head>
<body>
    <div id="control">
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
        <img id="imgSource" src="" style="visibility: hidden" alt="source image">
        <br>
        <img id="imgAltered" src="" style="visibility: hidden" alt="altered image">
    </div>
</body>
</html>
