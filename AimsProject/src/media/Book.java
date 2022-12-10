package media;
import java.util.*;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(List<String> authors) {
		super();
		this.authors = authors;
	}

	public List<String> getAuthors() {
		return authors;
	}
	
	
	public boolean addAuthor(String authorName) {
		if(this.authors.contains(authorName)){
			return false;
		}
		else {
			this.authors.add(authorName);
			return true;
		}
	}
	public boolean removeAuthor(String authorName) {
		if(!this.authors.contains(authorName)){
			return false;
		}
		else {
			this.authors.remove(authorName);
			return true;
		}
	}
	
}
