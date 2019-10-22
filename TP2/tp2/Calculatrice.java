package tp2;

/**
 * Cette classe modelise une calculatrice simplifiee avec une valeur courante et
 * trois operations.
 * 
 * @author joel yepgang
 *
 */
public class Calculatrice {

	private double valeurCourante; // Stocke la valeur affichee sur l'ecran de la calculatrice

	// Constructeurs
	
	/**
	 * @param valeurCourante
	 */
	public Calculatrice(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}

	/**
	 * 
	 */
	public Calculatrice() {
		this.valeurCourante = 10;
	}

	// Getters and setters

	/**
	 * @return la valeurCourante actuellement affichée sur la calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}

	/**
	 * @param valeurCourante la nouvelle valeur Ã  afficher sur la calculatrice
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

	// Méthodes

	/**
	 * Additionne un nombre Ã  la valeur courante
	 * 
	 * @param n le nombre Ã  ajouter Ã  la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante += n;
	}

	/**
	 * Soustrait un nombre Ã  la valeur courante
	 * 
	 * @param n le nombre Ã  soustraire Ã  la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante -= n;
	}

	/**
	 * Eleve la valeur courante au carrÃ©
	 */
	public void carre() {
		valeurCourante *= valeurCourante;
	}

	/**
	 * Renvoie une représentation textuelle de la valeur affichée sur la
	 * calculatrice
	 */

	public String toString() {
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}

	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * 
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {

		Calculatrice myCalc = new Calculatrice(125);
		System.out.println(myCalc.valeurCourante);

		myCalc.ajoute(5);
		myCalc.soustrait(2);
		System.out.println(myCalc.valeurCourante);
	}

}
