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
public class Ship {
    
    final int lungimeShip = 3;
    int pozitieStartNava;
    
    public boolean setPozitieStartNava (int dimensiuneHarta){
       pozitieStartNava = (int)(Math.random()*(dimensiuneHarta - lungimeShip));
       return true;
    }
    
}
