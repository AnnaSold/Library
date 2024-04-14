public class Book extends Edition {
    private int numberOfPages;
    private String publishingHouse;


    public Book(String name, String author, int numberOfPages, String publishingHouse, int publishingYear) {
        super(name, author, publishingYear);
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;

    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + getPublishingYear() +
                '}';
    }

}
