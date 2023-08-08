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
import java.util.Scanner;

public class BlackjackGame {
    private List<Player> players;
    private Deck deck;

    public BlackjackGame() {
        players = new ArrayList<>();
        deck = new Deck();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
    
        public List<Player> getPlayers() {
        return players;
    }


    public void dealInitialCards() {
        for (Player player : players) {
            player.addCard(deck.dealCard());
        }
    }

    public void handlePlayerAction(Player player, String action) {
        if (action.equals("hit")) {
            player.addCard(deck.dealCard());
        } else if (action.equals("stand")) {
            // Player chooses to stand, no action needed
        }
    }

    public void determineWinner() {
        int dealerHandValue = players.get(0).calculateHandValue(); // Assuming the dealer is the first player

        for (Player player : players) {
            int playerHandValue = player.calculateHandValue();

            if (playerHandValue > 21) {
                player.updateBalance(-1); // Player loses
            } else if (playerHandValue <= 21 && (dealerHandValue > 21 || dealerHandValue < playerHandValue)) {
                player.updateBalance(1); // Player wins
            } else if (playerHandValue == dealerHandValue) {
                // It's a tie, player's balance remains unchanged
            } else {
                player.updateBalance(-1); // Player loses
            }
        }
    }

    public void displayGameStatus() {
        System.out.println("---- Game Status ----");
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.getHand() + " (Total points: " + player.calculateHandValue() + ")");
        }

        int dealerHandValue = players.get(0).calculateHandValue(); // Assuming the dealer is the first player

        for (Player player : players) {
            int playerHandValue = player.calculateHandValue();

            if (playerHandValue > 21) {
                System.out.println(player.getName() + " busts! " + player.getName() + " loses.");
            } else if (playerHandValue <= 21 && (dealerHandValue > 21 || dealerHandValue < playerHandValue)) {
                System.out.println(player.getName() + " wins!");
            } else if (playerHandValue == dealerHandValue) {
                System.out.println(player.getName() + " ties with the dealer.");
            } else {
                System.out.println(player.getName() + " loses.");
            }
        }

        System.out.println("--------");
    }
}
