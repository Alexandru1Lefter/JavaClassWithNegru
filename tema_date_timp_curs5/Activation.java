package tema_date_timp_curs5;

import java.time.*;
import static java.time.DayOfWeek.*;
import java.time.format.DateTimeFormatter;

public class Activation {

    private LocalDateTime start;
    private LocalDateTime end;

    private Activation(LocalDateTime start, LocalDateTime end) {

        this.start = start;
        this.end = end;

    }

    public static Activation getInstance(LocalDateTime start, LocalDateTime end) {

        if (start == null || end == null) {
            System.out.println("Start sau end sunt null");
            return null;
        }
        if (!start.isBefore(end)) {
            System.out.println("Start nu e inainte end");
            return null;
        }
        if (start.getDayOfWeek() == SUNDAY) {
            System.out.println("Start is Sunday");
            return null;
        }
        if (end.getDayOfWeek() == SUNDAY) {
            System.out.println("End is Sunday");
            return null;
        }
        return new Activation(start, end);

    }

    public static Activation getInstance(LocalDateTime start, Duration d) {
        
        return getInstance(start, start.plus(d));
    }

    public static Activation getInstance (LocalDateTime start, int zile, int ore, int minute, int secunde){

        LocalDateTime end = start.plusDays(zile).plusHours(ore).plusMinutes(minute).plusSeconds(secunde);

        return getInstance(start, end);

    }

    public static Activation getInstance(LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime) {

        LocalDateTime start = LocalDateTime.of(startDate, startTime);
        LocalDateTime end = LocalDateTime.of(endDate, endTime);

        return getInstance(start, end);
   }

    boolean overlaps(Activation a) {
        if (start.isBefore(a.end) && end.isAfter(a.start)) {
            return true;
        } else {
            return false;
        }
    }



    public String toString() {
        return formatareActivare() + "\n"+ActivationUtil.durationToDHMS(Duration.between(start, end));

    }

    public String formatareActivare() {
        return "activarea incepe: " + getSTRMomentTimp(start) + " si se incheie " + getSTRMomentTimp(end);
    }

    String getSTRMomentTimp(LocalDateTime ld) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("EEE.dd.MM.yyy 'ora' HH:mm:ss");
        return ld.format(formater);

    }


    public static void main(String[] args) {
        
        LocalDateTime ldStart=LocalDateTime.now();
        LocalDateTime ldEnd=ldStart.plusHours(8);
        Activation act0 = Activation.getInstance(ldStart, 0, 5,6,55);
        System.out.println(act0 == null? "act0 is null": act0);
        
    }
}
