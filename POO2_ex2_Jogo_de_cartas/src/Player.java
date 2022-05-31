public class Player implements IPlayer {

    private String name;
    private int life;
    private Card[] deck;

    Player(String name, int cardsQuantity){
        this.name = name;
        this.life = 100;
        this.addCards(cardsQuantity);
    }

    public int getLife() {
        return life;
    }

    public void addCards(int quantity) {

        Card deck[] = new Card[quantity];

        for(int i = 1 ; i < quantity ; i++){
            Card card = new Card("Pântano", "Elemental", 20);
            deck[i] = card;
        }
        this.deck = deck;

    }

    public Card[] getCards() { return deck; }

}
