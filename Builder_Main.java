package builder_updated;

import java.util.Scanner;

public class Builder_Main {
    public static void main(String[]args){

        System.out.println("Press 1 for kidsmeal or 2 for adultsmeal");
        Scanner input=new Scanner(System.in);
        int in=input.nextInt();
        if (in==1) {
            MealBuilder kidsMealBuilder= new Kids_Meal_Builder();
            MenuPlanner director= new MenuPlanner(kidsMealBuilder);
            director.makeMeal();
            Meals newMeal= director.getMeal();
            System.out.println("Kids Meal");
            System.out.println(newMeal.getMainDish());
            System.out.println(newMeal.getDessert());
            System.out.println(newMeal.getSoftDrinks());
            System.out.println(newMeal.getGift());
        }


        //MealBuilder adultsMealBuilder= new AdultMealBuilder();

       // MealDirector director2= new MealDirector(adultsMealBuilder);

        //director2.makeMeal();

       // Meals newMeal2= director2.getMeal();
        if (in ==2) {
            MealBuilder kidsMealBuilder= new Adult_Meal_Builder();
            MenuPlanner director= new MenuPlanner(kidsMealBuilder);
            director.makeMeal();
            Meals newMeal= director.getMeal();
            System.out.println("Adults Meal");
            System.out.println(newMeal.getMainDish());
            System.out.println(newMeal.getDessert());
            System.out.println(newMeal.getSoftDrinks());
            System.out.println(newMeal.getGift());
        }
    }

}
