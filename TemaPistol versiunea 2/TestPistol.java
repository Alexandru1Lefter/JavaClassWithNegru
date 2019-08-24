/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesimedote;

/**
 *
 * @author Lefter
 */
public class TestPistol {
    
    public static void main(String[] args) {
        
        Pistol p1 = new Pistol();
        Incarcator i1 = new Incarcator(20,2);
        p1.schimbaIncarcator(i1);
        System.out.println("Incarcator i gloante : "+i1.nrGloante+" / Capacitate incarcator i: "+i1.capacitateIncarcator);
       p1.trage();
       p1.trage();
       p1.trage();
       i1.Incarca(20);
       Incarcator i2 = new Incarcator (5,5);
       p1.schimbaIncarcator(i2);
       p1.trage();
       p1.trage();
       p1.schimbaIncarcator(i1);
       p1.trage();
    }
    
}