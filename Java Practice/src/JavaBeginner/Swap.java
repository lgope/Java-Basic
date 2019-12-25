package JavaBeginner;

public class Swap {
    public static void main(String[] args) {

        int a = 10, b = 20;

        int res = swap(a, b);

        System.out.println(res);
    }

    public static int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        return  b;
    }
}
