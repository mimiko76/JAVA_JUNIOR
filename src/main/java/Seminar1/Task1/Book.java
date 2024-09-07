package Seminar1.Task1;

 class Book {

    //region toString
    @Override
    public String toString() {
        return "Книга{" +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Год издания=" + year +
                '}';
    }
    //endregion

    //region Конструкторы
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    // endregion

    //region Геттеры
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    //endregion

    // region поля
    private final String title; //название книги
    private final String author; // Автор книги
    private final int year; // Год издания книги
    //endregion

}
