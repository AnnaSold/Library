import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public enum SortingType {
    //это объект
    AUTHOR(1, new Comparator<Edition>() {
        @Override
        public int compare(Edition o1, Edition o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }) ,
    NAME(2, new Comparator<Edition>() {
        @Override
        public int compare(Edition o1, Edition o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }),
    YEAR(3, new EditionPublishingYearComparator());


    private final int num ;
    private final Comparator<Edition> comparator;

    private static final  Map<Integer,SortingType> valueMap = new HashMap<>();

    static {for (SortingType s:values()){
        valueMap.put(s.num, s);
    }
    }
    SortingType(int num , Comparator<Edition> comparator ){
        this.num = num;
        this.comparator = comparator;
    }

    public Comparator<Edition> getComparator() {
        return comparator;
    }


    public static SortingType getByNum(int num){
        return valueMap.get(num);
    }

    public int getNum() {
        return num;
    }
}
