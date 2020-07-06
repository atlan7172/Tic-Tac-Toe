package pack1;


import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try {
            imgX = ImageIO.read(new File("src/res/x.png"));
            imgO = ImageIO.read(new File("src/res/o.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
