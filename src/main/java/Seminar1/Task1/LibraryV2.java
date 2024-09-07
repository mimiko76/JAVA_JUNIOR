package Seminar1.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibraryV2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Преступление и наказание", "Фёдор Достоевский", 1866));
        books.add(new Book("Евгений Онегин", "Александр Пушкин", 1833));
        books.add(new Book("Война и мир", "Лев Толстой", 1833));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));

        // поиск книги по автору
        List<Book> authorBook = books.stream()
                .filter(book -> "Лев Толстой".equals(book.getAuthor()))
                .collect(Collectors.toList());
        System.out.println("Книги которые написал Лев Толстой" + authorBook);

        // поиск книг выпущенныне после 1866г.
        List<Book> booksAfterYear = books.stream()
                .filter(book -> book.getYear() > 1866).toList();
        System.out.println("Книги изданные после 1866" + booksAfterYear);

        List<String> uniqueTitle = books.stream()
                        .map(Book::getTitle).distinct().toList();
        System.out.println("Наименование книг" + uniqueTitle);
    }
}
