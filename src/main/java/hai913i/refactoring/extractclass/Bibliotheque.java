package hai913i.refactoring.extractclass;

import java.util.ArrayList;

public class Bibliotheque {
	private String nom;
	private String Adresse;
	private String telephone;
	private String pays;
	
	private ArrayList<Livre> livres;
	
	public Bibliotheque(String nom, String adresse, String telephone, String pays) {
		super();
		this.nom = nom;
		Adresse = adresse;
		this.telephone = telephone;
		this.pays = pays;
		this.livres = new ArrayList<Livre>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public ArrayList<Livre> getLivres() {
		return livres;
	}
	
	

	@Override
	public String toString() {
		return "Bibliotheque [nom=" + nom + ", Adresse=" + Adresse + ", telephone=" + telephone + ", pays=" + pays
				+ "]";
	}

	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}

	public void ajoutLivre(Livre livre) {
		this.livres.add(livre);
	}

	
}
