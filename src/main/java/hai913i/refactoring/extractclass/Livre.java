package hai913i.refactoring.extractclass;

public class Livre {
	
	private String titre;
	private String auteur;
	private String categorie;
	
	private int etage;
	private String rayon;
	private String emplacement;
	
	
	public Livre(String titre, String auteur, String categorie, int etage, String rayon, String emplacement) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.etage = etage;
		this.rayon = rayon;
		this.emplacement = emplacement;
	}
	
	// Getters and Setters
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	public String getRayon() {
		return rayon;
	}
	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public String getEmplacement() {
		return emplacement;
	}
	
	@Override
    public String toString() {
        return "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", categorie='" + categorie + '\'' +
                ", localisation='" + getLocalisation();
    }
	
	
	// Un peu de logique
	
	public String getLocalisation() {
		return etage + "-" + rayon +  "-" + emplacement;
	}
	
	public void setLocalisation(int etage, String rayon, String emplacement) {
		this.setRayon(rayon);
		this.setEtage(etage);
		this.setEmplacement(emplacement);
	}
	

	
}
