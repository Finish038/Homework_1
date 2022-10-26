import java.util.Scanner;

public class FigureFactory {
    private static Scanner scanner = new Scanner(System.in);
    public static Circle createCircle() throws FigureCreateException {
        System.out.println("Введите радиус");
        int r = scanner.nextInt();
        if (r <= 0) {
            throw new FigureCreateException("радиус должен быть больше нуля");
        }
        Circle circle = new Circle(r);
        System.out.println("Окружность создана");
        System.out.println("circle = " + circle);
        return circle;
    }

    public static Triangle createTriangle() throws FigureCreateException {
        System.out.println("Введите первую сторону");
        int a = scanner.nextInt();
        System.out.println("Введите вторую сторону");
        int b = scanner.nextInt();
        System.out.println("Введите третью сторону");
        int c = scanner.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new FigureCreateException("Длина стороны должна быть больше нуля"); // что выполняется дольше по программе? сюда не возвращаемся?
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new FigureCreateException("Треугольник с такими длинами сторон не может существовать");
        }
        Triangle triangle;
        if (a == c && a == b) { // check for equal
            triangle = new EqualTriangle(a);
        }
        // check for straight
        else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            triangle = new StraightTriangle(b, c);
        }
        else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
            triangle = new StraightTriangle(a, c);
        }
        else if (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
            triangle = new StraightTriangle(a, b);
        }
        else {
            triangle = new Triangle(a, b, c);
        }
        System.out.println("Треугольник создан");
        System.out.println("triangle = " + triangle);
        //System.out.println("Периметр = " + triangle.getPerimetr());
        return triangle;
    }

    public static StraightTriangle createStraightTriangle() {
        System.out.println("Введите первый катет");
        int a = scanner.nextInt();
        System.out.println("Введите второй катет");
        int b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            throw new FigureCreateException("Длина стороны должна быть больше нуля");
        }
        StraightTriangle straightTriangle = new StraightTriangle(a, b);
        System.out.println("Прямоугольный треугольник создан");
        System.out.println("StraightTriangle = " + straightTriangle);
        return straightTriangle;
    }

    public static EqualTriangle createEqualTriangle() {
        System.out.println("Введите сторону");
        int a = scanner.nextInt();
        if (a <= 0) {
            throw new FigureCreateException("Длина стороны должна быть больше нуля");
        }
        EqualTriangle equalTriangle = new EqualTriangle(a);
        System.out.println("Равносторонний треугольник создан");
        System.out.println("EqualTriangle = " + equalTriangle);
        return equalTriangle;
    }

    public static Rectangle createRectangle() {
        System.out.println("Введите первую сторону");
        int a = scanner.nextInt();
        System.out.println("Введите вторую сторону");
        int b = scanner.nextInt();
        Rectangle rectangle;
        if (a <= 0 || b <= 0) {
            throw new FigureCreateException("Длина стороны должна быть больше нуля");
        }
        if (a == b) {
            rectangle = new Square(a);
        }
        else {
            rectangle = new Rectangle(a, b);
        }
        System.out.println("Прямоугольник создан");
        System.out.println("rectangle = " + rectangle);
        return rectangle;
    }

    public static Square createSquare() {
        System.out.println("Введите сторону");
        int a = scanner.nextInt();
        if (a <= 0) {
            throw new FigureCreateException("Длина стороны должна быть больше нуля");
        }
        Square square = new Square(a);
        System.out.println("Квадрат создан");
        System.out.println("Square = " + square);
        return square;
    }

    public static PolygonInt createPolygon() {
        System.out.println("Введите сторону");
        int a = scanner.nextInt();
        if (a <= 0) {
            throw new FigureCreateException("Длина стороны должна быть больше нуля");
        }
        System.out.println("Введите количество сторон");
        int n = scanner.nextInt();
        if (n <= 2) {
            throw new FigureCreateException("количество сторон должно быть больше 2");
        }
        PolygonInt polygon;
        if (n == 3) {
            polygon = new EqualTriangle(a);
        }
        else if (n == 4) {
            polygon = new Square(a);
        }
        else {
            polygon = new Polygon(n, a);
        }
        System.out.println("Полигон создан");
        System.out.println("Polygon = " + polygon);
        return polygon;
    }
}
