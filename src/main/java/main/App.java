package main;

public class App {
    
    public static void main( String[] args ) {
        Game game = new Game();
        int res = game.gameResult();
        if (res == 0) {
            System.err.println("Perdu");
        } else if (res == 1) {
            System.err.println("Player1 a gagné");
        } else {
            System.err.println("Player2 a gagné");
        }
    }
    
}