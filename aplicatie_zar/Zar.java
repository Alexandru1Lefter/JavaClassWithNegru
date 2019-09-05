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
public class Zar {

    static String[] valoriZar = {"unu", "doi", "trei", "patru", "cinci", "sase"};

    public String daCuZarul() {
        int zarHoldValue = (int) (Math.random() * 6);
        String result = "";
        for (int i = 0; i < valoriZar.length; i++) {
            if (zarHoldValue == i) {
                result = valoriZar[i];
                break;
            }
        }
        return result;
    }

}
