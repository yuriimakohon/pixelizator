# Pixelizator

Web-app for pixelating images with some settings

<p>
  <img src="https://i.ibb.co/dmJwWF7/Screen-Shot-2020-11-02-at-5-31-32-PM.png" alt="photo">
</p>

## Installation
1. `git clone https://github.com/yuriimakohon/pixelizator`
2. Apply maven wrapper: `mvn -N io.takari:maven:wrapper`
3. Build: `./mvnw clean package`
4. Run server: `./wvnw tomcat7:run`
5. Check site: http://localhost:8080/pixelizator

## How to pixelate images
* Select image on `file chooser`
* Choose `pixel scale` size
* Choose pixelating algorithm
* Press **`Pixelate`** button

## Functional
* File loading from your pc
* Two pixelating algorithm: **rough** and **smooth**
* Pixel scale setting
* Downloading in several formats
* Some info about source image

## Algorithm
#### Smooth
<p>
  <img src="https://i.ibb.co/Sm3SP9H/Frame-1-1.png" alt="smooth algo">
</p>

* Calculates the average of all pixels for each of the RGB channels
* Applies to all pixels

#### Rough
<p>
  <img src="https://i.ibb.co/znnbPqV/Frame-1.png" alt="smooth algo">
</p>

* Take color of central pixel
* Applies to all pixels

## Gallery

### Rough algorithm
<p>
<a><img src="https://i.ibb.co/DLb6f12/Screen-Shot-2020-11-02-at-6-10-15-PM.png" alt="img5"></a>
</p>
<p>
<a><img src="https://i.ibb.co/hfdZWDr/Screen-Shot-2020-11-03-at-1-51-42-PM.png" alt="img6"></a>
</p>
<p>
<a><img src="https://i.ibb.co/ZHnGT6b/Screen-Shot-2020-11-03-at-2-03-42-PM.png" alt="img8"></a>
</p>
<p>
<a><img src="https://i.ibb.co/4WcJhq5/Screen-Shot-2020-11-03-at-1-55-12-PM.png" alt="img7"></a>
</p>

### Smooth algorithm
<p>
<a><img src="https://i.ibb.co/cXC8pDj/Screen-Shot-2020-11-02-at-6-10-04-PM.png" alt="img1"></a>
</p>
<p>
<a><img src="https://i.ibb.co/tBFTjbc/Screen-Shot-2020-11-03-at-1-51-58-PM.png" alt="img2"></a>
</p>
<p>
<a><img src="https://i.ibb.co/YyJpn0N/Screen-Shot-2020-11-03-at-1-55-24-PM.png" alt="img3"></a>
</p>
<p>
<a><img src="https://i.ibb.co/9gQTsTs/Screen-Shot-2020-11-03-at-2-03-55-PM.png" alt="img4"></a>
</p>