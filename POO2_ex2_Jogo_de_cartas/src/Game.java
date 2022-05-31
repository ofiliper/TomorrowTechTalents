public abstract class Game {

    protected Player[] player;
    protected int boardCardQuantity = 50;
    protected Card[][] deckOnBoard;

    public abstract boolean insertAttackCard(Card card, int playerTurn);
    public abstract boolean verifyPlayerVictory(int playerTurn);

}