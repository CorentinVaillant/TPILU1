package personnages;

public class Romain {
	private String nom;
	private int force;

//Constructor
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

//Getter
	public String getNom() {
		return nom;
	}

//Methods
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	
	public static void main(String[] args) {
		Romain maximus = new Romain("Maximus", 2);
		maximus.parler(maximus.prendreParole() + "NOOOOON MINUS, POURQUOI TOI, POURQUOI T'ON T'IL FAIT ÇA *sob* *sob* *sob*");
		maximus.recevoirCoup(4);
	}
}