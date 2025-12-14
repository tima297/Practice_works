public class SortedStringArray {
    private String[] array;  // массив для хранения строк
    private int size;        // текущее количество элементов
    private int capacity;    // вместимость массива

    // Конструктор
    public SortedStringArray() {
        capacity = 10;
        array = new String[capacity];
        size = 0;
    }

    // Добавить строку (без сортировки)
    public void add(String str) {
        // Если массив полон - увеличиваем
        if (size == capacity) {
            String[] newArray = new String[capacity * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            capacity = capacity * 2;
        }

        // Добавляем в конец
        array[size] = str;
        size++;
    }

    // Получить самую длинную строку
    public String getMax() {
        if (size == 0) return null;

        String max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        return max;
    }

    // Получить среднюю длину строк
    public double getAverageLength() {
        if (size == 0) return 0;

        int total = 0;
        for (int i = 0; i < size; i++) {
            total += array[i].length();
        }
        return (double) total / size;
    }

    // Отсортировать массив по длине строк
    public void sort() {
        // Простая сортировка пузырьком
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    // Меняем местами
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Вывести массив
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print("\"" + array[i] + "\"");
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Получить размер массива
    public int getSize() {
        return size;
    }
}


