package tp3;

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
	 * @return la valeurCourante actuellement affich�e sur la calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}

	/**
	 * @param valeurCourante la nouvelle valeur � afficher sur la calculatrice
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

	// M�thodes

	/**
	 * Additionne un nombre � la valeur courante
	 * 
	 * @param n le nombre � ajouter � la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante += n;
	}

	/**
	 * Soustrait un nombre � la valeur courante
	 * 
	 * @param n le nombre � soustraire � la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante -= n;
	}

	/**
	* Cette m�thode calcule le carr� d�un nombre.
	* @param n : Un nombre entier quelconque
	* @return Un nombre >= 0, r�sultat de la multiplication de n par lui-m�me
	*/
	
	public int carre(int n) {
		
		return n*n;
	}

	/**
	 * Renvoie une repr�sentation textuelle de la valeur affich�e sur la
	 * calculatrice
	 */

	public String toString() {
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}

	/**
	 * M�thode main permettant de lancer un test rapide de la classe calculatrice.
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
