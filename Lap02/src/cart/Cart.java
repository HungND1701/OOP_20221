package cart;
import dvd.DigitalVideoDisc;

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
	public  double totalCost(){
		double total=0;
		for(DigitalVideoDisc DVD : itemsOrdered) {
			total += DVD.getCost();
		}
		return total;
	}
	public  void displayCart(){
		for(int i = 0 ;i<qtyOrdered;i++) {
			System.out.println("DVD "+(i+1));
			System.out.println("Title : " +itemsOrdered[i].getTitle());
			System.out.println("Category : " +(itemsOrdered[i].getCategory()== null ? "no data" : itemsOrdered[i].getCategory()));
			System.out.println("Director : " +(itemsOrdered[i].getDirector()== null ? "no data" : itemsOrdered[i].getDirector()));
			System.out.println("Length : " + (itemsOrdered[i].getLength()== 0 ? "no data" : itemsOrdered[i].getLength()));
			System.out.println("Cost : " +itemsOrdered[i].getCost());
			System.out.println("\n");
		}
	}
}
