/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

   private List<Player> players;
    private List<Card> deck;

    public Game() {
        players = new ArrayList<>();
        deck = new ArrayList<>();
        // Initialize the deck of cards
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void dealInitialCards() {
        // Deal two cards to each player
    }

    public void handlePlayerAction(Player player, String action) {
        // Handle the player's action (hit or stand)
    }

    public void determineWinner() {
        // Determine the winner of the game
    }

    public void displayGameStatus() {
        // Display the current game status
    }

    // Other methods specific to the game
}
