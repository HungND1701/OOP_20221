package media;
import java.util.*;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc(String title, String category, float cost,String director,int length,String artist,List<Track> tracks) {		
		super(title,category,cost,director,length);
		this.artist = artist;
		this.tracks = tracks;
		
	}
	
	public String getArtist() {
		return artist;
	}

	public boolean addTrack(Track s) {
		if(tracks.contains(s)) {
			System.out.println("The track is existed");
			return false;
		}else {
			tracks.add(s);
			return true;
		}
	}
	public Track removeTrack(Track s) {
		if(!tracks.contains(s)) {
			System.out.println("the track isn't exist");
			return null;
		}else {
			int index = tracks.indexOf(s);
			Track track_removed = tracks.remove(index);
			return track_removed;
		}
	}
	public int getLength() {
		int sum_length = 0;
		for(Track tr : tracks) {
			sum_length += tr.getLength();
		}
		return sum_length;
	}
	public void play() {
		System.out.println("Playing : " + this.getTitle());
		System.out.println("Track length: " + this.getLength());	
		for(Track tr:tracks) {
			tr.play();
		}
	}
	public String toString() {
		return ("Media-"+this.getId()+"-"+this.getTitle()+"-"+(this.getCategory()== null ? "no data" : this.getCategory())+"-" + (this.getDirector()== null ? "no data" : this.getDirector())+"-"+(this.getLength()== 0 ? "no data" : this.getLength())+": "+this.getCost()+"$");
	}
}
