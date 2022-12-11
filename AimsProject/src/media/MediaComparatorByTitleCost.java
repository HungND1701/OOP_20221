package media;
import java.util.*;
public class MediaComparatorByTitleCost implements Comparator<Media>{
	public int compare(Media a, Media b) {
		if(a.getTitle().compareTo(b.getTitle())!=0) {
			return a.getTitle().compareTo(b.getTitle());
		}else {
			return (b.getCost()- a.getCost()) < 0 ? -1 : (b.getCost()- a.getCost()) > 0 ? 1: 0;
		}
	}
}
