package main;

import java.util.ArrayList;

/**
 *
 * @author eric.mclaren
 */
public class Game {

    private final static int LOST = 0;
    private final static int PLAYER1WINS = 1;
    private final static int PLAYER2WINS = 2;
    private final static int MAX = 3;
    
    public Game () {}
    
    public int gameResult() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        for (int i=0; i<MAX; i++) {
            Throw throwPlayer1 = new Throw();
            Throw throwPlayer2 = new Throw();
            ArrayList throw1 = throwPlayer1.getThrow();
            ArrayList throw2 = throwPlayer2.getThrow();
            player1.setThrow(throw1);
            player2.setThrow(throw2);
            Affichage.showResult(player1);
            Affichage.showResult(player2);
            if (Throw.checkDice(player1.getThrow())) {
                return PLAYER1WINS;
            } else if (Throw.checkDice(player2.getThrow())) {
                return PLAYER2WINS;
            }
        }
        return LOST;
    }

}