/*
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
import java.util.Random;

public class GroupOfCards {
    private List<Card> cards;
    private Random random;

    public GroupOfCards() {
        cards = new ArrayList<>();
        random = new Random();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}

