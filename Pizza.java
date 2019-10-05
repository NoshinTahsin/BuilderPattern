package builder_updated;

public class Pizza implements MainDish{
    private String dishName;
    public void setMainDish(String dish) {
        this.dishName=dish;
        //return this.dishName;
    }
    public String getMainDish() {
        return dishName;
    }
}


