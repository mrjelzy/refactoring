package hai913i.refactoring.extractclass;

public class Livre {
	
	private String titre;
	private String auteur;
	private String categorie;
	
	private Localisation localisation = new Localisation();


	public Livre(String titre, String auteur, String categorie, int etage, String rayon, String emplacement) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.localisation.setEtage(etage);
		this.localisation.setRayon(rayon);
		this.localisation.setEmplacement(emplacement);
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
		return localisation.getEtage();
	}
	public void setEtage(int etage) {
		this.localisation.setEtage(etage);
	}
	
	public String getRayon() {
		return localisation.getRayon();
	}
	public void setRayon(String rayon) {
		this.localisation.setRayon(rayon);
	}
	
	public void setEmplacement(String emplacement) {
		this.localisation.setEmplacement(emplacement);
	}
	public String getEmplacement() {
		return localisation.getEmplacement();
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
		return localisation.getEtage() + "-" + localisation.getRayon() +  "-" + localisation.getEmplacement();
	}
	
	public void setLocalisation(int etage, String rayon, String emplacement) {
		this.setRayon(rayon);
		this.setEtage(etage);
		this.setEmplacement(emplacement);
	}
	

	
}
