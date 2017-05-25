package main;

import java.util.Random;

/**
 *
 * @author eric.mclaren
 */
public class Dice {
    
    private static int MAX = 6;
    private static int MIN = 1;
    private int nb;
    
    public Dice(int nb) {
        this.nb = nb;
    }
    
    public Dice() {
        this.nb = randomNum(MAX, MIN);
    }
    
    public void setDice(int nb) {
        this.nb = nb;
    }
    
    public int getDiceNb() {
        return nb;
    }
    
    @Override
    public boolean equals(Object obj) {
        return nb == ((Dice)obj).getDiceNb();
    }
    
    private static int randomNum(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt(max - min + 1) + min;
        return randomNum;
    }
    
    @Override
    public String toString() {
        return this.nb + "";
    }
    
}
