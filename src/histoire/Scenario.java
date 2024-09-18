package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
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
