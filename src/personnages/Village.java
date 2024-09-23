package personnages;

import myUtil.Util;

public class Village {

    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, int nbVillageoisMax) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMax];
    }
    
    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }
    
    public boolean ajouterHabitant(Gaulois habitant) {
    	if (nbVillageois >= villageois.length) {
    		System.out.println("Par Toutatis ! Nous somme bien trop nombreux, nous ne pouvons pas t'accepter *sob* *sob*");
    		return false;
    	}
    	
    	villageois[nbVillageois++] = habitant;
    	return true;
    }
    
    public Gaulois trouverHabitant(int numeroHutte) {
    	return this.villageois[numeroHutte];
    }


    public void afficherVillageois() {
    	Util.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
    	for(int i = 0; i<this.nbVillageois;i++) {
    		if (villageois[i] != null) {
    			Util.println("-"+villageois[i].getNom());
    		}
    	}
    	
    	
    }
    
}
