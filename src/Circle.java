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
    double area() {
        System.out.println("Circle area: ");
        double area = pi * Math.pow(radius, 2);
        System.out.println(area);
        return area;
    }

    @Override
    double perimetr() {
        System.out.println("Perimetr area: ");
        double perimetr = 2 * pi * Math.pow(radius, 2);
        System.out.println(perimetr);
        return perimetr;
    }

}
