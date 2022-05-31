public class GameBoardParty extends GameBoardVersus{
    /*
     * Atribui uma quantidade fixa de cartas.
     * Atribui cartas de ataque e cartas espeiciais.
     *
     */
    GameBoardParty(String[] playersName, int cardsQuantity, int cardAttackQnt, int cardSpecialAttackQnt) {
        super(playersName, cardsQuantity, cardAttackQnt, cardSpecialAttackQnt);
    }

    @Override
    public boolean verifyPlayerVictory(int playerTurn) {
        int deadEnemyQnt = 0;
        for(int i = 0; i < player.length ; i++){
            if(i == playerTurn){
                continue;
            }
            if(player[i].getLife() <= 0){
                deadEnemyQnt++;
            }
        }
        if(deadEnemyQnt == player.length - 1){
            return true;
        }else{
            return false;
        }
    }


}
