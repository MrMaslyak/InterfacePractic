abstract class GeometryFigure implements  Information{
    abstract double area();
abstract double perimetr();
    @Override
    public void printInfo() {
        System.out.println("Area: " + area());
        System.out.println("Perimetr: " + perimetr());
    }

}
