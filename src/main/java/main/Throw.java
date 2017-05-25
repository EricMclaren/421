package main;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class Throw {
    
    private final static int NB1 = 1;
    private final static int NB2 = 2;
    private final static int NB4 = 4;
    private final static int NB5 = 5;
    private ArrayList <Dice>diceList = new ArrayList<Dice>();

    public <ArrayList>Throw() {
        setDiceList();
    }
    
    private ArrayList setDiceList() {
        diceList.clear();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        diceList.add(dice1);
        diceList.add(dice2);
        diceList.add(dice3);
        return diceList;
    }
    
    public static boolean checkDice(ArrayList diceList) {
        boolean flag = true;
        if (diceList.contains(new Dice(NB1)) && diceList.contains(new Dice(NB2)) && diceList.contains(new Dice(NB4))) {
            return true;
        } else {
            for (int i=0; i<diceList.size(); i++) {
                Dice dice = (Dice)diceList.get(i);
                if (dice.getDiceNb() != NB5) {flag = false;}
            }
        }
        return flag;
    }
    
    public ArrayList getThrow() {return diceList;}
}
