import javax.swing.*;
import java.awt.*;



public class DrawWinner extends JLabel {


    protected void paintComponent (Graphics g) {

        super.paintComponent(g);
        g.setFont(new Font("arial", Font.BOLD, 90));


        if (Gui.winner == 1) {
            g.drawImage(ImageLoader.imgO, 450, 150, 300, 300, null);
            g.drawString("WINNER", 415, 565);
        } else if (Gui.winner == 2) {
            g.drawImage(ImageLoader.imgX, 450, 150, 300, 300, null);
            g.drawString("WINNER", 415, 565);

        }
    }
}
