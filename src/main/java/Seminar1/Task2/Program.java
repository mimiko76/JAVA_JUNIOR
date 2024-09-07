package Seminar1.Task2;

import java.util.Scanner;

public class Program {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        UMarket market = new UMarket();
        System.out.println("Добро пожаловать в наш магазин");
        while (true){
            System.out.println("==============================");
            System.out.println("0 - Выйти из приложения");
            System.out.println("1 - Отобразить полный список товаров");
            System.out.println("2 - Сформировать онлайн корзину из снеков ");
            System.out.println("3 - Сформировать онлайн корзину из полуфабрикатов");
            System.out.println("4 - Сформировать корзину из полуфабрикатов");
            System.out.println("5 - Сформировать козрину из продуктов для приготовления");
            System.out.println("6 - Сформировать оналайн корзину из любых продовольственных товаров");
            System.out.println("Выберите пункт меню:");

            if(scanner.hasNextInt()){
                int no = scanner.nextInt();
                scanner.nextLine();
                switch (no){
                    case 0-> {
                        System.out.println("До свидания");
                        return;
                    }
                    case 1->{
                        System.out.println("Список товаров: ");
                        market.printThings(Snack.class);
                    }
                }
            }
            else {
                System.out.println("Некоректный пункт меню. \nПожалуйста, повторите попытку вводы.");
                scanner.nextInt();
            }

        }

    }

    public void CreateCart(){

    }
}
