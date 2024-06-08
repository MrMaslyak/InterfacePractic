package GeometryTask;

public class Circle extends GeometryFigure {
    private final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double result = pi * Math.pow(radius, 2);
        System.out.print("Area Circle: " + result);
        return result;
    }

    @Override
    public double perimetr() {
        double result = 2 * pi * radius;
        System.out.print("Perimetr Circle: " + result);
        return result;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle:");
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("%n",area());
        System.out.printf("%n", perimetr());
    }
}
