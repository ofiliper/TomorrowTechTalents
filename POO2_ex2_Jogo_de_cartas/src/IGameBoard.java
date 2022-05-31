public interface IGameBoard {
    public void insertDeck(Player player);
    public boolean verifyAttackCard(Card cartaDeAtaque);
    public boolean verifyPlayerVictory();

}