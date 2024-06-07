public class Triangle extends GeometryFigure {
    private double baseA;
    private double heightB;

    public Triangle(double a, double h) {
        this.baseA = a;
        this.heightB = h;
    }

    public double getA() {
        return baseA;
    }

    public void setA(double baseA) {
        this.baseA = baseA;
    }

    public double getH() {
        return heightB;
    }

    public void setH(double height) {
        this.heightB = height;
    }

    @Override
    double area() {
        System.out.println("Triangle area: ");
        double area = (baseA * heightB) / 2;
        System.out.println(area);
        return area;
    }

}
