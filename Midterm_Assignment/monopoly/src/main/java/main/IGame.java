package main;

/**
 *
 * @author Cherry Rose Semeña
 */
public interface IGame {
    void init();
    void move(IPlayer player);
    void addPiece(IPiece piece);
    IPiece getPiece(IPlayer player);
    void endGame();
}
