package tp2;

/**
 * Classe permettant la representation d'un étudiant
 * 
 * @author joel yepgang
 */
public class Etudiant {
	
	// Variables d'instance
	private String nom;
	private String prenom;
	private int matricule;
	
	// Cette variable d'instance est du type Date, disponible dans le même package
	Date dateNaissance;

	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance) {
		super();
		setNom(nom);
		setPrenom (prenom);
		setMatricule(matricule);
		setDateNaissance(dateNaissance);
		
	}

	public Etudiant(String nom, String prenom, int matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String toString() {
		return "Etudiant s'appelle" +" "+ nom + " " + prenom +" "+ matricule + " " +dateNaissance ;
	}

	/*
	 * Methode main qui cree un etudiant et initialise les variables d'instance au
	 * depart de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		
		Etudiant etu = new Etudiant(args[0],args[1], Integer.parseInt(args[2]));
			
		etu.dateNaissance = new Date();
		etu.dateNaissance.jour = Integer.parseInt(args[3]);
		etu.dateNaissance.mois = Integer.parseInt(args[4]);
		etu.dateNaissance.annee = Integer.parseInt(args[5]);
		System.out.println(etu);
	}
}


