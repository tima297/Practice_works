public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        // Проверяем, что треугольник существует
        if (a <= 0 || b <= 0 || c <= 0 ||
                a + b <= c ||
                a + c <= b ||
                b + c <= a) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        // Формула Герона
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

}
