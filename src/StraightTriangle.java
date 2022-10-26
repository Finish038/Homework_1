public class StraightTriangle extends Triangle{

    public StraightTriangle(double a, double b) {
        super(a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    @Override
    public double getSquare() {
        return a * b / 2;
    }
}
