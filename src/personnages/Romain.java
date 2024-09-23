package personnages;

import myUtil.Util;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

//Constructor
	public Romain(String nom, int force) {
		assert (force>=0);
		
		this.nom = nom;
		this.force = force;
	}

//Getter
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

//Methods
	
	
	public void sEquiper(Equipement equipement) {//je ne comprend pas l'utiliter d'un switch case, cela serait se compliquer la t^ache et rendre le code moins lisible
		if (nbEquipement == 2) {
			Util.println("Le soldat "+nom+" est déjà bien protégé !");
			return ;
		}
		
		if (nbEquipement==1 && this.equipement[0] == equipement) {
			Util.println("Le soldat "+getNom()+" possède déjà un "+equipement.toString()+" !");
			return ;
		}
		
		else {
			this.equipement[nbEquipement++] = equipement;
			Util.println("Le soldat "+getNom()+" s’équipe avec un "+equipement.toString()+".");
			return;
		}
		
	}
	
	
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
		
		Util.print(Equipement.BOUCLIER +" "+Equipement.CASQUE);
	}
}