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
public class Harta {
    int dimensiuneHarta;
    int [] formatHarta = null;
    final private int alreadyMissed = -1;
    final private int emptySpace = 0;
    final private int shipSpace = 1;
    final private int shipHit = 2;
    
    public boolean setDimensiuneHarta(String stringHarta){
        try {
            dimensiuneHarta = Integer.parseInt(stringHarta);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("<Harta> <setDimensiuneHarta> Exception: " + nfe);
            return false;
        }
        if(dimensiuneHarta < 7 || dimensiuneHarta > 10){
            System.out.println("<Harta> <setDimensiuneHarta> Exception: dimensiuneHarta nu este intre 7 si 10 ");
            dimensiuneHarta = 0;
            return false;
        }
        return true;
    }
    
    public boolean setFormatHarta(){
        if (dimensiuneHarta == 0){
            System.out.println("<Harta> <setFormatHarta> Exception: Dimensiune Harta este neinitializata");
            return false;
        }
        
        formatHarta = new int [dimensiuneHarta];
        return true;
    }
    
    public boolean setNava (int pozitieNava, int dimensiuneNava){
        
        for (int i = pozitieNava; i < pozitieNava+dimensiuneNava; i++){
            formatHarta[i] = shipSpace;
        }
        return true;
    }
    
    public boolean lovireNava (String indexInputLovitura){
        int indexLovitura;
        try {
            indexLovitura = Integer.parseInt(indexInputLovitura);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("<Harta> <lovireNava> Exception: " + nfe);
            return false;
        }
        if(indexLovitura < 0 || indexLovitura >= dimensiuneHarta){
            System.out.println("<Harta> <lovireNava> Exception: indexLovitura < 0 || indexLovitura >= dimensiuneHarta");
            return false;
        }
        switch (formatHarta[indexLovitura]){
            case alreadyMissed:
                System.out.println("Already Missed");
                break;
            case emptySpace:
                System.out.println("Miss");
                formatHarta[indexLovitura] = alreadyMissed;
                break;
            case shipSpace:
                System.out.println("Hit");
                formatHarta[indexLovitura] = shipHit;
                return true;
            case shipHit:
                System.out.println("Already Hit");
                break;
        }
        return false;
    }
}
