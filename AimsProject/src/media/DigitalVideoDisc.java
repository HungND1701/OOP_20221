package media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
	
	public DigitalVideoDisc(String title) {
		super(title);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
		
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);		
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
	}
	
	
	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public String toString() {
		return ("DVD-"+this.getId()+"-"+this.getTitle()+"-"+(this.getCategory()== null ? "no data" : this.getCategory())+"-" + (this.getDirector()== null ? "no data" : this.getDirector())+"-"+(this.getLength()== 0 ? "no data" : this.getLength())+": "+this.getCost()+"$");
	}
}
