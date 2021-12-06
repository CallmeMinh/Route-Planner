
/**
 * Write a description of class Segment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Segment{
    private static double x1;
    private static double y1;
    private static double x2;
    private static double y2;
    private double avgspeed;
    private double distance;
    private double time;
    public Segment (Point _start, Point _end, double _avgspeed){
        this.x1= _start.getLat(); //lat1 start.getLat()
        this.y1= _start.getLong(); //long1
        this.x2= _end.getLat(); //lat2
        this.y2= _end.getLong(); //long2
        this.avgspeed = _avgspeed;
}
public double length(){
    
    double distance= 2*6371*Math.sqrt(Math.sin((this.x2-this.x1)/2) * Math.sin((this.x2-this.x1)/2) + Math.cos(this.x2)*Math.cos(this.x1) * Math.sin((this.y2-this.y1)/2) * Math.sin((this.y2-this.y1)/2));
    return this.distance=distance; //calcs and returns distance
}
public double estimatedTime(){
    double time;
    time = distance/this.avgspeed * 60;
    return this.time=time;
    //calculates and returns estimated time.
}


}