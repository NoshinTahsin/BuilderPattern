package builder_updated;

public class MenuPlanner {
    private MealBuilder mealBuilder;


    public MenuPlanner(MealBuilder kidsMealBuilder){

        this.mealBuilder=kidsMealBuilder;
    }

    public Meals getMeal(){
        return this.mealBuilder.getMeal();
    }

    public void makeMeal(){
        this.mealBuilder.buildMainDish();
        this.mealBuilder.buildDessert();
        this.mealBuilder.buildSoftDrinks();
        this.mealBuilder.buildGifts();
    }
}


