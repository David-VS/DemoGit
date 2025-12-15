import be.ehb.personen.Persoon;

import java.time.LocalDate;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        int i = 0;

        Persoon persoon = new Persoon("Arnold", "Swarzenegher", LocalDate.parse("1970-05-06"));
        System.out.println(persoon.getAge());


        Date datum;
    }
}
