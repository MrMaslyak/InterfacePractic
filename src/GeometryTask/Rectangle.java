package GeometryTask;

public class Rectangle extends GeometryFigure {
    private double widthA;
    private double lengthC;
    private double heightB;

    public Rectangle(double widthA, double heightB, double lengthC) {
        if (widthA < 0) {
            throw new IllegalArgumentException("WidthA cannot be negative");
        }
        if (heightB < 0) {
            throw new IllegalArgumentException("HeightB cannot be negative");
        }
        if (lengthC < 0) {
            throw new IllegalArgumentException("LengthC cannot be negative");
        }
        this.widthA = widthA;
        this.heightB = heightB;
        this.lengthC = lengthC;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public double getWidthA() {
        return widthA;
    }

    public void setWidthA(double widthA) {
        this.widthA = widthA;
    }

    public double getHeightB() {
        return heightB;
    }

    public void setHeightB(double heightB) {
        this.heightB = heightB;
    }

    @Override
    public double area() {
        double gg = widthA * heightB ;
        System.out.print("Area Rectangle: " + gg);

        return  gg;
    }

    @Override
    public double perimetr() {
        double gg = 2 * (widthA + lengthC) ;
        System.out.print("Perimetr Rectangle: " + gg);

        return  gg;
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle:");
        System.out.printf("Width: %.2f%n", widthA);
        System.out.printf("Height: %.2f%n", heightB);
        System.out.printf("Length: %.2f%n", lengthC);
        System.out.printf("%n", area());
        System.out.printf("%n", perimetr());
    }
}
