package JavaBeginner;
//Created By Lakshman on 2/2/2019

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b =  a.append("Java "); //new StringBuilder(" Oracle ");
        b = b.append("is").append(" so ").append("Cool");

        System.out.println(a);
        System.out.println(b);

        int numDogs = 4;
        String dogType = "husky";
        String anotherDog = dogType + 1;
        System.out.println(anotherDog+ " " + dogType);
        System.out.println(numDogs+ " "+ 1);

        String s = "Hello";
        String t = new String(s);

        System.out.println();
        if ("Hello" == s)
            System.out.println("one");
        if (t == s)
            System.out.println("two");
        if (s == t)
            System.out.println("three");

        if ("Hello" == t)
            System.out.println("four");

        System.out.println(1<<6);
    }
}
