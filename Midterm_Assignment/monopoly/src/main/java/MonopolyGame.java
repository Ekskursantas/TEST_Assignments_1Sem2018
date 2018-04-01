
/**
 *
 * @author Cherry Rose Semeña
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simulation of an extremely simplified version of the game of Monopoly.
 *
 * @author D.L. Bailey, SCE, Carleton University
 * @version 1.01, January 29, 2006
 */
public class MonopolyGame {

    private static final int ROUNDS_TOTAL = 20;
    private static final int PLAYERS_TOTAL = 2;
    private List players = new ArrayList(PLAYERS_TOTAL);
    private Board board = new Board();
    private Dice[] dice = {new Dice(), new Dice()};

    public MonopolyGame() {
        Player p;
        p = new Player("Cherry", dice, board);
        players.add(p);
        p = new Player("Rose", dice, board);
        players.add(p);
    }

    public void playGame() {
        for (int i = 0; i < ROUNDS_TOTAL; i++) {
            playRound();
        }
    }

    public List getPlayers() {
        return players;
    }

    private void playRound() {
        for (Iterator iter = players.iterator(); iter.hasNext();) {
            Player player = (Player) iter.next();
            player.takeTurn();
        }
    }
}
