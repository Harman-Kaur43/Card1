/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice1;

/**
 *
 * @author kaurs
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;


public class Card {

    private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   public Card(){}
   

   public Card(String suit, int value) {
    boolean validSuit = Arrays.stream(SUITS)
                              .anyMatch(s -> s.equalsIgnoreCase(suit));
    if (validSuit && value >= 1 && value <= 13) {
        this.suit = Arrays.stream(SUITS)
                          .filter(s -> s.equalsIgnoreCase(suit))
                          .findFirst()
                          .orElse(suit); // ensures suit uses correct capitalization
        this.value = value;
    } else {
        throw new IllegalArgumentException("Invalid card: " + suit + " " + value);
    }
}
    /*
   *
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
   
    
}
