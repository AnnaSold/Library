public class Article extends Edition {

    private String nameOfMagazine;
    private int numberMagazine;


    public Article(String name, String author, String nameOfMagazine, int numberMagazine, int publishingYear) {
        super(name, author, publishingYear);
        this.nameOfMagazine = nameOfMagazine;
        this.numberMagazine = numberMagazine;

    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", nameOfMagazine='" + nameOfMagazine + '\'' +
                ", numberMagazine=" + numberMagazine +
                ", publishingYear=" + getPublishingYear() +
                '}';
    }
}
