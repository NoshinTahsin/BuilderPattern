package builder_updated;

public class Burger implements MainDish {
    private String dishName;
    public void setMainDish(String dish) {
        this.dishName=dish;
        //System.out.println(dishName);
        //return dishName;
    }
    public String getMainDish() {
        return dishName;
    }


}
