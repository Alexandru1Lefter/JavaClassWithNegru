package tema_date_timp_curs5;

import java.time.Duration;

public class ActivationUtil {



    static String durationToDHMS(Duration d){

     // long durataSecundeTotale = durata.getSeconds();

        int days=0;
        int hours=0;
        int minutes=0;

        days=(int)d.toDays();
        d=d.minusDays(days);
        hours=(int)d.toHours();
        d=d.minusHours(hours);
        minutes=(int)d.toMinutes();
        d=d.minusMinutes(minutes);

        return "Durata "+days+" zile, "+hours+" ore, "+minutes+" minute si "+d.getSeconds()+" secunde" ;


    }
}
