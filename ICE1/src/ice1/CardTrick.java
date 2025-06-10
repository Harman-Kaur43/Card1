/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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


import java.util.Random;

//import javax.smartcardio.Card;


public class CardTrick {
    public static void main(String[] args) {

        // Create an array to hold 7 cards
        Card[] magicHand = new Card[7];
        String[] suits = Card.SUITS;
        Random random = new Random();

        // Fill the array with random cards
        for (int i = 0; i < magicHand.length; i++) {
           /*  Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // value between 1 and 13
            card.setSuit(suits[random.nextInt(suits.length)]);
            magicHand[i] = card;*/
            int value = random.nextInt(13) + 1;
            String suit = suits[random.nextInt(suits.length)];
            Card card = new Card(suit, value);
            magicHand[i] = card;
        }

        // --- This section replaces user input after GitHub edit/merge ---

        // Hardcoded luckyCard
        Card luckyCard = new Card("Spades",7);
        //luckyCard.setValue(7);         // you can change this to any number 1–13
        //luckyCard.setSuit("Spades");   // change suit if needed

        // Search for the lucky card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, the lucky card was not found in the magic hand.");
        }

        // Optional: Display all cards in the hand for verification
        System.out.println("\nMagic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }


    
}
