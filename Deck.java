/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

/**
 *
 * @author hp
 */
public class Deck extends GroupOfCards {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                addCard(new Card(rank, suit));
            }
        }
        shuffle();
    }
}
