package store;
import java.util.*;
import media.*;
public class Store {
	private static final int MAX_NUMBERS_ITEM = 100;
	private List<Media> itemsInStore = new ArrayList<Media>();
	public Store() {
		
	}
	public int getSize() {
		return itemsInStore.size();
	}
	public Media getMediainIndex(int i) {
		return itemsInStore.get(i);
	}
	public boolean addMedia(Media media){
		if(this.getSize() == MAX_NUMBERS_ITEM) {
			System.out.println("The store is almost full");
			return false;
		}else {
			itemsInStore.add(media);
			return true;
		}
	}
	public void addMediaSearch(Media media) {
		itemsInStore.add(media);
	}
	public Media removeMedia(Media media){
		if(itemsInStore.isEmpty() ) {
			System.out.println("Store is empty ");
			return null;
		}
		Media mda = itemsInStore.remove(itemsInStore.indexOf(media));
		System.out.println("The media has been removed");
		return mda;
	}
	public void printStore() {
		System.out.println();
		for(int i = 0 ;i<itemsInStore.size();i++) {
			System.out.println(itemsInStore.get(i).toString());
		}
		
	}
	public Store SearchMedia(String title) {
		Store listSearch = new Store();
		for(Media m : itemsInStore) {
			if(m.getTitle().equals(title)) {
				listSearch.addMediaSearch(m);
			}
		}
		return listSearch;
	}
}
