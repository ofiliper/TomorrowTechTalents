public class GameBoardVersus extends GameBoard {

    /*
     * Atribui uma quantidade fixa de cartas.
     * Atribui cartas de ataque e cartas espeiciais.
     * Atribui a quantidade de cartas de ataques e especiais.
     * Subtrai a quantidade de carta total, a quantidade de cartas de ataque e espeiciais.
     */

    GameBoardVersus(String[] playersName, int cardsQuantity, int cardAttackQnt, int cardSpecialAttackQnt) {
        insertPlayer(playersName, (cardsQuantity - cardAttackQnt - cardSpecialAttackQnt));
        addAttackCardOrSpecialCard(playersName.length, cardAttackQnt, cardSpecialAttackQnt);
    }

    public boolean addAttackCardOrSpecialCard(int playerPosition, int cardAttackQnt, int cardSpecialAttackQnt ) {

        for (int x = 0; x < playerPosition; x++) {

            if (this.player[x].getCards().length < boardCardQuantity) {

                for (int i = 0; i < boardCardQuantity + cardAttackQnt; i++) {
                    deckOnBoard[x][i] = new CardAttack("Pântano", "Elemental", 20, 200, 100, "Thunder");
                }
                for (int i = 0; i < boardCardQuantity + cardSpecialAttackQnt; i++) {
                    deckOnBoard[x][i] = new CardSpecialAttack("Pântano", "Elemental", 20, 200, 100, "Thunder");
                }
                return true;
            }

        }
        return false;
    }
}
