package media;

public class Track {
	
	private String title;
	private int length;
	
	
	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}


	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}

}