package personnages;

public class Chef {
	private String nom;
	private int force;
	private Village village;
//Constructor
	public Chef(String nom, int force, Village village) {
		this.nom = nom;
		this.force = force;
		this.village = village;
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
		return "Le chef " + nom + " du village " + village.getNom() + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
}