package cart;
import media.*;
import store.Store;

import java.util.*;
public class Cart {
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public int getSize() {
		return itemsOrdered.size();
	}
	public boolean addMedia(Media media) {
		if(itemsOrdered.add(media)) return true;
		else {
			
			return false;
		}
	}
	public Media getMediaInIndex(int i) {
		return itemsOrdered.get(i);
	}
	public Media removeMedia(Media media) {
		if(itemsOrdered.isEmpty() ) {
			System.out.println("Store is empty ");
			return null;
		}
		else{
			System.out.println("The Media was removed in Cart.");
			return itemsOrdered.remove(itemsOrdered.indexOf(media));
		}
	}
	
	public double totalCost(){
		double total=0;
		for(Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}
	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
	public Cart SearchMedia(String title) {
		Cart listSearch = new Cart();
		for(Media m : itemsOrdered) {
			if(m.getTitle().equals(title)) {
				listSearch.addMedia(m);;
			}
		}
		return listSearch;
	}
	public boolean isEmpty() {
		return itemsOrdered.isEmpty();
	}
	public boolean printCart() {
		if(this.isEmpty()) {
			System.out.println("Cart is empty !\n");
			return false;
		}
		for(Media m : itemsOrdered) {
			System.out.println(m.toString());
		}
		return true;
	}
	public void emptyCart() {
		while(!itemsOrdered.isEmpty()) {
			itemsOrdered.remove(getSize()-1);
		}
	}
}
