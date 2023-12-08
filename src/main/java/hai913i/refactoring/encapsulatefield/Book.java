package hai913i.refactoring.encapsulatefield;

public class Book {
	
	public String title;
	public String autor;
	public String category;
	
	
	
	public Book(String title, String autor, String category) {
		super();
		this.title = title;
		this.autor = autor;
		this.category = category;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", autor=" + autor + ", category=" + category + "]";
	}
		
}
