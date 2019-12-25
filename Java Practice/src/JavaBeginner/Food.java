package JavaBeginner;

public class Food {

    String foodName;
    private int foodRating;
    private String foodTest = "Sour";

    public Food(String foodName, int foodRating){
        this.foodName = foodName;
        this.foodRating = foodRating;
//        System.out.println(this.foodTest);
    }

    /*public void Food(String foodName, int foodRating){
        this.foodName = foodName;
        this.foodRating = foodRating;
        System.out.println(this.foodTest);
    }*/


    public int getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(int foodRating) {
        this.foodRating = foodRating;
    }

    public String getFoodTest() {
        return foodTest;
    }

    public void setFoodTest(String foodTest) {
        this.foodTest = foodTest;
    }
}
