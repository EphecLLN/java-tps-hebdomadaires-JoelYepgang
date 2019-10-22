/**
 * 
 */
package tp3;

/**
 * Cette classe modelise une date de mani�re simplifiee.
 * 
 * @author joel yepgang
 *
 */
public class Date {

	// variables d'instance
	int jour;
	int mois;
	int annee;

	public Date(int jour, int mois, int annee) {
		
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public Date() {

	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	
	
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}

	/**
	 * La m�thode main permet de tester la classe date en cr�ant un objet au
	 * d�part des arguments de la ligne de commande. Trois arguments sont attendus,
	 * sous forme d'entiers : Le jour, le mois et l'annee.
	 * 
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Date d = new Date();
		d.jour = Integer.parseInt(args[0]);
		d.mois = Integer.parseInt(args[1]);
		d.annee = Integer.parseInt(args[2]);
	}
}
