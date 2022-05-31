public class CardAttack extends Card {

    protected int power;
    protected int resistence;
    protected String effects;

    CardAttack(String name, String type, int cost, int power, int resistence, String effects){
        super( name,  type,  cost);
        this.power = power;
        this.resistence = resistence;
        this.effects = effects;
    }


    public int getPower(){
        return power;
    }
    public int getResistence(){
        return resistence;
    }


}
