/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zar;

/**
 *
 * @author Lefter
 */
public class ZarTest {
    static Zar z1 = new Zar();
    static Zar z2 = new Zar();
    
    public String aruncareZaruri(String z1, String z2){
        int dubla = 0;
        int poarta = 0;
        int zar1 = 0;
        int zar2 = 0;
        String result;
        
        switch(z1){
            case "unu":
                zar1 = 1;
                break;
                
            case "doi":
                zar1 = 2;
                break;  
            
            case "trei":
                zar1 = 3;
                break;
            
            case "patru":
                zar1 = 4;
                break;  
                
            case "cinci":
                zar1 = 5;
                break; 
                
            case "sase":
                zar1 = 6;
                break;    
        }
        
        switch(z2){
            case "unu":
                zar2 = 1;
                break;
                
            case "doi":
                zar2 = 2;
                break;  
            
            case "trei":
                zar2 = 3;
                break;
            
            case "patru":
                zar2 = 4;
                break;  
                
            case "cinci":
                zar2 = 5;
                break; 
                
            case "sase":
                zar2 = 6;
                break;    
        }
        
        if (zar1 == zar2){
            dubla++;
            result = zar1+"-"+zar2+": Dubla";
        }
        else if(Math.abs(zar1 - zar2) == 2 ){
            poarta++;
            result = zar1+"-"+zar2+": Poarta in casa";
        }else{
            result =zar1+"-"+zar2;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ZarTest joc1 = new ZarTest();
        System.out.println(joc1.aruncareZaruri(z1.daCuZarul(), z2.daCuZarul()));
    }
}
    
    

   
