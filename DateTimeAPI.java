import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateTimeAPI {
    public static void main(String[] args) {

        /**
         * Date and Time
         */

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current Date and Time: " + dateTime);
   
        /**
         * Duration and Period 
         */

        Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println("Duration between NOON and MAX time: " + duration);

        Period period = Period.between(LocalDate.of(2020, 1, 1), LocalDate.now());
        System.out.println("Period between 2020-01-01 and today: " + period);
    
        /**
         * Instant and Time-Zone
         */

        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTimeInd = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        
        System.out.println("Current Date and Time in New York: " + zonedDateTime);
        System.out.println("Current Date and Time in New York: " + zonedDateTimeInd);


    }
}
