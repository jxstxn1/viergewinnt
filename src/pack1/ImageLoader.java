package pack1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try{
            imgX = ImageIO.read(new File("rsc/x.png"));
            imgO = ImageIO.read(new File("rsc/o.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
