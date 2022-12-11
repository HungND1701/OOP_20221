package media;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title, String category, float cost,String director,int length) {
		super(title,category,cost,director,length);
	}
	
	
	public String getDirector() {
		return super.getDirector();
	}

	public int getLength() {
		return super.getLength();
	}

	public String toString() {
		return ("DVD-"+this.getId()+"-"+this.getTitle()+"-"+(this.getCategory()== null ? "no data" : this.getCategory())+"-" + (this.getDirector()== null ? "no data" : this.getDirector())+"-"+(this.getLength()== 0 ? "no data" : this.getLength())+": "+this.getCost()+"$");
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
