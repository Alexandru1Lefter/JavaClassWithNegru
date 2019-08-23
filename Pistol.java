package curs3.pistol.app;

/* Descriere problema

• clasa Pistol
◦ camp final initializat in constructor CAPACITATE_INCARCATOR
◦ camp cu nr gloante, initializat la schimbare incarcator
◦ metode trage() (afiseaza in mod random “ai nimerit” sau “nu ai nimerit”), punePiedica(), scoatePiedica() si
schimbaIncarcator()*/

public class Pistol {

    final int CAPACITATE_INCARCATOR; // de ce nu vrea? daca il fac = 0 merge, dar din problema nu se intelege ca trebuie sa ii dau si o valoare / ajuta-ma sa inteleg diferenta
    public int nrGloante;
    boolean piedica;

    public Pistol(int CAPACITATE_INCARCATOR) {
        if (CAPACITATE_INCARCATOR > 0) {
            this.CAPACITATE_INCARCATOR = CAPACITATE_INCARCATOR;
        } else {
            System.out.println("Capacitatea incarcatorului trebuie sa permita cel putin 1 glont");
        }
    }

    public int schimbaIncarcator(int nrGloante) {
        if (nrGloante > CAPACITATE_INCARCATOR || nrGloante <= 0) {
            System.out.println("Incarcatorul nu suporta " + nrGloante + " gloante / Incearca sa incarci cu maxim " + CAPACITATE_INCARCATOR + " gloante");
        } else {
            this.nrGloante = nrGloante;
            System.out.println("Ai incarcat cu " + this.nrGloante + " gloante");
        }
        return this.nrGloante;
    }

    public void trage() {
        if (piedica) {
            System.out.println("Atentie! Piedica este pusa!");
        } else if (nrGloante == 0) {
            System.out.println("Nu mai ai gloante! Schimba incarcator!");

        } else {
            nrGloante--;
            int sansa = (int) (Math.random() * 2);
            System.out.println("Pew pew! Pew pew!");
            if (sansa == 0) {
                System.out.println("Ai ratat...");
            } else {
                System.out.println("Ai nimerit!");
            }
        }
    }

    public void punePiedica() {
        if (piedica) {
            System.out.println("Piedica deja pusa");
        } else {
            System.out.println("Piedica pusa!");
            this.piedica = true;
        }
    }

    public void scoatePiedica() {
        if (!piedica) {
            System.out.println("Piedica deja scoasa");
        } else {
            System.out.println("Piedica scoasa!");
            this.piedica = false;
        }
    }
}

