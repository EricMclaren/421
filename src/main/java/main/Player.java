package main;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class Player {
    
    private String nom;
    private ArrayList throwDice;
    
    public Player(String nom) {
        this.nom = nom;
        this.throwDice = null;
    }
    
    public void setNom(String nom) {this.nom = nom;}
    public void setThrow(ArrayList throwDice) {this.throwDice = throwDice;}
    public String getNom() {return nom;}
    public ArrayList getThrow() {return throwDice;}
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" : ");
        for (int i=0; i<throwDice.size(); i++) {
            sb.append(throwDice.get(i));
            sb.append(" ");
        }
        return this.nom + sb.toString();
    }
}
