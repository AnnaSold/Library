public class ElBook extends Edition {
    String name;
    String author;
    String url;

    public ElBook(String name, String author, String url) {
        this.name = name;
        this.author = author;
        this.url = url;
    }

    @Override
    public String toString() {
        return "ElBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

//    @Override
//    public void printInfo(ElBook e) {
//        super.printInfo();
//        System.out.println(e);
//    }
}
