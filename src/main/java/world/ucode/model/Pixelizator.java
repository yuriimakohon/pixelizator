package world.ucode.model;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;
import java.awt.*;


public class Pixelizator {
    public enum AlgoType {
        SMOOTH,
        ROUGH,
    }

    public static AlgoType getAlgoType(String str) {
        if ("rough".equals(str)) {
            return AlgoType.ROUGH;
        } else {
            return AlgoType.SMOOTH;
        }
    }

    public static InputStream pixelate(InputStream in, int pixSize, AlgoType algo) throws IOException {
        BufferedImage imgSrc = ImageIO.read(in);
        int width = imgSrc.getWidth();
        int height = imgSrc.getHeight();
        BufferedImage imgDest = new BufferedImage(width, height, TYPE_INT_RGB);

        for (int w = 0; w < width; w += pixSize)
            for (int h = 0; h < height; h += pixSize) {
                int pixel;
                if (algo == AlgoType.ROUGH)
                    pixel = mixRough(imgSrc, w, h, pixSize);
                else
                    pixel = mixSmooth(imgSrc, w, h, pixSize);

                for (int dw = w; (dw < w + pixSize) && (dw < imgDest.getWidth()); dw++)
                    for (int dh = h; (dh < h + pixSize) && (dh < imgDest.getHeight()); dh++)
                        imgDest.setRGB(dw, dh, pixel);
            }

        return bufferedImageToInputStream(imgDest);
    }

    private static int mixRough(BufferedImage img,  int w, int h, int pixSize) {
        pixSize = ++pixSize / 2;
        int wCenter = w + pixSize < img.getWidth() ? w + pixSize : w;
        int hCenter = h + pixSize < img.getHeight() ? h + pixSize : h;
        return img.getRGB(wCenter, hCenter);
    }

    private static int mixSmooth(BufferedImage img,  int w, int h, int pixSize) {
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
