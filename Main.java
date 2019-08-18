package com.teste.negru;

public class Main {

    public static void main(String[] args) {

        int month;
        String cnp;
        String stringSex;

        //create sex

        for (int rSex = 1 + (int) (Math.random() * 7); ; ) {
            if (rSex == 1 || rSex == 5) {
                stringSex = "Sex: Masculin";
                cnp = Integer.toString(rSex);
                break;

            } else if (rSex == 2 || rSex == 6) {
                stringSex = "Sex: Feminin";
                cnp = Integer.toString(rSex);
                break;
            }
            rSex = 1 + (int) (Math.random() * 7);
        }
        // create year

        int year = 2019 - (14 + (int) (Math.random() * 67));

        if (year < 2000) {
            cnp = cnp + year % 100;

        } else {
            cnp = cnp + 0 + year % 100;
        }

        //create month

        int rMonth = 1 + (int) (Math.random() * 12);
        if (rMonth >= 10) {
            cnp = cnp + rMonth;
            month = rMonth;
        } else {
            cnp = cnp + 0 + rMonth;
            month = rMonth;
        }

        // create date

        int date = 1 + (int) (Math.random() * 28);
        if (date < 10) {
            cnp = cnp + 0 + date;
        } else {
            cnp = cnp + date;
        }

        // create last cnp numbers

        int[] fCnp = new int[6];
        for (int i = 0; i < 6; i++) {
            fCnp[i] = (int) (Math.random() * 10);
            cnp = cnp + fCnp[i];
        }

        System.out.println("CNP: " + cnp);
        System.out.println(stringSex);
        System.out.println("Anul nastere: " + year);
        if (year % 4 == 0) {
            System.out.println("An bisesct: " + "Da");
        } else {
            System.out.println("An bisect: " + "Nu");
        }
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Anotimp: " + "Iarna");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Anotimp: " + "Primavara");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Anotimp: " + "Vara");
        } else {
            System.out.println("Anotimp: " + "Toamna");
        }
    }
}








