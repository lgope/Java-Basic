package com.jetbrains;

public class ShapeRectangleTriangle {
    public static void main(String[] args) {

        /*Shape s = new Shape();
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(10.0, 5.6);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());*/

        Shape[] s = new Shape[3];

        s[0] = new Shape ();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle (10, 20);

        for (int i = 0; i < 3; i++)
            System.out.println(s[i].area());
    }
}
