package hai913i.refactoring.encapsulatefield;

public class Book {
	
	private String title;
	private String autor;
	private String category;
	
	
	
	public Book(String title, String autor, String category) {
		super();
		this.setTitle(title);
		this.setAutor(autor);
		this.setCategory(category);
	}



	@Override
	public String toString() {
		return "Book [title=" + getTitle() + ", autor=" + getAutor() + ", category=" + getCategory() + "]";
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}
		
}
