package cart;
import media.DigitalVideoDisc;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	
	public  int getQtyOrdered() {
		return this.qtyOrdered;
	}
	private void setQtyOrdered(int qtyOrdered) {
			this.qtyOrdered = qtyOrdered;
	}
	public  void addDigitalVideoDisc(DigitalVideoDisc disc){
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}else {
			itemsOrdered[qtyOrdered] = disc;
			setQtyOrdered(qtyOrdered+1);
			System.out.println("The disc has been added ");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(int i = 0; i < dvdList.length;i++) {
			if(qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
				System.out.println((i+1)+" disc has been added ");
				System.out.println((dvdList.length - i-1)+" disc hasn't been added ");
				return;
			}else {
				itemsOrdered[qtyOrdered] = dvdList[i];
				setQtyOrdered(qtyOrdered+1);	
			}
			System.out.println("The list disc has been added ");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}else {
			itemsOrdered[qtyOrdered] = dvd1;
			setQtyOrdered(qtyOrdered+1);
			System.out.println("The disc has been added ");
		}
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}else {
			itemsOrdered[qtyOrdered] = dvd2;
			setQtyOrdered(qtyOrdered+1);
			System.out.println("The disc has been added ");
		}
	}
	public  void removeDigitalVideoDisc(DigitalVideoDisc disc){
		if(itemsOrdered == null ) {
			System.out.println("Cart is empty ");
			return;
		}
		
		int i = 0;
		while(i < qtyOrdered ) {
			if(disc.equals(itemsOrdered[i])) {
				for(int j = i;j<qtyOrdered;j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				setQtyOrdered(qtyOrdered-1 );
			}else {
				i++;
				continue;
			}
		}
		System.out.println("The disc has been removed");
	}
	public double totalCost(){
		double total=0;
		for(DigitalVideoDisc DVD : itemsOrdered) {
			total += DVD.getCost();
		}
		return total;
	}
	public void printCart() {
		double totalCost = this.totalCost();
		for(int i = 0 ;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered[i].toString());
		}
		System.out.printf("Total cost: %.2f $\n",totalCost);
	}
	public void searchById(int id) {
		boolean matched = false;
		for(int i = 0 ;i<qtyOrdered;i++) {
			if(itemsOrdered[i].getId() == id ) {
				System.out.println(itemsOrdered[i].toString());
				matched = true;
			}
		}
		if(matched == false) System.out.println("No DVD match");
	}
	public void searchByTitle(String title) {
		boolean matched = false;
		for(int i = 0 ;i<qtyOrdered;i++) {
			if(itemsOrdered[i].getTitle() == title ) {
				System.out.println(itemsOrdered[i].toString());
				matched = true;
			}
		}
		if(matched == false) System.out.println("No DVD match");
	}
}
