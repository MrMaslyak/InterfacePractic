package GeometryTask;

import Interface.Information;

public abstract class GeometryFigure implements Information {
    public abstract double area();
    public abstract double perimetr();

    @Override
    public void printInfo() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimetr());
    }
}
