/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjackgame;

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class BlackjackMain {
    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        game.addPlayer(player1);
        game.addPlayer(player2);

        game.dealInitialCards();
        game.displayGameStatus();
        Scanner scanner = new Scanner(System.in);
        

        

        // Game loop for player actions
        for (Player player : game.getPlayers()) {
            while (true) {
                System.out.println(player.getName() + ", do you want to hit or stand?");
                String action = scanner.nextLine().toLowerCase();

                if (action.equals("hit")) {
                    game.handlePlayerAction(player, action);
                    game.displayGameStatus();

                    if (player.calculateHandValue() > 21) {
                        System.out.println(player.getName() + " busts!");
                        break;
                    }
                } else if (action.equals("stand")) {
                    game.handlePlayerAction(player, action);
                    game.displayGameStatus();
                    break;
                } else {
                    System.out.println("Invalid action. Please enter 'hit' or 'stand'.");
                }
            }
        }
        



        // Determine and display the winner
        game.determineWinner();
        game.displayGameStatus();
    }
}
