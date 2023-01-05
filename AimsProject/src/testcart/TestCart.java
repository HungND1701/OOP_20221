package testcart;
import media.*;
import cart.Cart;
import java.util.*;
public class TestCart {
	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		Book book1 = new Book("lol",new ArrayList<String>());
//		String title, String category, float cost,String director,int length,String artist,List<Track> tracks
		CompactDisc CD1 = new CompactDisc("CD","1",12.2f,"HUng",12,"asf",new ArrayList<Track>());
//		String title, String category, float cost,String director,int length
		DigitalVideoDisc DVD1 = new DigitalVideoDisc("DVD","asf",14.3f,"Hung",12);
		
		mediae.add(book1);
		mediae.add(CD1);
		mediae.add(DVD1);
		Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
		for(Media m : mediae) {
			System.out.println(m.toString());
		}
		
	}
}
