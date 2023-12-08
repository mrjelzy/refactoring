package hai913i.refactoring.encapsulatefield;

import java.util.ArrayList;

public class Library {
	private String name;
	private String address;
	private String phone;
	private String country;
	
	private ArrayList<Book> books;
	
	
	public Library(String name, String address, String phone, String country) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.setPhone(phone);
		this.setCountry(country);
		this.setBooks(new ArrayList<Book>());
	}

	public void ajoutLivre(Book livre) {
		this.getBooks().add(livre);
	}

	@Override
	public String toString() {
		return "Library [name=" + getName() + ", address=" + getAddress() + ", phone=" + getPhone() + ", country=" + getCountry() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
}
