import java.util.Objects;

public class Rectangle implements AngledFigure {

    double lenght;
    double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }


    @Override
    public double getPerimetr() {
        return 2 * (lenght + width);
    }

    @Override
    public double getSquare() {
        return lenght * width;
    }

    @Override
    public double getInscribed() {
        return -1;
    }

    @Override
    public double getCircumscribed() {
        return Math.sqrt(Math.pow(lenght, 2) + Math.pow(width, 2)) / 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + lenght +
                ", width = " + width +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.lenght, lenght) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, width);
    }
}
