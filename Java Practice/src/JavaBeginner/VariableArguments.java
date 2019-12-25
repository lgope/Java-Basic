package JavaBeginner;
//Created By Lakshman on 2/11/2019

public class VariableArguments {
    public static void main(String[] args) {

        print(10, 20, 30, 40, 50);
    }

    private static void print(int... args) {
        int sum = 0;

        for (int i : args) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
