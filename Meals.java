package builder_updated;

public class Meals implements MenuPlan {
    private MainDish mainDish;
    private Desert dessert;
    private Drinks softDrinks;
    private Gift gift;


    @Override
    public void setMainDish(MainDish mainDish) {
        this.mainDish=mainDish;
    }

    public String getMainDish(){
        //System.out.println(mainDish);
        return mainDish.getMainDish();
    }
    @Override
    public void setDessert(Desert dessert) {
        this.dessert=dessert;

    }

    public String getDessert(){
        return dessert.getDesert();
    }
    @Override
    public void setSoftDrinks(Drinks softDrinks) {
        this.softDrinks=softDrinks;
    }

    public String getSoftDrinks(){
        return softDrinks.getDrinks();
    }
    @Override
    public void setGift(Gift gift) {
        this.gift=gift;
    }
    public String getGift(){
        return gift.getGift();
    }
}

