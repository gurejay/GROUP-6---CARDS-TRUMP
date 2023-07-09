import java.util.ArrayList;
import java.util.List;
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author Yatharth Gureja
 July 9
 * @author 
 */
public abstract class Player {


    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int calculateHandValue() {
        int value = 0;
        for (Card card : hand) {
            // Calculate the value of the card and add it to the total
        }
        return value;
    }

    // Other methods specific to the player

    public void hit(Card card) {
        addCard(card);
    }

    public void stand() {
        // Player chooses to stand (take no more cards)
    }

    public void displayHand() {
        System.out.println("Hand for " + name + ":");
        for (Card card : hand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
        System.out.println("Total value: " + calculateHandValue());
    }
}
