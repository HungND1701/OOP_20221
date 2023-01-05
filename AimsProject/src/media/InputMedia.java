package media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMedia {
	public Book inputBook() {
		String title = ""; String category = ""; float cost; 
		List<String> authors = new ArrayList<String>();
		
		System.out.println("Input data of book : \n");
		Scanner kb = new Scanner(System.in);
		System.out.println("Title: ");
		title = kb.nextLine();
		System.out.println("Category: ");
		category = kb.nextLine();
		System.out.println("Cost: ");
		cost = kb.nextFloat();
		int numbAuthor ;
		System.out.println("Number of author: ");
		numbAuthor = kb.nextInt();
		kb.nextLine();
		for(int i = 0 ; i<numbAuthor ;i++) {
			String author = "";
			System.out.printf("Author %d: ",i+1);
			author = kb.nextLine();
			authors.add(author);
		}
		Book book = new Book(title,category,cost,authors);
		return book;
	}
	public  DigitalVideoDisc inputDVD() {
		//String title, String category, float cost,String director,int length
		String title = ""; String category = ""; float cost; 
		String director = ""; int length;
		
		System.out.println("Input data of DVD : \n");
		Scanner kb = new Scanner(System.in);
		System.out.println("Title: ");
		title = kb.nextLine();
		System.out.println("Category: ");
		category = kb.nextLine();
		System.out.println("Cost: ");
		cost = kb.nextFloat();
		kb.nextLine();
		System.out.println("Director: ");
		director = kb.nextLine();
		System.out.println("Length : ");
		length = kb.nextInt();
		kb.nextLine();
		DigitalVideoDisc DVD = new DigitalVideoDisc(title,category,cost,director,length);
		return DVD;
	}
	public static Track inputTrack(int i) {
		String title = ""; int length;
		System.out.printf("Input data of Track %d: \n",i);
		Scanner kb = new Scanner(System.in);
		System.out.println("Title: ");
		title = kb.nextLine();
		System.out.println("Length : ");
		length = kb.nextInt();
		kb.nextLine();
		Track track = new Track(title,length);
		return track;
	}
	public  CompactDisc inputCD() {
		//String title, String category, float cost,String director,int length,String artist,List<Track> tracks
		String title = ""; String category = ""; float cost; 
		String director = ""; int length = 0; String artist = "";
		List<Track> tracks = new ArrayList<Track>();
		
		System.out.println("Input data of CD : \n");
		Scanner kb = new Scanner(System.in);
		System.out.println("Title: ");
		title = kb.nextLine();
		System.out.println("Category: ");
		category = kb.nextLine();
		System.out.println("Cost: ");
		cost = kb.nextFloat();
		kb.nextLine();
		System.out.println("Director: ");
		director = kb.nextLine();
		System.out.println("Artist: ");
		artist = kb.nextLine();
		int numbTrack ;
		System.out.println("Number of track: ");
		numbTrack = kb.nextInt();
		kb.nextLine();
		for(int i = 0 ; i<numbTrack ;i++) {
			Track track = inputTrack(i+1);
			length += track.getLength();
			tracks.add(track);
		}
		CompactDisc CD = new CompactDisc(title,category,cost,director,length,artist,tracks);
		return CD;
	}
}
