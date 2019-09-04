/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship2;

import java.io.*;

/**
 *
 * @author Lefter
 */
public class Helper {
    
    public String getUserInput (String prompt){
        String inputLine = null;
        System.out.println(" --------------------- ");
        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } 
        catch (IOException e){
            System.out.println("<Helper> <getUserInput> Exception: "+ e);
        }
        return inputLine;
    }
    
}
