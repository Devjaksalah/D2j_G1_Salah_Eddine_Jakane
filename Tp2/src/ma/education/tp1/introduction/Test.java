package ma.education.tp1.introduction;

public class Test {
	
	//5
		public static void main (String[] args) {
			
				//6
			 /*	Instanciation des trois object o1,o2,o3*/
			Salle o1 = new Salle();
			Salle o2 = new Salle("Salle informatique");
			Salle o3 = new Salle("Salle des cours");
			//7-Affichage des attribut des object o1,o2,o3
			System.out.println(o1.id+" "+o1.nom);
			System.out.println(o2.id+" "+o2.nom);
			System.out.println(o3.id+" "+o3.nom);
			
		}
}
