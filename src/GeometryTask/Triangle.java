package GeometryTask;

public class Triangle extends GeometryFigure {
    private double baseA;
    private double baseB;
    private double baseC;
    private double height;

    public Triangle(double baseA, double baseB, double baseC, double height) {
        if (baseA < 0) {
            throw new IllegalArgumentException("BaseA cannot be negative");
        }
        if (baseB < 0) {
            throw new IllegalArgumentException("BaseB cannot be negative");
        }
        if (baseC < 0) {
            throw new IllegalArgumentException("BaseC cannot be negative");
        }
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
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
    public double area() {
        double gg =  (baseA * height) / 2;
        System.out.print("Area Triangle: " + gg);

        return  gg;
    }

    @Override
    public double perimetr() {
        double gg =  baseA + baseB + baseC;
        System.out.print("Perimetr Triangle: " + gg);

        return  gg;

    }

    @Override
    public void printInfo() {
        System.out.println("Triangle:");
        System.out.printf("Base A: %.2f%n", baseA);
        System.out.printf("Base B: %.2f%n", baseB);
        System.out.printf("Base C: %.2f%n", baseC);
        System.out.printf("Height: %.2f%n", height);
        System.out.printf("%n",area());
        System.out.printf("%n", perimetr());
    }
}
