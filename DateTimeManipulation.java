import java.time.*;

public class DateTimeManipulation {
    // Method to manipulate date and time
    public void manipulateDateTime() {
        LocalDate date = LocalDate.now(); // Current date
        LocalTime time = LocalTime.now(); // Current time
        LocalDateTime dateTime = LocalDateTime.now(); // Current date and time

        // Manipulate date and time
        LocalDate nextWeek = date.plusWeeks(1); // Add one week
        LocalTime timePlusHours = time.plusHours(2); // Add two hours
        LocalDateTime dateTimeMinusDays = dateTime.minusDays(3); // Subtract three days

        System.out.println("Manipulate Date and Time:");
        System.out.println("Current date: " + date);
        System.out.println("Date next week: " + nextWeek);
        System.out.println("Current time: " + time);
        System.out.println("Time plus 2 hours: " + timePlusHours);
        System.out.println("Current date and time: " + dateTime);
        System.out.println("DateTime minus 3 days: " + dateTimeMinusDays);
    }

    // Method to manipulate Duration
    public void manipulateDuration() {
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(18, 0);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("\nManipulate Duration:");
        System.out.println("Duration between start and end time: " + duration.toHours() + " hours");
    }

    // Method to manipulate Period
    public void manipulatePeriod() {
        LocalDate startDate = LocalDate.of(2023, 9, 23);
        LocalDate endDate = LocalDate.of(2024, 9, 23);
        Period period = Period.between(startDate, endDate);

        System.out.println("\nManipulate Period:");
        System.out.println("Period between start and end date: " + period.getYears() + " years, " +
                period.getMonths() + " months, " + period.getDays() + " days");
    }

    // Method to manipulate Instant (Timestamp)
    public void manipulateInstant() {
        Instant instantNow = Instant.now(); // Current timestamp
        Instant futureInstant = instantNow.plusSeconds(3600); // 1 hour in the future

        System.out.println("\nManipulate Instant:");
        System.out.println("Current Instant: " + instantNow);
        System.out.println("Future Instant (1 hour later): " + futureInstant);
    }

    // Method to handle time zones
    public void manipulateTimeZone() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        System.out.println("\nManipulate Time Zone:");
        System.out.println("Current DateTime in Asia/Kolkata: " + zonedDateTime);

        // Convert to another time zone
        ZonedDateTime newYorkTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Same DateTime in New York: " + newYorkTime);
    }

    // Method to create Duration and Period
    public void createDurationAndPeriod() {
        Duration twoHours = Duration.ofHours(2); // 2 hours
        Period tenDays = Period.ofDays(10); // 10 days

        System.out.println("\nCreate Duration and Period:");
        System.out.println("Duration of 2 hours: " + twoHours);
        System.out.println("Period of 10 days: " + tenDays);
    }

    public static void main(String[] args) {
        DateTimeManipulation dtm = new DateTimeManipulation();

        // dtm.manipulateDateTime();      // Date and Time Manipulation
        // dtm.manipulateDuration();      // Duration Manipulation
        // dtm.manipulatePeriod();        // Period Manipulation
        // dtm.manipulateInstant();       // Instant Manipulation
        // dtm.manipulateTimeZone();      // Time Zone Manipulation
        dtm.createDurationAndPeriod(); // Create Duration and Period
    }
}