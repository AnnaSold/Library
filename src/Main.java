import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Edition> editions = new ArrayList<>();
        Book b1 = new Book("Die", "Anna", 1, "Dunai", 2024);
        ElBook e1 = new ElBook("Преступление и наказаник ", "Ф.Н.Достоевский", "httpdjsbhj", 2012);
        Article a1 = new Article("Как выжить", "Hector", "Nature", 35, 2006);
        Book b2 = new Book("Преступление и наказаник ", "Ф.Н.Достоевский", 200, "hbh", 2008);

        editions.add(b1);
        editions.add(e1);
        editions.add(a1);
        editions.add(b2);

//Сортировка через stream закрыли поток терминальный методом collect
        // editions = editions.stream().sorted().collect(Collectors.toList());

//        for (Edition e: editions){
//            e.printInfo();
//        }

//Сортировка через stream закрыли поток терминальный методом foreach, сортировка внутри стрима и не изменяет список
        editions.stream().sorted(new EditionPublishingYearComparator()).forEach(e -> {
            e.printInfo();
            System.out.println("Ok");
        });
//получили объект класс, он создается на этапе компиляции, тк это перечисления
        SortingType s1 = SortingType.getByNum(2);
        //ередали в sorted компаратор
//        editions.stream().sorted(s1.getComparator()).forEach(e -> e.printInfo());

        //editions.stream().sorted().forEach(e->{e.printInfo();
        //реализация получения элемента Enum без Мap
        SortingType[] sortingTypes = SortingType.values();// получили маасив объектов
        int choice = 2;
        Comparator<Edition> comp;
        for (SortingType type : sortingTypes) {
            if (type.getNum() == choice) {
                comp = type.getComparator();

        editions.stream().sorted(comp).forEach(e -> e.printInfo());
    } }

    }

}





