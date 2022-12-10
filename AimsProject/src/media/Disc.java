package media;

public class Disc extends Media{
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public Disc(String title, String category, float cost,String director,int length ) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
		
		// TODO Auto-generated constructor stub
	}

}
