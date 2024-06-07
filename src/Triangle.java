public class Triangle extends GeometryFigure {
    private double baseA;
    private double baseB;
    private double baseC;
    private double height;

    public Triangle(double baseA, double baseB, double baseC, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.baseC = baseC;
        this.height = height;
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getBaseC() {
        return baseC;
    }

    public void setBaseC(double baseC) {
        this.baseC = baseC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double area() {
        System.out.println("Triangle area: ");
        double area = (baseA * height) / 2;
        System.out.println(area);
        return area;
    }

    @Override
    double perimetr() {
        System.out.println("Triangle perimetr: ");
        double perimetr = baseA + baseB + baseC;
        System.out.println(perimetr);
        return perimetr;
    }

}
