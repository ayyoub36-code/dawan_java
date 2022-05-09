package fr.dawan.constructeur;

public class UtilisateurTest {

	public static void main(String[] args) {
		// Instanciation de la classe et creation d'un objet 

		Utilisateur user1 = new Utilisateur();
		user1.nom = "toto" ;
		user1.age = 17;
		
		Utilisateur user2 = new Utilisateur("toto","poto", 18);
		System.out.println(user2.nom);
		System.out.println(user2.age);
		
		int nbr = Utilisateur.nb_utilisateur;
		System.out.println(nbr);
		char x = 5 + 'A';
		System.out.println("6" + x);
	}
}
