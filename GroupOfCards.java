/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {
    public static void main(String[] args) {
        Game game = new Game();

        // Initialize players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Add players to the game
        game.addPlayer(player1);
        game.addPlayer(player2);

        // Deal initial cards
        game.dealInitialCards();

        // Perform game actions
        // ...

        // Determine the winner
        game.determineWinner();
    }
}
