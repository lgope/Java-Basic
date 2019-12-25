package JavaBeginner;
//Created By Lakshman on 1/24/2019

public class WaterTank {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank();
        System.out.print("Empty = "+waterTank.empty);
        System.out.print(",Brand = "+waterTank.brand);
    }
}
