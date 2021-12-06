
// Standard import for the Scanner class
import java.util.*;
public class TestPoint {
    public static void main (String [] args) {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        Point start = new Point (33.74375, -116.32097);
        double latRadians = start.getLat();
        double longRadians = start.getLong();
        // check latRadians
        System.out.printf ("Results of System Tests%n");
        // Code to test if you calculations are correct
        System.out.printf ("Point.getLat() test%n");
        double difference = Math.abs(start.getLat()-0.5889395);
        if (difference > 0.0001) {
            // Length is incorrect
            System.out.printf ("It appears that start.getLat() is incorrect%n");
            System.out.printf ("Actual getLat() %.6f%n", 0.5889395);
            System.out.printf ("Your gatLat()   %.6f%n", start.getLat());
            System.out.printf ("Difference is %.6f%n", difference);
        } 
        else 
        {
            System.out.printf ("start.getLat() appears to be working correctly!%n");
        }
        System.out.printf ("Point.getLong() test%n");
        difference = Math.abs(start.getLong()+2.030194);
        if (difference > 0.0001) {
            // Length is incorrect
            System.out.printf ("It appears your start.getLong() is incorrect%n");
            System.out.printf ("Actual getLong() %.6f%n", 2.030194);
            System.out.printf ("Your getLong()   %.6f%n", start.getLong());
            System.out.printf ("Difference is %.6f%n", difference);
        } 
        else 
        {
            System.out.printf ("start.getLong() appears to be working correctly!%n");
        }
    }
}
