public class Article extends Edition {
    String name;
    String author;
    String nameOfMagazine;
    int numberMagazine;
    int publishingYear;

    public Article(String name, String author, String nameOfMagazine, int numberMagazine, int publishingYear) {
        this.name = name;
        this.author = author;
        this.nameOfMagazine = nameOfMagazine;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", nameOfMagazine='" + nameOfMagazine + '\'' +
                ", numberMagazine=" + numberMagazine +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
