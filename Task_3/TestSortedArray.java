public class TestSortedArray {
    public static void main(String[] args) {
        System.out.println("=== Тестирование SortedStringArray ===\n");

        // Создаем массив
        SortedStringArray strings = new SortedStringArray();

        // Добавляем строки (без сортировки)
        System.out.println("1. Добавляем строки:");
        strings.add("кошка");
        strings.add("собака");
        strings.add("слон");
        strings.add("мышь");
        strings.add("жираф");

        System.out.print("Массив: ");
        strings.print();
        System.out.println("Размер: " + strings.getSize());

        // Получаем самую длинную строку
        System.out.println("\n2. Самая длинная строка:");
        String max = strings.getMax();
        System.out.println("Максимальная: \"" + max + "\" (длина: " + max.length() + ")");

        // Получаем среднюю длину
        System.out.println("\n3. Средняя длина строк:");
        double avg = strings.getAverageLength();
        System.out.println("Средняя длина: " + String.format("%.2f", avg));

        // Сортируем массив
        System.out.println("\n4. Сортируем по длине:");
        strings.sort();
        System.out.print("Отсортированный массив: ");
        strings.print();

        // Проверяем после сортировки
        System.out.println("\n5. Проверка после сортировки:");
        System.out.println("Максимальная: \"" + strings.getMax() + "\"");
        System.out.println("Средняя длина: " + String.format("%.2f", strings.getAverageLength()));

        // Добавляем еще строк
        System.out.println("\n6. Добавляем еще строк:");
        strings.add("тигр");
        strings.add("крокодил");
        strings.add("енот");

        System.out.print("Массив до сортировки: ");
        strings.print();

        strings.sort();
        System.out.print("Массив после сортировки: ");
        strings.print();
    }
}



