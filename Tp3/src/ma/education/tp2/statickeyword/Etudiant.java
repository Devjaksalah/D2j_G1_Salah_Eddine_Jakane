package ma.education.tp2.statickeyword;

public class Etudiant {
	
	public long id;
	public String nom;
	public  static int nbEtudiants;
	

	/**
	 * 3. D’abord Comparer les attributs de la classe Etudiant en donnant les réponses aux
         questions suivantes:
		a. Est ce que chaque étudiant a son propre Id? : Oui 
		b. Est ce que chaque étudiant a son propre nom? : Oui 
		c. Est ce que chaque étudiant a son propre nb Etudiant? : non
	 */
	
	public Etudiant (long id, String nom,int nb) {
		this.id = id;
		this.nom = nom;
		nbEtudiants+=nb;
	}

}
