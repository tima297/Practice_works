public static void main(String[] args) {
    System.out.println("=== Тестируем фигуры ===\n");

    // 1. Тестируем прямоугольник
    System.out.println("1. Прямоугольник:");
    try {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Площадь: " + rect.getArea());
        System.out.println("Периметр: " + rect.getPerimeter());
    } catch (RuntimeException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    // 2. Тестируем круг
    System.out.println("\n2. Круг:");
    try {
        Circle circle = new Circle(7);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
    } catch (RuntimeException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    // 3. Тестируем треугольник
    System.out.println("\n3. Треугольник:");
    try {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    } catch (RuntimeException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    // 4. Тестируем ошибки
    System.out.println("\n4. Тестируем ошибки:");


}
