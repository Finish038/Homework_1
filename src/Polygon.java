public class Polygon implements PolygonInt{
    int n;
    int a;

    public Polygon(int n, int a) {
        this.n = n;
        this.a = a;
    }

    @Override
    public double getInscribed() {
        return a / (2 * Math.tan(180/n));  // degrees or radians
    }

    @Override
    public double getCircumscribed() {
        return a / (2 * Math.sin(180 / n)); // degrees or radians
    }

    @Override
    public double getPerimetr() {
        return n * a;
    }

    @Override
    public double getSquare() {
        return n * Math.pow(a, 2) / (4 * Math.tan(180/n)); // degrees or radians
    }
}
