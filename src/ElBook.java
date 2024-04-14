public class ElBook extends Edition {

   private String url;

    public ElBook(String name, String author, String url, int publishingYear) {
        super(name, author, publishingYear);
        this.url = url;
    }

    @Override
    public String toString() {
        return "ElBook{" +
                "name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", url='" + url + '\'' +
                "publishing Year" + getPublishingYear() +
                '}';
    }

//    @Override
//    public void printInfo(ElBook e) {
//        super.printInfo();
//        System.out.println(e);
//    }
}
