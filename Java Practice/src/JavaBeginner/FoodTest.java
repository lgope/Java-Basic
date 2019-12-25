package JavaBeginner;

public class FoodTest {

    public static void main(String[] args) {
        Food f1 = new Food("Burge", 10);
        Food f2 = new Food("Pizza", 8);
        Food f3;

        f3 = f2;
        f3.setFoodTest("spicy");

        System.out.println(f1.getFoodTest());
        System.out.println(f2.getFoodTest());

    }
}

