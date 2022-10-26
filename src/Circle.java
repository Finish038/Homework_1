public class Circle implements GeometricFigure{

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return  (2 * Math.PI * r);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + r +
                "}";
    }
}
