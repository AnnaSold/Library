public class Book extends Edition {
    String name;
    String author;
    int numberOfPages;
    String publishingHouse;
    int publishingYear;

    public Book(String name, String author, int numberOfPages, String publishingHouse, int publishingYear) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
