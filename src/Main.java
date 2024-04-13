import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Edition> editions = new ArrayList<Edition>();
        Book b1 = new Book("Die", "Anna", 1, "Dunai", 2024);
        ElBook e1 = new ElBook("Преступление и наказаник ", "Ф.Н.Достоевский", "httpdjsbhj");
        Article a1 = new Article("Как выжить", "Hector", "Nature", 35,2006);
        editions.add(b1);
        editions.add(e1);
        editions.add(a1);
        for (Edition e: editions){
            System.out.println(e);
        }

    }


}





