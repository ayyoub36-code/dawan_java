package fr.dawan.constructeur;

public class Utilisateur {

	// creer un user mode test
	// variable d'instance = Instance.variable 
	public String nom ;
	public String prenom ;
	public int  age ;

	// variable de classe Classe.variable 
	public static int nb_utilisateur ;

	// constructor par default 
	public Utilisateur() {
		nb_utilisateur++;
	}

	// constructor methode qui permet d'initialiser les attributs et ne possede pas de type de retour
	public Utilisateur(String nom , String prenom, int age) {
		this(nom,prenom);
		this.age = age;

	}

	// constructor methode qui permet d'initialiser les attributs et ne possede pas de type de retour
	public Utilisateur(String nom , String prenom) {
		this();
		this.nom = nom  ;
		this.prenom = prenom;

	}

	// getter 
	public int getAge() {
		return this.age;
	}

	// setter set  restrictions for user ne fasse pas n importe quoi avec la data ! 
	public void setAge(int age) {
		// conditions de restrictions 
		if(age<15) {
			System.out.println("interdit au moins de 15 ans !");
		}
		this.age = age ;
	}
	
	public String decrisToi() {
		String str = "je suis là";
		return str;
	}


}
