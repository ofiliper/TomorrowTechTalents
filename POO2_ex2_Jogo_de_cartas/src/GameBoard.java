public class GameBoard extends  Game {

    /*
     * Recebe os jogadores em um array.
     * Atribui uma quantidade de cartas para cada index.
     */

    public void insertPlayer(String[] playerName, int cardsQuantity){
        for(int i = 0; i < playerName.length ; i++){
            this.player[i] = new Player(playerName[i], cardsQuantity);
            insertDeck(this.player[i].getCards(), i);
        }
    }

    public void insertDeck(Card[] Cards, int position){
        deckOnBoard[position] = Cards;
    }

    /*
     * Verifica se a quantidade de cartas em mãos é menor
     * do que a quantidade de cartas no tabuleiro.
     * Verifica se é uma instância de CardAttack.
     * Recebe a posição do jogador pelo turno.
     */

    @Override
    public boolean insertAttackCard(Card cardAttack, int playerTurn){

        if(this.player[playerTurn].getCards().length < boardCardQuantity) {
            if(cardAttack instanceof CardAttack){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    /*
     * verifica se o usuário é vitorioso através de sua posição (turno).
     */

    @Override
    public boolean verifyPlayerVictory(int playerTurn) {
        for(int i = 0; i < player.length ; i++){
            if(i == playerTurn){
                continue;
            }
            if(player[i].getLife() <= 0){
                return true;
            }
        }
        return false;
    }

}