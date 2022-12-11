package cart;
import media.*;
import java.util.*;
public class Cart {
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	
	public Media removeMedia(Media media) {
		if(itemsOrdered.isEmpty() ) {
			System.out.println("Store is empty ");
			return null;
		}
		return itemsOrdered.remove(itemsOrdered.indexOf(media));
	}
	
	public double totalCost(){
		double total=0;
		for(Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}
	
}
