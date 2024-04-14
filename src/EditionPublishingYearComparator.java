import java.util.Comparator;

public class EditionPublishingYearComparator implements Comparator<Edition> {


    @Override
    public int compare(Edition o1, Edition o2) {
        return o1.getPublishingYear()- o2.getPublishingYear();
    }
}
