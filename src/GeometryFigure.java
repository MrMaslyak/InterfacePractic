abstract class GeometryFigure implements  Information{
    abstract double area();

    @Override
    public void printInfo() {
        System.out.println("Area: " + area());
    }
}
