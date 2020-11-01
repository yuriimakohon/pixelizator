const initDOM = () => setLblValue();
document.addEventListener("DOMContentLoaded", initDOM);

function setLblValue() {
    document.getElementById('lblValue').innerHTML = 'x' + (+document.getElementById('volume').value);
}