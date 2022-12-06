package media;
import java.util.*;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
		
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
