package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

//Constructor
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

//Getter
	public String getNom() {
		return nom;
	}

//ToStuff
	
	 
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

//Methods
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force/ 3)*effetPotion);
	}

	public void boirePotion(int effetPotion) {
		this.effetPotion = effetPotion;
		parler("Merci Druide, je sens que ma force est "+effetPotion+" fois décuplée.");
	}
	
	
//Main
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix);
		
		
		asterix.parler(asterix.prendreParole() + "Obelix, viens là mon garçon, peut tu me rammener mon sanglier sucré au sucre !");
		asterix.boirePotion(20);
		asterix.frapper(new Romain("Minus", 10));
	}
}