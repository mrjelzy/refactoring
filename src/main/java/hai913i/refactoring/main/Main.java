package hai913i.refactoring.main;

import hai913i.refactoring.encapsulatefield.Book;
import hai913i.refactoring.encapsulatefield.Library;
import hai913i.refactoring.extractclass.Bibliotheque;
import hai913i.refactoring.extractclass.Livre;

public class Main {

	public static void main(String[] args) {
		// Extract Class
		Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "Roman", 1, "A1", "5");
        Livre livre2 = new Livre("1984", "George Orwell", "Science-Fiction", 2, "B3", "15");
        Livre livre3 = new Livre("La Peste", "Albert Camus", "Roman", 1, "A2", "7");
        
        Bibliotheque bibliotheque = new Bibliotheque("Bibliothèque Municipale", "123 Rue de la Culture", "01 23 45 67 89", "France");

        // Ajout des livres à la bibliothèque
        bibliotheque.ajoutLivre(livre1);
        bibliotheque.ajoutLivre(livre2);
        bibliotheque.ajoutLivre(livre3);
        
        // Affichage des informations
        System.out.println(bibliotheque);
        System.out.println("\nListe des livres:");
        for (Livre livre : bibliotheque.getLivres()) {
            System.out.println(livre.toString());
        }
        
        //Encapsulate Field
        
        Book book1 = new Book("Astérix le gaulois", "René Goscinny ", "BD");
        Book book2 = new Book("Odyssée", "Homère", "Roman");

        // Création de la bibliothèque en utilisant le constructeur
        Library library = new Library("Bibliothèque Brassens", "50 Rue Georges Brassens", "0123456789", "France");

        book1.autor = "Albert Uderzo";
        
        // Ajout des livres à la bibliothèque
        library.ajoutLivre(book1);
        library.ajoutLivre(book2);

        // Affichage des informations de la bibliothèque
        System.out.println("\nEncapsulate Field");
        System.out.println(library);

        System.out.println("\nListe des livres:");
        // Affichage des informations des livres
        for (Book book : library.books) {
            System.out.println(book);
        }
    }
        
}
