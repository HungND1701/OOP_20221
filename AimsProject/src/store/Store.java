package store;
import java.util.*;
import media.DigitalVideoDisc;
public class Store {
	private static final int MAX_NUMBERS_ITEM = 50;
	private List<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	private int qtyItemStore = 0;
	
	public  int getQtyItemStore() {
		return this.qtyItemStore;
	}
	private void setQtyItemStore(int qtyItemStore) {
			this.qtyItemStore = qtyItemStore;
	}
	public  void addDVD(DigitalVideoDisc disc){
		if(qtyItemStore == MAX_NUMBERS_ITEM) {
			System.out.println("The store is almost full");
			return;
		}else {
			itemsInStore.add(disc);
			setQtyItemStore(qtyItemStore+1);
			System.out.println("The store has been added ");
		}
	}
	public  void removeDVD(DigitalVideoDisc disc){
		if(itemsInStore.isEmpty() ) {
			System.out.println("Store is empty ");
			return;
		}
		for(int i = this.qtyItemStore; i >=0;i--) {
			if(disc.equals(itemsInStore.get(i))) {
				itemsInStore.remove(i);
			}
		}
		System.out.println("The DVD has been removed");
	}
	public void printStore() {
		for(int i = 0 ;i<itemsInStore.size();i++) {
			System.out.println(itemsInStore.get(i).toString());
		}
		
	}
	
}
