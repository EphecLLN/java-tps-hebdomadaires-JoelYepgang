package tp3;

public class ExerciceTDD {

	private final static String personne = "adele";

	/**
	 * recoit un nombre et verifie s'il est pair
	 * 
	 * @param number un nombre entier non n�gatif et superieur � 0
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
			// g�rer explicitement le cas ou le nombre en param�tre est n�gatif
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
	 * @param cote un entier qui represente le cote� du carr�e
	 * @return un entier qui represente le perimetre du carr�
	 */
	public float perimetreCarree(float cote) {

		return cote * 4;
	}

	/**
	 * recherche un caract�re sp�cifique dans une chaine de caract�re
	 * 
	 * @param carc le caractere � rechercher
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
