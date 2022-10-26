public class Triangle implements  GeometricFigure, AngledFigure{

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getInscribed() {
        return 2 * this.getSquare() / (a + b + c);
    }

    @Override
    public double getCircumscribed() {
        return a * b * c / (4 * this.getSquare());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o){ //полностью наследуем сигнатуру метода, сравниваем с любым объектом
        if (this == o) { //this всегда существует, значит о не null
            return true;
        }
        if (o == null || !(o instanceof Triangle t)) { // сразу создаем объект t в которую кастим о
            return false;
        }
        //casting
        return a == t.a && b == t.b && c == t.c;
    }

    @Override
    public int hashCode(){
        return (int) (a * 11 + b * 13 - c * 19);
    }

}
