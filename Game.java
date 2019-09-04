/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship2;

/**
 *
 * @author Lefter
 */
public class Game {

 

    public static void main(String[] args) {
        int contorNavaLovita = 0;
        int contorLovituriTotale = 0;
        Helper testHelper = new Helper();
        Harta harta1 = new Harta();
        Ship nava1 = new Ship();
        while (!harta1.setDimensiuneHarta(testHelper.getUserInput("introdu dimensiunea intre 7 si 10"))) {
        }

        harta1.setFormatHarta();
        nava1.setPozitieStartNava(harta1.dimensiuneHarta);
        harta1.setNava(nava1.pozitieStartNava, nava1.lungimeShip);
        System.out.print("[");
        for (int i : harta1.formatHarta) {
            System.out.print(" " + i + " ");
        }
        System.out.print("]");
        
        while(contorNavaLovita < nava1.lungimeShip){
            contorLovituriTotale++;
            if (harta1.lovireNava(testHelper.getUserInput("da ba in nava"))){
                contorNavaLovita++;
            }
        }
        
        System.out.println("Kill");
    }

}
