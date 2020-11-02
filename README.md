# Pixelizator

Web-app for pixelating images with some settings

<p>
  <img src="https://i.ibb.co/dmJwWF7/Screen-Shot-2020-11-02-at-5-31-32-PM.png" alt="photo">
</p>

## Installation
1. `git clone https://github.com/yuriimakohon/pixelizator`
2. Build: `./mvnw clean package`
3. Run server: `./wvnw tomcat7:run`
4. Check site: http://localhost:8080/pixelizator

## How to pixelate images
* Select image on `file chooser`
* Choose `pixel scale` size
* Choose pixelating algorithm
* Press **`Pixelate`** button

## Functional
* File loading from your pc
* Two pixelating algorithm: **smooth** and **rough**
* Pixel scale setting
* Downloading in several formats
* Some info about source image

## Algorithm
####Rough
<p>
  <img src="https://i.ibb.co/znnbPqV/Frame-1.png" alt="smooth algo">
</p>

* Take color of central pixel
* Applies to all pixels

####Smooth
<p>
  <img src="https://i.ibb.co/Sm3SP9H/Frame-1-1.png" alt="smooth algo">
</p>

* Calculates the average of all pixels for each of the RGB channels
* Applies to all pixels

##Gallery
###Smooth algorithm
<p>
<a><img src="https://i.ibb.co/cXC8pDj/Screen-Shot-2020-11-02-at-6-10-04-PM.png" alt="img1"></a>
</p>
<p>
<a><img src="https://i.ibb.co/jDqxScz/Screen-Shot-2020-11-02-at-6-45-05-PM.png" alt="img2"></a>
</p>
<p>
<a><img src="https://i.ibb.co/98QDz5R/Screen-Shot-2020-11-02-at-6-46-45-PM.png" alt="img3"></a>
</p>
<p>
<a><img src="https://i.ibb.co/4PZcrMX/Screen-Shot-2020-11-02-at-6-48-53-PM.png" alt="img4"></a>
</p>

##Rough algorithm
<p>
<a><img src="https://i.ibb.co/DLb6f12/Screen-Shot-2020-11-02-at-6-10-15-PM.png" alt="img5"></a>
</p>
<p>
<a><img src="https://i.ibb.co/XxxBLmR/Screen-Shot-2020-11-02-at-6-45-12-PM.png" alt="img6"></a>
</p>
<p>
<a><img src="https://i.ibb.co/x5dJzCM/Screen-Shot-2020-11-02-at-6-46-33-PM.png" alt="img7"></a>
</p>
<p>
<a><img src="https://i.ibb.co/9T4HVsm/Screen-Shot-2020-11-02-at-6-48-41-PM.png" alt="img8"></a>
</p>
