package CW.dateAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class dateApiExample {
    public static void main(String[] args) {

        LocalDate obj1 = LocalDate.now();
        System.out.println(obj1);

        ZoneId zone1 = ZoneId.of("Europe/Minsk");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println(time1);

        LocalTime time2 = LocalTime.now();
        System.out.println("time2 :" + time2);
        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String z : zones) {
            System.out.printf("%s, %s, %s");
        }

        Period period1y4m7d = Period.of(1, 2, 20);
        System.out.println(period1y4m7d.getDays());
        System.out.println(period1y4m7d.getMonths());
        System.out.println(period1y4m7d.get(ChronoUnit.DAYS));

        Duration time3 = Duration.ofDays(1);
        System.out.println(time3);
        Duration time4 = Duration.ofHours(24);
        System.out.println(time4);
        Duration time5 = Duration.ofMinutes(60);
        System.out.println(time5);

        Instant time6 = Instant.now();
        System.out.println(time6);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        LocalDateTime time7 = LocalDateTime.parse("11-12-2018 12:10:35", formatter1);
        System.out.println(time7);
    }
}
