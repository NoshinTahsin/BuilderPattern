package builder_updated;

public class Adult_Meal_Builder implements MealBuilder{

    private Meals meal;

    public Adult_Meal_Builder(){
        this.meal=new Meals();
    }
    @Override
    public void buildMainDish() {
        MainDish mainDish= new Pizza();
        mainDish.setMainDish("Pizza");
        meal.setMainDish(mainDish);
    }

    @Override
    public void buildDessert() {
        Desert desert= new Cheesecake();
        desert.setDesert("Cheese-cake");
        meal.setDessert(desert);
    }

    @Override
    public void buildSoftDrinks() {
        Drinks drink=new Fanta();
        drink.setDrinks("Fanta");
        meal.setSoftDrinks(drink);
    }

    @Override
    public void buildGifts() {
        Gift gift=new Keyring();
        gift.setGift("key ring");
        meal.setGift(gift);
    }

    @Override
    public Meals getMeal() {
        return this.meal;
    }
}



 
	