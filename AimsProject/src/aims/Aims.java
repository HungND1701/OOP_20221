package aims;
import media.*;
import cart.*;
import store.*;
import java.util.*;
public class Aims {
	private static Store anStore = new Store();
	private static Cart anCart = new Cart();
	
	
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	public static void updateStoreMenu() {
		System.out.println("Update store option: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add media");
		System.out.println("2. Remove media");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	public static void menuSort() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void typeMediaMenu() {
		System.out.println("Type Media : ");
		System.out.println("--------------------------------");
		System.out.println("1. Book");
		System.out.println("2. CompactDisc");
		System.out.println("3. DigitalVideoDisc");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static String inputTitle() {
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a title:  ");
        String title = keyboard.nextLine();
        return title;
	}
	
	public static Media ChooseOneInMediaSearched(Store StoreSearched) {
		if(StoreSearched.getSize() == 1) return StoreSearched.getMediainIndex(0);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please choose one Media to option (%d to %d): ",1,StoreSearched.getSize());
		Integer index = keyboard.nextInt();
		System.out.println("You choosed Media :");
		System.out.println(StoreSearched.getMediainIndex(index-1).toString());
		return StoreSearched.getMediainIndex(index-1);
	}
	public static Media ChooseOneInMediaSearched(Cart CartSearched) {
		if(CartSearched.getSize() == 1) return CartSearched.getMediaInIndex(0);
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please choose one Media to option (%d to %d): ",1,CartSearched.getSize());
		Integer index = keyboard.nextInt();
		System.out.println("You choosed Media :");
		System.out.println(CartSearched.getMediaInIndex(index-1).toString());
		return CartSearched.getMediaInIndex(index-1);
	}
	public static Media SearchMediaInStore() {
		String title = inputTitle();
        Store listSearched = anStore.SearchMedia(title);
        if(listSearched.getSize() == 0 ) {System.out.println("The Media not exist\n"); return null;}
        if(listSearched.getSize() == 1) return listSearched.getMediainIndex(0);
        listSearched.printStore();
        System.out.println("############################\n");
        Media mediaChoosed = ChooseOneInMediaSearched(listSearched);
        return mediaChoosed;
	}
	
	public static Media SearchMediaInCart() {
		String title = inputTitle();
        Cart listSearched = anCart.SearchMedia(title);
        if(listSearched.getSize() == 0 ) {System.out.println("The Media not exist\n"); return null;}
        if(listSearched.getSize() == 1) return listSearched.getMediaInIndex(0);
        listSearched.printCart();
        System.out.println("############################\n");
        Media mediaChoosed = ChooseOneInMediaSearched(listSearched);
        return mediaChoosed;
	}
	
	public static void playMedia(Media anMedia) {
		System.out.println("############################\n");
		anMedia.MediaPlay(anMedia);
		System.out.println("############################\n");
	}
	
	
	public static void sortMediaInCart() {
		String choose = "";
		while(!choose.equals("0")) {
			menuSort();
			Scanner key= new Scanner(System.in);
            choose = key.nextLine();
            switch(choose) {
            	case "1":
            		anCart.sortByTitle();
            		anCart.printCart();
            		break;
            	case "2":
            		anCart.sortByCost();
            		anCart.printCart();
            		break;
            	case "0":
            		return;
            	default:
            		break;
            }
		}
	}
	
	
	public static void addMediaToCart(Media anMedia) {
		if(anCart.addMedia(anMedia)) System.out.println("the media was added in Cart\n");
		else System.out.println("The Media can't add in Cart.\n");
	}
	public static void removeMediaToCart() {
		Media m = SearchMediaInCart();
		if(m != null) {
			System.out.printf("You removed the media : %s\n",m.getTitle());
			anCart.removeMedia(m);
		}else System.out.println("The Media can't remove in Cart.\n");
	}
	public static void placeOrder() {
		anCart.printCart();
		System.out.printf("Total Cost: %.2f\n",anCart.totalCost());
		anCart.emptyCart();
	}
	public static void controlCartMenu() {
		String choose1 = "";
        while(!choose1.equals("0")){
        	cartMenu();
            Scanner key= new Scanner(System.in);
            choose1 = key.nextLine();
            
            switch(choose1){
                case "1":
                	Media m = SearchMediaInCart();
                	if(m!=null) System.out.println(m.toString()); 
                    break;
                case "2":
                	sortMediaInCart();
                    break;
                case "3":
                	removeMediaToCart();
                    break;
                case "4":
                	Media m2 = SearchMediaInCart();
                	if(m2!=null) playMedia(m2);
                    break;
                case "5":
                	placeOrder();
                	return;
                	
                case "0":
                	return;
                default: 
                    break;
            }
            
        }
	}

	
	public static void controlMediaDetailsMenu(Media anMedia) {
		String choose = "";
		while(!choose.equals("0")) {
			mediaDetailsMenu();
			Scanner key= new Scanner(System.in);
            choose = key.nextLine();
            switch(choose) {
            	case "1":
            		addMediaToCart(anMedia);
            		break;
            	case "2":
            		playMedia(anMedia);
            		break;
            	case "0":
            		return;
            	default:
            		break;
            }
		}
	}
	
	
	public static void controlStoreMenu() {
		String choose1 = "";
        while(!choose1.equals("0")){
            storeMenu();
            Scanner key= new Scanner(System.in);
            choose1 = key.nextLine();
            
            switch(choose1){
                case "1":
                    Media mediaSearched = SearchMediaInStore();
                    if(mediaSearched!=null) {
                    	System.out.println(mediaSearched.toString());
                    	controlMediaDetailsMenu(mediaSearched);
                    }
                    break;
                case "2":
                	Media mediaSearched2 = SearchMediaInStore();
                	if(mediaSearched2!=null) addMediaToCart(mediaSearched2);
                    break;
                case "3":
                	Media mediaSearched3 = SearchMediaInStore();
                	if(mediaSearched3!=null) playMedia(mediaSearched3);
                    break;
                case "4":
                	boolean bool = anCart.printCart();
                	if(bool == true)controlCartMenu();
                    break;
                case "0":
                	return;
                    
                default: 
                    break;
            }
            
        }
	}
	public static void addMediaStore() {
		InputMedia input = new InputMedia();
		String choose = "";
        while(!choose.equals("0")){
            typeMediaMenu();
            Scanner key= new Scanner(System.in);
            choose = key.nextLine();
            
            switch(choose){
                case "1":
                	//addBook
                	Book book = input.inputBook();
                	if(anStore.addMedia(book)) System.out.println("The media has been added ");
                	break;
                case "2":
                	//addCD;
                	CompactDisc CD = input.inputCD();
                	if(anStore.addMedia(CD)) System.out.println("The media has been added ");
                	break;
                case "3":
                	//addDVD;
                	DigitalVideoDisc DVD = input.inputDVD();
                	if(anStore.addMedia(DVD)) System.out.println("The media has been added ");
                	break;
                case "0":
                	return;
                default : 
                	break;
            }
        }
	}
	public static void removeMediaStore() {
		Media mediaSearched = SearchMediaInStore();
		if(mediaSearched!=null) anStore.removeMedia(mediaSearched);	
	}
	public static void updateStore() {
		String choose = "";
        while(!choose.equals("0")){
            updateStoreMenu();
            Scanner key= new Scanner(System.in);
            choose = key.nextLine();
            
            switch(choose){
                case "1":
                	addMediaStore();
                	break;
                case "2":
                	removeMediaStore();
                	break;
                case "0":
                	return;
                default : 
                	break;
            }
        }
	}
	public static void mainMenu() {
		String choose = "";
        while(!choose.equals("0")){
            showMenu();
            Scanner key= new Scanner(System.in);
            choose = key.nextLine();
            
            switch(choose){
                case "1":
                    anStore.printStore();
                    System.out.println("############################\n");
                    controlStoreMenu();
                    
                    break;
                case "2":
                	updateStore();
                    break;
                case "3":
                	boolean bool = anCart.printCart();
                	if(bool == true)controlCartMenu();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default: 
                    break;
            }
            
        }
	}
	public static void main(String[] args) {
		
		Book book1 = new Book("lol",new ArrayList<String>());
	//	String title, String category, float cost,String director,int length,String artist,List<Track> tracks
		CompactDisc CD1 = new CompactDisc("CD","1",12.2f,"HUng",12,"asf",new ArrayList<Track>());
		CompactDisc CD2 = new CompactDisc("CD","abc",13.1f,"Khang",15,"asf",new ArrayList<Track>());
	//	String title, String category, float cost,String director,int length
		DigitalVideoDisc DVD1 = new DigitalVideoDisc("DVD","asf",14.3f,"Hung",12);
		
		anStore.addMedia(DVD1);
		anStore.addMedia(CD2);
		anStore.addMedia(CD1);
		anStore.addMedia(book1);
		mainMenu();
		
	}
}
