public class Check {

    Winner winner = new Winner ();

    public void checkWinner() throws InterruptedException {
        if (Gui.winner == 0) {

            if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;

            } else if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;

            } else if (Gui.state[6] == 1 && Gui.state[7] == 1 && Gui.state[8] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;

            } else if (Gui.state[0] == 1 && Gui.state[3] == 1 && Gui.state[6] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;


            } else if (Gui.state[1] == 1 && Gui.state[4] == 1 && Gui.state[7] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;

            } else if (Gui.state[2] == 1 && Gui.state[5] == 1 && Gui.state[8] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;

            } else if (Gui.state[0] == 1 && Gui.state[4] == 1 && Gui.state[8] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;

            } else if (Gui.state[2] == 1 && Gui.state[4] == 1 && Gui.state[6] == 1) {
                Gui.winner = 1;
                winner.winnerView();
                Gui.scoreO += 1;
            }

            // 
            if (Gui.state[0] == 2 && Gui.state[1] == 2 && Gui.state[2] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;

            } else if (Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;

            } else if (Gui.state[6] == 2 && Gui.state[7] == 2 && Gui.state[8] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;

            } else if (Gui.state[0] == 2 && Gui.state[3] == 2 && Gui.state[6] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;


            } else if (Gui.state[1] == 2 && Gui.state[4] == 2 && Gui.state[7] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;

            } else if (Gui.state[2] == 2 && Gui.state[5] == 2 && Gui.state[8] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;

            } else if (Gui.state[0] == 2 && Gui.state[4] == 2 && Gui.state[8] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;

            } else if (Gui.state[2] == 2 && Gui.state[4] == 2 && Gui.state[6] == 2) {
                Gui.winner = 2;
                winner.winnerView();
                Gui.scoreX += 1;
            }

        }
    }
}