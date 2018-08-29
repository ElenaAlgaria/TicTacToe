import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui{

   private JFrame jFrame = new JFrame();
   public static Draw draw = new Draw();
    public static DrawWinner drawWinner = new DrawWinner();

    public static JButton[] jButton = new JButton[9];
   public static JButton play = new JButton("Play");
   public static JButton reset = new JButton("New Game");
   public static int[] state = new int[9];
   public static int player = 0;
   public static int winner = 0;
   public static int scoreX = 0;
   public static int scoreO = 0;



    public Gui() {

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1200,1000);
        jFrame.setTitle("TicTacToe");
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.GRAY);


        for (int i = 0; i < jButton.length; i++){
            jButton[i] = new JButton();
            jButton[i].setVisible(true);
            jButton[i].setFocusPainted(false);
            jButton[i].setBorder(null);
            jButton[i].setContentAreaFilled(false);
            jButton[i].addActionListener(new ActionHandler());
            jFrame.add(jButton[i]);
        }

        ImageLoader.place();

        play.setFont(new Font("arial", Font.CENTER_BASELINE, 27));
        play.setVisible(false);
        play.setFocusPainted(false);
        play.setForeground(Color.gray);
        play.setBackground(Color.darkGray);
        play.setBounds(960,830,180,60);

        reset.setFont(new Font("arial", Font.CENTER_BASELINE, 27));
        reset.setVisible(true);
        reset.setFocusPainted(false);
        reset.setForeground(Color.gray);
        reset.setBackground(Color.darkGray);
        reset.setBounds(960,830,200,60);

        play.addActionListener(new ActionHandler(){
        @Override
        public void actionPerformed(ActionEvent e){
            ActionHandler.play();
        }
        });

        reset.addActionListener(new ActionHandler(){
        @Override
        public void actionPerformed(ActionEvent e){
            ActionHandler.reset();
        }
        });

        jFrame.add(play);
        jFrame.add(reset);

        draw.setBounds(0,0,1200,1000);
        draw.setVisible(true);
        jFrame.add(draw);

        drawWinner.setBounds(0,0,1200,1000);
        drawWinner.setVisible(false);
        jFrame.add(drawWinner);






}
}
