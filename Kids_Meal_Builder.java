package builder_updated;

public class Kids_Meal_Builder implements MealBuilder{
    private Meals meal;

    public Kids_Meal_Builder(){
        this.meal=new Meals();
    }
    @Override
    public void buildMainDish() {
        MainDish mainDish= new Burger();
        mainDish.setMainDish("Burger");
        meal.setMainDish(mainDish);
    }

    @Override
    public void buildDessert() {
        Desert desert=new Donut();
        desert.setDesert("Donut");
        meal.setDessert(desert);
    }

    @Override
    public void buildSoftDrinks() {
        Drinks drink=new Pepsi();
        drink.setDrinks("Pepsi");
        meal.setSoftDrinks(drink);
    }

    @Override
    public void buildGifts() {
        Gift gift=new Car();
        gift.setGift("Car");
        meal.setGift(gift);
    }

    @Override

    public Meals getMeal()
    {
        return this.meal;
    }
}

