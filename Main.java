package com.teste.negru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sex = 0;
        String cnp ="";

        for (int rSex = 1 + (int) (Math.random() * 7); rSex > 0; ) {
            if (rSex == 1 || rSex == 5) {
                sex = rSex;
                System.out.println("Sex: Masculin");
                cnp = Integer.toString(rSex);
                break;

            } else if (rSex == 2 || rSex == 6) {
                sex = rSex;
                System.out.println("Sex: Feminin");
                cnp = Integer.toString(rSex);
                break;
            }
            rSex = 1 + (int) (Math.random() * 7);
        }

        int an = 2019 - (14 + (int) (Math.random() * 67));
        System.out.println("An nastere: " + an);

        if (an < 2000) {
            cnp = cnp+an%100;

        } else {
            cnp = cnp+0+an%100;
        }
        System.out.println("CNP: "+cnp);
    }
}











