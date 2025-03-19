package UtilityclassPratice;

import java.util.Date;                // Legacy Date class
import java.time.LocalDateTime;      // Modern java.time package
import java.time.format.DateTimeFormatter;

public class Dateclasspratice {
    public static void main(String[] args) {
        // Using java.util.Date (Legacy)
        System.out.println("=== Legacy Date Class ===");
        Date currentDate = new Date(); // Current date and time
        System.out.println("Current Date: " + currentDate);

        // Getting milliseconds since epoch
        long millis = currentDate.getTime();
        System.out.println("Milliseconds since epoch: " + millis);

        // Setting a specific time
        Date specificDate = new Date();
        specificDate.setTime(1672531199000L); // Example timestamp
        System.out.println("Specific Date: " + specificDate);

        // Checking before and after
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + 10000); // 10 seconds later
        System.out.println("Is date1 before date2? " + date1.before(date2));
        System.out.println("Is date1 after date2? " + date1.after(date2));

        // Comparing dates
        Date date3 = new Date(date1.getTime());
        System.out.println("Are date1 and date3 equal? " + date1.equals(date3));

        // Using java.time package (Modern)
        System.out.println("\n=== Modern java.time Package ===");
        LocalDateTime now = LocalDateTime.now(); // Current date and time
        System.out.println("Current Date and Time: " + now);

        // Formatting the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDate);

        // Adding or subtracting time
        LocalDateTime futureTime = now.plusHours(2).plusMinutes(30); // 2 hours 30 mains later
        System.out.println("Future Time: " + futureTime.format(formatter));

        LocalDateTime pastTime = now.minusDays(1); // 1 day earlier
        System.out.println("Past Time: " + pastTime.format(formatter));
    }
}
