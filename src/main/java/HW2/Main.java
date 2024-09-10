package HW2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Получаем класс String
        Class<String> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим информацию о каждом методе
        System.out.println("Методы класса String:");
        for (int i = 0; i < methods.length; i++) {
            System.out.printf("Метод №%s: %s%n",i+1,methods[i]);
        }
    }
}
