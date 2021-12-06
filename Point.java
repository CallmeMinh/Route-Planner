
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    public  double Latnew; //create Lat
    public  double Longnew; //create long
    
    Point (double Latnew, double Longnew){
        this.Latnew=Latnew; //set lat
        this.Longnew=Longnew; //set long
    }
    public double getLat(){
        return Math.toRadians(this.Latnew);
        //Returns in Radians
    }
    public double getLong(){
        return Math.toRadians(this.Longnew); //Returns in radians
    }
    public String toString(){
        return this.Latnew + " " + this.Longnew;
        //Returns in radians
    }
}

