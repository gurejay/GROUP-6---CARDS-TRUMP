 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

/**
 *
 * @author hp
 */

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private int balance;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.balance = 0; // Initialize balance
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int calculateHandValue() {
        int totalValue = 0;
        int numberOfAces = 0;

        for (Card card : hand) {
            String rank = card.getRank();
            if (rank.equals("Ace")) {
                numberOfAces++;
                totalValue += 11;
            } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
                totalValue += 10;
            } else {
                totalValue += Integer.parseInt(rank);
            }
        }

        // Adjust for Aces
        while (totalValue > 21 && numberOfAces > 0) {
            totalValue -= 10;
            numberOfAces--;
        }

        return totalValue;
    }

    public void updateBalance(int amount) {
        balance += amount;
    }
}
