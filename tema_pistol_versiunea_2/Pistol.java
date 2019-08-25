/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_pistol_versiunea_2;

/**
 *
 * @author Lefter
 */
public class Pistol {

    //final int CAPACITATE_INCARCATOR;
    
    boolean piedica;
    Incarcator incarcatorPistol;

   // public Pistol(int CAPACITATE_INCARCATOR) {
   //     this.CAPACITATE_INCARCATOR = CAPACITATE_INCARCATOR;
   // }
//
    public void schimbaIncarcator(Incarcator i) {
         incarcatorPistol = i;
        
    }
    
    public void Incarca(Incarcator i){
        
    }

    public void trage() {
        if (piedica) {
            System.out.println("Atentie! Piedica este pusa!");
        } else if ( incarcatorPistol.nrGloante == 0) {
            System.out.println("Nu mai ai gloante! Incarca!");

        } else {
            incarcatorPistol.nrGloante--;
            int sansa = (int) (Math.random() * 2);
            System.out.println("Pew pew! Pew pew!");
            if (sansa == 0) {
                System.out.println("Ai ratat...");
                System.out.println("Mai ai " + incarcatorPistol.nrGloante + " gloante");
            } else {
                System.out.println("Ai nimerit!");
                System.out.println("Mai ai " + incarcatorPistol.nrGloante + " gloante");
            }
        }
    }

    public void punePiedica() {
        if (piedica) {
            System.out.println("Piedica deja pusa");
        } else {
            System.out.println("Piedica pusa!");
            this.piedica = true;
        }
    }

    public void scoatePiedica() {
        if (!piedica) {
            System.out.println("Piedica deja scoasa");
        } else {
            System.out.println("Piedica scoasa!");
            this.piedica = false;
        }
    }
}
