import javax.swing.*;
import java.awt.*;

public class Winner extends JLabel {



    public void winnerView() {
        if (Gui.winner == 1){
        Gui.draw.setVisible(false);
        Gui.reset.setVisible(false);
        Gui.play.setVisible(true);
        Gui.drawWinner.setVisible(true);


        }else if(Gui.winner == 2){
            Gui.draw.setVisible(false);
            Gui.reset.setVisible(false);
            Gui.play.setVisible(true);
            Gui.drawWinner.setVisible(true);

        }
    }


}
