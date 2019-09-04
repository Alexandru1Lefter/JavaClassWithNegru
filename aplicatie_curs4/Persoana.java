package aplicatie_curs4;

public class Persoana {

    String nume;
    int zi;
    int luna;
    int an;
    private static Persoana instancePersoana;

    private Persoana(String nume, int zi, int luna, int an) {
        this.nume = nume;
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    public static Persoana getInstance(String nume, String data) {
        if (valideazaNume(nume) && valideazaData(data)){
            String[] parts = data.split("-");
            int partZi = Integer.parseInt(parts[0]);
            int partLuna = Integer.parseInt(parts[1]);
            int partAn = Integer.parseInt(parts[2]);

            instancePersoana = new Persoana(nume, partZi, partLuna, partAn);
            return instancePersoana;

        }
        else return null;


    }

    private static boolean valideazaNume(String nume) {
        if (nume != null && nume.length() > 3 && nume.contains(" ")) {

            System.out.println("Persoana valida");
            return true;
        } else {
            System.out.println("Persoana invalida");
            return false;
        }

    }

    private static boolean valideazaData(String data) {
        if (data != null && data.length() == 10) {
            String[] parts = data.split("-");
            if (parts.length == 3) {
                String partZi = parts[0];
                String partLuna = parts[1];
                String partAn = parts[2];

                if(Helper.valideazaNumar(partZi) && Helper.valideazaNumar(partLuna) && Helper.valideazaNumar(partAn)){
                    int zi = Integer.parseInt(partZi);
                    int luna = Integer.parseInt(partLuna);
                    int an = Integer.parseInt(partAn);
                    if (zi >= 1 && zi <= 31 && luna >= 1 && luna <= 12 && an >= 1900 && an <= 2019 ){
                        return true;

                    }
                }

            }


        }
        return false;
    }
}
