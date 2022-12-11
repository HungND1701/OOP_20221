package media;
import java.util.*;
public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media a, Media b) {
		if(a.getCost() == b.getCost()) {
			return a.getTitle().compareTo(b.getTitle());
		}else {
			return (b.getCost()-a.getCost()) < 0 ? -1 : 1;
		}
	}
}
