public class Rectangle extends GeometryFigure {
    private double widthA;
    private double lengthC;
    private double heightB;

    public Rectangle(double widthA, double height, double lengthC) {
        this.widthA = widthA;
        this.heightB = height;
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
    double area() {
        System.out.println("Rectangle area: ");
        double area = widthA * heightB;
        System.out.println(area);
        return area;
    }

    @Override
    double perimetr() {
        System.out.println("Rectangle perimetr: ");
        double perimetr = widthA + lengthC;
        System.out.println(perimetr);
        return perimetr;
    }


}
