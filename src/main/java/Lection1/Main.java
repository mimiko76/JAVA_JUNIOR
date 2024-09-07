package Lection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x+y);
//            }
//        };
        PlainInterface plainInterface = (x,y) -> String.valueOf(x+y);//Стандартное лямбда выражение
        PlainInterface plainInterface1 = (x,y)-> {
            x +=2;
            return String.valueOf(x+y);
        }; // Многострочное выражение
        PlainInterface2 plainInterface2 = Integer::compare;//Т.К у нас функиональный интерфейс мы можем подставить значение в другой метод
        System.out.println(plainInterface.action(1,6));
        System.out.println(plainInterface1.action(1,6));
        System.out.println(plainInterface2.action(56,6));


        List<String> list = Arrays.asList("Привет", "мир", "!!");
        list =list.stream()
                .filter(str -> str.length() >=3)
                .collect(Collectors.toList());
        //str - название строки для каждого эллемента. Запишев в наш лист те строки где длинна больше 4
        for(String item: list){
            System.out.print(item + " ");
        }
        list.stream()
                .filter(str -> str.length() >= 3)
                .forEach(System.out::println);// тоже самое но без записи в лист и сразу вывод на экран
        list.stream()
                .filter(str -> str.length() >= 3)
                .filter(str -> str.contains("!"))
                .forEach(System.out::println);
        List<Integer> list1 = Arrays.asList(15,13,3,22,5);
        list1.stream()
                .map(chislo -> "Число: " + chislo + " квадрта числа: " + chislo*chislo)
                .sorted()
                .forEach(System.out::println); //еще и сортируем массив
        List<User> list2 = Arrays.asList(new User("Павел", 25),new User("Gena",54),new User("Petr",33));
        list2.stream()
                .map(user -> new User(user.getName(), user.getAge() - 5))
                .forEach(System.out::println);
    }
}
