package world.ucode;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;
import java.awt.*;


public class Pixelizator {
    public static InputStream Pixelate(InputStream in, int pixSize) throws IOException {
        BufferedImage imgSrc = ImageIO.read(in);
        int width = imgSrc.getWidth();
        int height = imgSrc.getHeight();
        BufferedImage imgDest = new BufferedImage(width, height, TYPE_INT_RGB);

        for (int w = 0; w < width; w += pixSize)
            for (int h = 0; h < height; h += pixSize) {
                int pixel = mixPixels(imgSrc, w, h, pixSize);

                for (int dw = w; (dw < w + pixSize) && (dw < imgDest.getWidth()); dw++)
                    for (int dh = h; (dh < h + pixSize) && (dh < imgDest.getHeight()); dh++)
                        imgDest.setRGB(dw, dh, pixel);
            }

        return bufferedImageToInputStream(imgDest);
    }

    private static int mixPixels(BufferedImage img,  int w, int h, int pixSize) {
        int pixCount = 0;
        int pixel;
        int r = 0;
        int g = 0;
        int b = 0;

        for (int tw = w; (tw < w + pixSize) && (tw < img.getWidth()); tw++)
            for (int th = h; (th < h + pixSize) && (th < img.getHeight()); th++) {
                pixel = img.getRGB(tw, th);
                r += (pixel >> 16) & 255;
                g += (pixel >> 8) & 255;
                b += (pixel) & 255;
                pixCount++;
            }

        r /= pixCount;
        g /= pixCount;
        b /= pixCount;

        return new Color(r, g, b).getRGB();
    }

    private static InputStream bufferedImageToInputStream(BufferedImage img) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(img, "jpeg", os);
        return new ByteArrayInputStream(os.toByteArray());
    }
}
