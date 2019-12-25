package JavaBeginner;

public class ComplexImmutableClass {
    private final double real;
    private final double imaginary;

    public ComplexImmutableClass(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexImmutableClass plus(ComplexImmutableClass b) {
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new ComplexImmutableClass(newReal, newImaginary);
    }

    public ComplexImmutableClass minus(ComplexImmutableClass otherComplex) {
        double newReal = real - otherComplex.real;
        double newImaginary = imaginary - otherComplex.imaginary;
        return new ComplexImmutableClass(newReal, newImaginary);
    }

    public ComplexImmutableClass times(ComplexImmutableClass b) {
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImaginary = real * b.imaginary + imaginary * b.real;
        return new ComplexImmutableClass(newReal, newImaginary);
    }

    public static ComplexImmutableClass plus(ComplexImmutableClass a, ComplexImmutableClass b) {
//        double real = a.real + b.real;
//        double imaginary = a.imaginary + b.imaginary;
//        return new Complex(real, imaginary);
        return a.plus(b);
    }

    public static void main(String[] args) {
        ComplexImmutableClass a = new ComplexImmutableClass(6.0,12.0);
        ComplexImmutableClass b = new ComplexImmutableClass(4.0,10.0);

        ComplexImmutableClass bPlusA = ComplexImmutableClass.plus(a, b);

        System.out.println("a real= " + a.real + " imaginary= " + a.imaginary);
        System.out.println("b real= " + b.real + " imaginary= " + b.imaginary);
        System.out.println("b + a real= " + bPlusA.real + " imaginary= " + bPlusA.imaginary);
        System.out.println();
    }
}