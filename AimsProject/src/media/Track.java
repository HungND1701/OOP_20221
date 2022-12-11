package media;

public class Track implements Playable{
	
	private String title;
	private int length;
	
	
	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}

	public boolean equal(Object o) {
		if(o instanceof Track) {
			return ((Track) o).getTitle() == this.getTitle() && ((Track) o).getLength() == this.getLength() ;
		}else {
			return false;
		}
	}
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());	
	}
}
