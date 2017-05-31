import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class Main {

    public static void main(String[] args)  {
        try {
            if(args == null || args.length != 1) {
                System.out.println("We cannot identify the image path");
            } else {
                new Main(args[0]);
            }
        } catch (IOException e) {
            System.out.println("Image not found.");
        }
    }

    public Main(String path) throws IOException {
        File f = new File(path);
        BufferedImage bufferedImage = ImageIO.read(f);
        ASCII ascii = new ASCII(false);
        String s = ascii.convert(bufferedImage);
        System.out.println(s);
    }

}

