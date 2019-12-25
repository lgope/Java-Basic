package JavaBeginner;
//Created By Lakshman on 1/30/2019

public class TernaryTester {
    public static void main(String[] args) {
        int x = 5;

        double y = 10.55;

        System.out.println("x+y = "+ x+y);

        System.out.println(x > 2? x < 4 ? 10 : 8 : 7);

        String str = "";

        for (int i = 1; i <= 10; i++) {
            str += i + " ";
        }

        System.out.println(str);
    }
}
