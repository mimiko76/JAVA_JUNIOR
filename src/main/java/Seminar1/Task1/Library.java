package Seminar1.Task1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Преступление и наказание", "Фёдор Достоевский", 1866));
        books.add(new Book("Евгений Онегин", "Александр Пушкин", 1833));
        books.add(new Book("Война и мир", "Лев Толстой", 1833));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));

        // поиск книги по автору
        List<Book> authorBook = new ArrayList<>();
        for(Book book: books){
            if("Лев Толстой".equalsIgnoreCase(book.getAuthor())){
                authorBook.add(book);
            }
        }
        System.out.println("Лев Толстой" + authorBook);

        // поиск книг выпущенныне после 1866г.
        List<Book> authorBookYear = new ArrayList<>();
        for(Book book: books){
            if(book.getYear() > 1866){
                authorBookYear.add(book);
            }
        }
        System.out.println("Книги изданные после 1866" + authorBook);

        List<String> uniqueTitle = new ArrayList<>();
        for(Book book: books){
            if(!uniqueTitle.contains(book.getTitle())){
                uniqueTitle.add(book.getTitle());
            }
        }
        System.out.println("Наименование книг" + uniqueTitle);
    }
}
