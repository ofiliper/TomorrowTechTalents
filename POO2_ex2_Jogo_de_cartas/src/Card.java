public class Card implements ICard{

    protected String name;
    protected String type;
    protected int cost;

    Card(String name, String type, int cost){
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getCardName() {
        return name;
    }

    public String getCardType() { return type; }

    public int getCardCost() {
        return cost;
    }

}
