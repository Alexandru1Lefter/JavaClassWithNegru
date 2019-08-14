package com.teste.negru;

public class Main {

    public static void main(String[] args) {

        Number1 x = new Number1();
        Number1 y = new Number1();

        x.primulNumar();
        y.alDoileaNumar();

        int nrX = x.primulNumar();
        int nrY = y.alDoileaNumar();

        System.out.println(nrX);
        System.out.println(nrY);


        while (nrX != nrY) { //
            System.out.println("Mai generam o data numere");

        }
        System.out.println(nrX + " este egal cu " + nrY);

    }
}

