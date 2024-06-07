public class Rectangle extends GeometryFigure {
    private double widthA;
    private double heightB;

    public Rectangle(double widthA, double heightB) {
        this.widthA = widthA;
        this.heightB = heightB;
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
    void area() {
        System.out.println("Rectangle area: ");
        double area = widthA * heightB;
        System.out.println(area);
    }
}
