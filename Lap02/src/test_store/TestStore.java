package test_store;
import store.Store;
import dvd.DigitalVideoDisc;
public class TestStore {
	public static void main(String[] args) {
		Store anStore = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		anStore.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		anStore.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anStore.addDVD(dvd3);
		
		anStore.printStore();
	}
}
