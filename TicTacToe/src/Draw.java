import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {


    protected void paintComponent (Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // draw lines

        g.setColor(Color.darkGray);
        int width = 12;
        g2d.setStroke(new BasicStroke(width));
        g.drawLine(500, 150, 500, 750);
        g.drawLine(700, 150, 700, 750);
        g.drawLine(300, 350, 900, 350);
        g.drawLine(300, 550, 900, 550);

        // draw points

        g.setColor(Color.darkGray);
        g.setFont(new Font("arial", Font.BOLD, 55));
        g.drawString("X : " + Gui.scoreX ,40,85);
        g.drawString("O : " + Gui.scoreO, 1000,85);



        // draw player

        g.setColor(Color.darkGray);
        g.setFont(new Font("arial", Font.BOLD,50));
        if (Gui.player == 0){
            g.drawString("Player: O" ,490,85);
        }else if(Gui.player == 1){
            g.drawString("Player: X",490,85);
        }

        // draw X and O
        // first row

        if (Gui.state[0] == 1) {
            g.drawImage(ImageLoader.imgO, 330, 170, 150, 150, null);
        } else if (Gui.state[0] == 2) {
            g.drawImage(ImageLoader.imgX, 345, 200, 110, 110, null);
        }


        if (Gui.state[1] == 1){
            g.drawImage(ImageLoader.imgO, 530,170,150,150,null);
        }else if(Gui.state[1] == 2){
            g.drawImage(ImageLoader.imgX, 545,200,110,110, null);
        }

        if (Gui.state[2] == 1){
            g.drawImage(ImageLoader.imgO, 730,170,150,150,null);
        }else if(Gui.state[2] == 2){
            g.drawImage(ImageLoader.imgX, 745,200,110,110, null);
        }

        // second row

        if (Gui.state[3] == 1){
            g.drawImage(ImageLoader.imgO, 330,370,150,150,null);
        }else if(Gui.state[3] == 2){
            g.drawImage(ImageLoader.imgX, 345,400,110,110, null);
        }

        if (Gui.state[4] == 1){
            g.drawImage(ImageLoader.imgO, 530,370,150,150,null);
        }else if(Gui.state[4] == 2){
            g.drawImage(ImageLoader.imgX, 545,400,110,110, null);
        }

        if (Gui.state[5] == 1){
            g.drawImage(ImageLoader.imgO, 730,370,150,150,null);
        }else if(Gui.state[5] == 2){
            g.drawImage(ImageLoader.imgX, 745,400,110,110, null);
        }

        // third row

        if (Gui.state[6] == 1){
            g.drawImage(ImageLoader.imgO, 330,570,150,150,null);
        }else if(Gui.state[6] == 2){
            g.drawImage(ImageLoader.imgX, 345,590,110,110, null);
        }

        if (Gui.state[7] == 1){
            g.drawImage(ImageLoader.imgO, 530,570,150,150,null);
        }else if(Gui.state[7] == 2){
            g.drawImage(ImageLoader.imgX, 545,590,110,110, null);
        }

        if (Gui.state[8] == 1){
            g.drawImage(ImageLoader.imgO, 730,570,150,150,null);
        }else if(Gui.state[8] == 2){
            g.drawImage(ImageLoader.imgX, 745,590,110,110, null);
        }





        repaint();
    }


}
