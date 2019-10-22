package tp3;

public class ExerciceTDD {

	private final static String personne = "adele";

	/**
	 * recoit un nombre et verifie s'il est pair
	 * 
	 * @param number un nombre entier non négatif et superieur à 0
	 * @return retourne true ou false
	 */

	public boolean estPair(int number) {
		
		 //return number % 2 == 0;
		if 
		(
				(number > 0)
				&& 
				(number % 2) == 0
		) 
		{
			return true;
		} 
		else if
		(
				number <= 0
		)
		{
			// gérer explicitement le cas ou le nombre en paramètre est négatif
			return false;
		}
		else
		{
			return false;
		}
		
	}

	/**
	 * calcule le perimetre d'un carre
	 * 
	 * @param cote un entier qui represente le coteé du carrée
	 * @return un entier qui represente le perimetre du carré
	 */
	public float perimetreCarree(float cote) {

		return cote * 4;
	}

	/**
	 * recherche un caractère spécifique dans une chaine de caractère
	 * 
	 * @param carc le caractere à rechercher
	 * @return un boolean vrai au faux pour verification
	 */
	public boolean contientCaractere(char carc) {
		//return (ExerciceTDD.personne.indexOf(carc) != -1);

		String localString = "";
		localString += carc;
		// "" + carc
	
		return ExerciceTDD.personne.contains(localString);
	
	}
}
