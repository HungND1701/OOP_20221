package dvd;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs=0;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		DigitalVideoDisc.nbDigitalVideoDiscs = DigitalVideoDisc.nbDigitalVideoDiscs +1;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		DigitalVideoDisc.nbDigitalVideoDiscs = DigitalVideoDisc.nbDigitalVideoDiscs +1;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		DigitalVideoDisc.nbDigitalVideoDiscs = DigitalVideoDisc.nbDigitalVideoDiscs +1;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		DigitalVideoDisc.nbDigitalVideoDiscs = DigitalVideoDisc.nbDigitalVideoDiscs +1;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return ("DVD-"+this.getId()+"-"+this.getTitle()+"-"+(this.getCategory()== null ? "no data" : this.getCategory())+"-" + (this.getDirector()== null ? "no data" : this.getDirector())+"-"+(this.getLength()== 0 ? "no data" : this.getLength())+": "+this.getCost()+"$");
	}
}
