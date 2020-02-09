import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try{
            imgX = ImageIO.read(new File("rsc/blue.png"));
            imgO = ImageIO.read(new File("rsc/red.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
