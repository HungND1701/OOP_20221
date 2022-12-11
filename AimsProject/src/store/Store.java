package store;
import java.util.*;
import media.*;
public class Store {
	private static final int MAX_NUMBERS_ITEM = 100;
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	public  void addMedia(Media media){
		if(itemsInStore.size() == MAX_NUMBERS_ITEM) {
			System.out.println("The store is almost full");
			return;
		}else {
			itemsInStore.add(media);
			System.out.println("The media has been added ");
		}
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
		for(int i = 0 ;i<itemsInStore.size();i++) {
			System.out.println(itemsInStore.get(i).toString());
		}
		
	}
	
}
