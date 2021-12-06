
import java.util.*;
/**
 * RoutePlanner
 * This program reads in a segments associated with a route to determine the length of the
 * route and the estimated time to complete the route.
 * 
 * The computer reads in a list of segments associated with a route and determine the length of the
 * route and it's duration.
 * 
 * @author Dave Leskiw(Modified by Minh Nguyen, John Paul Fermin, John Ensomo, and Caelan Neumann)
 * @version August 18, 2021
 */
// Standard import for the Scanner class
import java.util.*;
import java.io.*;
public class RoutePlannerSkel {
    public static void main (String [] args) throws IOException {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        // create the route as a series of Segments
        ArrayList<Segment> route = new ArrayList<>();
        String routeFilename = "";
        int selection = 0;
        selection = displayMenu (in);
        while (selection != 9) {
            switch (selection) {
                case 1:
                // clear any existing route
                if (route != null) route.clear();
                // Load route from file
                System.out.printf ("Enter the route filename: ");
                routeFilename = in.nextLine();
                int segments = 0;
                segments = loadRoute(route, routeFilename);
                if (segments != 0) {
                    // successful
                    System.out.printf ("%d segments loaded%n", segments);
                }
                else {
                    // can't open the file
                    System.out.printf ("Can't open file%n");
                }
                break;
                case 2:
                // Analyse route
                analyseRoute (route, routeFilename);
                break;
            }
            System.out.printf ("Press an Enter to continue...");
            in.nextLine();
            selection = displayMenu (in);
        }

    }

    /**
     * displayMenu
     * Displays the menu of user options and reads in a selection from the user.
     * @return the user selection as a number
     */
    public static int displayMenu (Scanner in) 
    {
        System.out.printf ("\f%n");
        System.out.printf ("Route Analyser%n");
        System.out.printf ("1) Load route from file%n");
        System.out.printf ("2) Analyse route%n");
        System.out.printf ("9) Exit%n");
        System.out.printf ("Enter your selection: ");

        int selection = in.nextInt();
        in.nextLine(); // discard \n
        return selection;
    }

    /** loadRoute
     * Loads a route (series of segments) for a text file attached to the Scanner object 
     * 'routeScanner'.
     * @param list an arrayList of segments
     * @param routeFilename path of the route file
     * @return numSegments returns the number of segments in the route, 0 if the file was not found
     */
    public static int loadRoute (ArrayList<Segment> route, String routeFilename) throws IOException {
        //Counts the segments of a given route
        
        File fin = new File (routeFilename);
        int count = 0; //count variable
        Scanner input = new Scanner(fin);
        String header=input.nextLine(); 


        
        // write your code here!!!
        ArrayList<String> List = new ArrayList<String>();
        while(input.hasNext()){
            
            List.add(input.nextLine()); //adds a line to the arraylist from the file
            count++; //adds a count of segments each time one is added.
            
        }
        count -= 1;
        return count; // returns segments
        
    
    }

    /** analyseRoute
     * Given a route determine it's length and duration
     * @param route an arrayList of segments
     */
    public static void analyseRoute (ArrayList<Segment> route, String routeFilename) throws IOException  {
        // write your code here
        File fin = new File (routeFilename);
        Scanner input = new Scanner(fin);
        // write your code here!!!
        String header = input.nextLine();
        //int count=0;
        ArrayList<Double> first = new ArrayList<Double>(); //creates arraylist for cordinates
        ArrayList<Integer> second = new ArrayList<Integer>();//creates arraylist for distance
        while(input.hasNext()){
            String data = input.nextLine(); //reads in line from the file.
            String replaceString=data.replaceAll(" ",""); //replaces spaces in the string
            String[] columns = replaceString.split(","); //creates a string Array from splitting the string at the commas
            
            first.add(Double.parseDouble(columns[0])); //adds the first part of the cord to the first Arraylist
            first.add(Double.parseDouble(columns[1])); //adds the second part of the cord to the first Arraylist in the following index.
            second.add(Integer.parseInt(columns[2]));  //adds the distance to the second ArrayList
        
        }
        double holdlength=0;
        double holdestimatedTime=0;
        int indexOfArrayList2 =0;
        for(int i=0; i<first.size()-2;i+=2){
            
                
            Point start = new Point (first.get(i), first.get(i+1)); //create start point
                
        
            Point end = new Point (first.get(i+2), first.get(i+3)); //create end point
            start.getLat();
            start.getLong();
            end.getLat();
            end.getLong();
        
            Segment s = new Segment (start, end, second.get(indexOfArrayList2)); //create a segment using the points created
        
            holdlength+=s.length(); //holds the length of the segment
            holdestimatedTime+=s.estimatedTime();//holds the estimated time
        
            indexOfArrayList2++; //moves to next index in second arraylist
        
            }
          
            System.out.println("Route Data"); //Title
        System.out.printf("%s %10s \n","Description","Value"); //Headers
        System.out.printf("%s\t   %2d \n","Segments", indexOfArrayList2); //Segments
        System.out.printf("%s\t   %10.1f \n","KM", holdlength); //Distance in KM
        System.out.printf("%s\t   %10.0f \n","Minutes", holdestimatedTime); //Time in minutes
                
        }
        }

