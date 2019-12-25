package JavaBeginner;

public class AreaTriangle {

    public static void main(String[] args) {

        double base = 20.0d, height = 110.5d;

        double result = areaTriangle(base, height);

        System.out.println("Area of Triangle: "+ result);
    }

    public static double areaTriangle(double base, double height){

        return (base*height)/2;
    }
}
