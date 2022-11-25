package store;

import dvd.DigitalVideoDisc;
public class Store {
	private static final int MAX_NUMBERS_ITEM = 50;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ITEM];
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
			itemsInStore[qtyItemStore] = disc;
			setQtyItemStore(qtyItemStore+1);
			System.out.println("The store has been added ");
		}
	}
	public  void removeDVD(DigitalVideoDisc disc){
		if(itemsInStore == null ) {
			System.out.println("Store is empty ");
			return;
		}
		
		int i = 0;
		while(i < qtyItemStore ) {
			if(disc.equals(itemsInStore[i])) {
				for(int j = i;j<qtyItemStore;j++) {
					itemsInStore[j] = itemsInStore[j+1];
				}
				setQtyItemStore(qtyItemStore-1 );
			}else {
				i++;
				continue;
			}
		}
		System.out.println("The DVD has been removed");
	}
	public void printStore() {
		for(int i = 0 ;i<qtyItemStore;i++) {
			System.out.println(itemsInStore[i].toString());
		}
		
	}
	
}
