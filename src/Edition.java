public abstract class Edition implements Comparable<Edition> {
    private String name;
    private String author;
    private int publishingYear;

    public void printInfo() {
        System.out.println(this);

    }

    public Edition(String name, String author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public int compareTo(Edition o) {
        int p1 = this.author.compareTo(o.author);
        if (p1 != 0) {
            return p1;
        }
        int p2 = this.name.compareTo(o.name);
        if (p2 != 0){
            return p2;
        }
        return  Integer.compare(this.publishingYear, o.publishingYear);

  }
}
