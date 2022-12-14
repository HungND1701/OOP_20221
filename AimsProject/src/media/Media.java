package media;
import java.util.*;
public abstract class Media {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia=0;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public void setCategory(String category) {
		this.category = category;
	}



	public float getCost() {
		return cost;
	}



	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean equal(Object o) {
		if(o instanceof Media) {
			return ((Media) o).getTitle() == this.getTitle();
		}else {
			return false;
		}
	}
	
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(String title) {
		this.title = title;
		Media.nbMedia +=1;
		this.id = Media.nbMedia;
		
	}
	public Media(String title, String category, float cost ) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		Media.nbMedia +=1;
		this.id = Media.nbMedia;
	}
	public void MediaPlay(Media o) {
		if(o instanceof CompactDisc) {
			((CompactDisc) o).play();
		}else 
			if(o instanceof DigitalVideoDisc) {
				((DigitalVideoDisc) o).play();
			}else if(o instanceof Book ) {
				System.out.println("Media's type is book. Can't play\n");
			}
			
		
	}
}
