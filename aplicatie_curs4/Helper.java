package aplicatie_curs4;

    /*
try{
    //ce vreau sa fav
        }
catch(Rxception exp){
    //cum tratez exceptia
        }
finally{
    //ce vreau sa fac indiferent daca a avut loc o exceptie sau nu
        }
        */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {

    public static boolean valideazaNumar(String numarTastatura) {

        if (numarTastatura != null && numarTastatura.length() > 0) {
            try {
                Integer.parseInt(numarTastatura);
            } catch (NumberFormatException e) {
                System.out.println("<Helper> <valideazaNumar> string nu poate fi convertit la int");
                return false;
            }

            return true;

        } else {

            return false;
        }
    }

    public static String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}


