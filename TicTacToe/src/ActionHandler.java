import java.awt.event.ActionEvent;

public class ActionHandler implements java.awt.event.ActionListener {

Check check = new Check();

    @Override
    public void actionPerformed(ActionEvent e) {
        // no winner, 0= O und 1 = X

        if (Gui.winner == 0) {

            // first row
            if (e.getSource() == Gui.jButton[0]) {

                if (Gui.state[0] == 0 && Gui.player == 0) {
                    Gui.state[0] = 1;
                    Gui.player = 1;
                } else if (Gui.state[0] == 0 && Gui.player == 1) {
                    Gui.state[0] = 2;
                    Gui.player = 0;

                }
                try {

                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
              else if (e.getSource() == Gui.jButton[1]) {

                if (Gui.state[1] == 0 && Gui.player == 0) {
                    Gui.state[1] = 1;
                    Gui.player = 1;
                } else if (Gui.state[1] == 0 && Gui.player == 1) {
                    Gui.state[1] = 2;
                    Gui.player = 0;

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[2]) {

                if (Gui.state[2] == 0 && Gui.player == 0) {
                    Gui.state[2] = 1;
                    Gui.player = 1;
                } else if (Gui.state[2] == 0 && Gui.player == 1) {
                    Gui.state[2] = 2;
                    Gui.player = 0;

                    // second row

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[3]) {

                if (Gui.state[3] == 0 && Gui.player == 0) {
                    Gui.state[3] = 1;
                    Gui.player = 1;
                } else if (Gui.state[3] == 0 && Gui.player == 1) {
                    Gui.state[3] = 2;
                    Gui.player = 0;

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[4]) {

                if (Gui.state[4] == 0 && Gui.player == 0) {
                    Gui.state[4] = 1;
                    Gui.player = 1;
                } else if (Gui.state[4] == 0 && Gui.player == 1) {
                    Gui.state[4] = 2;
                    Gui.player = 0;

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[5]) {

                if (Gui.state[5] == 0 && Gui.player == 0) {
                    Gui.state[5] = 1;
                    Gui.player = 1;
                } else if (Gui.state[5] == 0 && Gui.player == 1) {
                    Gui.state[5] = 2;
                    Gui.player = 0;

                    // third row

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[6]) {

                if (Gui.state[6] == 0 && Gui.player == 0) {
                    Gui.state[6] = 1;
                    Gui.player = 1;
                } else if (Gui.state[6] == 0 && Gui.player == 1) {
                    Gui.state[6] = 2;
                    Gui.player = 0;

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[7]) {

                if (Gui.state[7] == 0 && Gui.player == 0) {
                    Gui.state[7] = 1;
                    Gui.player = 1;
                } else if (Gui.state[7] == 0 && Gui.player == 1) {
                    Gui.state[7] = 2;
                    Gui.player = 0;

                }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource() == Gui.jButton[8]) {

                if (Gui.state[8] == 0 && Gui.player == 0) {
                    Gui.state[8] = 1;
                    Gui.player = 1;
                    } else if (Gui.state[8] == 0 && Gui.player == 1) {
                    Gui.state[8] = 2;
                    Gui.player = 0;


                    }
                try {
                    check.checkWinner();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

            }
                    }
                    }


    public static void play() {
        for (int i = 0; i < Gui.state.length; i++) {


            Gui.state[i] = 0;
            Gui.player = 0;
            Gui.winner = 0;
            Gui.draw.setVisible(true);
            Gui.reset.setVisible(true);
            Gui.play.setVisible(false);
        }
    }
    public static void reset() {
        for (int i = 0; i < Gui.state.length; i++) {


            Gui.state[i] = 0;
            Gui.scoreO = 0;
            Gui.scoreX = 0;
            Gui.player = 0;
            Gui.winner = 0;
            Gui.draw.setVisible(true);
            Gui.reset.setVisible(true);
            Gui.play.setVisible(false);
        }
    }



    }

