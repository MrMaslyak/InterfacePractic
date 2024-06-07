public class Circle extends GeometryFigure {
    private final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
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
    void area() {
        System.out.println("Circle area: ");
        double area = pi * Math.pow(radius, 2);
        System.out.println(area);
    }
}
