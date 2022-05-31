public class CardSpecialAttack extends CardAttack {

    protected String effects;

    CardSpecialAttack(String name, String type, int cost, int power, int resistence, String effects){
        super( name,  type,  cost, power, resistence, effects);
    }

    public String showEffects(){
        return effects;
    };
}