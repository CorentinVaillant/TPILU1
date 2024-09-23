package histoire;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Village;

public class Scenario {

	public static void main(String[] args) {
		//histoire1();
		
		Village dieppe = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = dieppe.trouverHabitant(30); 
		/*	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
			at personnages.Village.trouverHabitant(Village.java:26)
			at histoire.Scenario.main(Scenario.java:14)
			
			On demande un villageois en dehors du tableau, on cherche le 31 ème éléments d'un tableau de 30 éléments
		*/
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, dieppe);
		dieppe.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		dieppe.ajouterHabitant(asterix);
		
		//Gaulois gaulois = dieppe.trouverHabitant(1);
		//System.out.println(gaulois);
		/*
		 	Cela renvoie "null", car la case 1 du tableau n'est pas initialiser avec un villageois
		  
		 */
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		dieppe.ajouterHabitant(obelix);
		
		dieppe.afficherVillageois();
		
	}
	
	private static void histoire1() {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix",2147483647);
		
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		Romain minus = new Romain("Minus", 6);
		
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.parler(" Non, Obélix !... Tu n'auras pas de potion magique !");
		
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Bonjour");
		
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}
