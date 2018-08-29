import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    public static Image imgX;
    public static Image imgO;

    public void imageLoader(){
        try {
            imgO = ImageIO.read(new File("Images/O.png"));
            imgX = ImageIO.read(new File("Images/X.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // place of the buttons on the game board

    public static void place(){
        // first row
        Gui.jButton[0].setBounds(320,160,150,150);
        Gui.jButton[1].setBounds(520,160,150,150);
        Gui.jButton[2].setBounds(720,160,150,150);

        // second row
        Gui.jButton[3].setBounds(320,360,150,150);
        Gui.jButton[4].setBounds(520,360,150,150);
        Gui.jButton[5].setBounds(720,360,150,150);

        // third row
        Gui.jButton[6].setBounds(320,560,150,150);
        Gui.jButton[7].setBounds(520,560,150,150);
        Gui.jButton[8].setBounds(720,560,150,150);

    }








}
