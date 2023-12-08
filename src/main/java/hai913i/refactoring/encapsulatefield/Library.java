package hai913i.refactoring.encapsulatefield;

import java.util.ArrayList;

public class Library {
	public String name;
	public String address;
	public String phone;
	public String country;
	
	public ArrayList<Book> books;
	
	
	public Library(String name, String address, String phone, String country) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.country = country;
		this.books = new ArrayList<Book>();
	}

	public void ajoutLivre(Book livre) {
		this.books.add(livre);
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", phone=" + phone + ", country=" + country + "]";
	}
	
}
