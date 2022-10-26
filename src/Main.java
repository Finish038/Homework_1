import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<GeometricFigure> figures = new LinkedList<>();

        while (true) {
            System.out.println("""
                    Привет, 
                    выбери фигуру:
                    1 - круг
                    2 - треугольник
                    3 - прямоугольный треугольник
                    4 - равносторонний треугольник
                    5 - прямоугольник""");
            Scanner scanner = new Scanner(System.in);
            try {

                int userChoice = scanner.nextInt();

                GeometricFigure figure = switch (userChoice) {
                    case 1 -> FigureFactory.createCircle();
                    case 2 -> FigureFactory.createTriangle();
                    case 3 -> FigureFactory.createStraightTriangle();
                    case 4 -> FigureFactory.createEqualTriangle();
                    case 5 -> FigureFactory.createRectangle();
                    case 6 -> FigureFactory.createSquare();
                    case 7 -> FigureFactory.createPolygon();
                    default -> throw new IllegalStateException("Unexpected value: " + userChoice);
                };

                figures.add(figure);
            } catch (FigureCreateException | IllegalStateException | InputMismatchException exception) {
                exception.printStackTrace();
            } finally {// выполняется всегда
            }
            System.out.println("new loop");
        }

    }


}
