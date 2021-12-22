package ma.education.tp1.introduction;

public class Salle {
	
	// Les Attributs de la Clase Salle
	 long id;
	 String nom;
	
	//Constructeur sans param�tre
	public Salle() {}
	//Constructeur avec une param�tre nom
	public Salle(String nom) {
		super();
		this.nom = nom;
	}
	//Constructeur avec 2 param�tre le nom et id 
	public Salle(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	

}