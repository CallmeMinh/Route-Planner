import java.util.*;
public class TestSegment {
    public static void main (String [] args) {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        // Create a segment based on a couple of points
        Point start = new Point (33.74375, -116.32097);
        Point end = new Point (33.74382, -116.26814);
        Segment s = new Segment (start, end, 50);

        System.out.printf ("%10s %15s %10s%n", "Object", "Description", "Value");
        System.out.printf ("%10s %15s %10.4f%n","Start", "Lat", start.getLat());
        System.out.printf ("%10s %15s %10.4f%n", "Start", "Long", start.getLong());
        System.out.printf ("%10s %15s %10.4f%n", "End", "Lat", end.getLat());
        System.out.printf ("%10s %15s %10.4f%n", "End", "Long", end.getLong());
        System.out.printf ("%10s %15s %10.4f%n", "Segment", "Length", s.length());
        System.out.printf ("%10s %15s %10.4f%n%n", "Segment", "Est Time", s.estimatedTime());
        
        System.out.printf ("Results of System Tests%n");
        // Code to test if you calculations are correct
        System.out.printf ("Segment.length() test%n");
        double difference = Math.abs(s.length()-4.884768);
        if (difference > 0.0001) {
            // Length is incorrect
            System.out.printf ("It appears your formula to calculate the length%n of a segment is incorrect%n");
            System.out.printf ("Actual Length %.6f%n", 4.884768);
            System.out.printf ("Your Length   %.6f%n", s.length());
            System.out.printf ("Difference is %.6f%n", difference);
        } 
        else 
        {
            System.out.printf ("s.length() appears to be working correctly!%n");
        }
        System.out.printf ("%nSegment.estimatedTime() test%n");
        difference = Math.abs(s.estimatedTime()) - 5.8617;
        if (difference > 0.0001) {
            // Length is incorrect
            System.out.printf ("It appears your formula to calculate the duration%nis incorrect%n");
            System.out.printf ("Actual Duration %.6f%n", 5.8617);
            System.out.printf ("Your Duration   %.6f%n", s.estimatedTime());
            System.out.printf ("Difference is %.6f%n", difference);
        } 
        else 
        {
            System.out.printf ("s.estimatedTime() appears to be working correctly!%n");
        }        

    }
}

