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
public class Incarcator {
    
    public int capacitateIncarcator;
    public int nrGloante;
    
    public Incarcator(int capacitateIncarcator, int nrGloante){
        if(nrGloante > capacitateIncarcator){
            System.out.println("Eroare: Capacitate incarcator depasita!");
            System.out.println("Poti introduce maxim: "+capacitateIncarcator+" gloante");
        }
        this.capacitateIncarcator = capacitateIncarcator;
        this.nrGloante = nrGloante;
        
    }
    
    public void Incarca(int nrGloanteIncarcare){
        if (nrGloante + nrGloanteIncarcare > capacitateIncarcator){
            System.out.println("Eroare: Capacitatea incarcatorului nu poate fi depasita!");
            System.out.print("Poti incarca cu maxim: "+(capacitateIncarcator-nrGloante)+" gloante");
            return;
        }
        this.nrGloante+=nrGloanteIncarcare;
        System.out.println("Ai incarcat cu: "+this.nrGloante+" gloante");
    }
}
