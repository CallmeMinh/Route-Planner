Route Planner

In google maps you can search for a route to a destination and google will analyze the different possible routes and highlight the best route. Typically, 2-3 routes are shown. For each route ,the length and duration are displayed.

Routes are composed of short straight segments. Based on the latitude and longitude of the start and end points the length of these segments (km) can be calculated.

Start Point
•	lat1, long1 – in radians
End Point
•	lat2, long2 – in radians
The latitude and longitude will be input as degrees from the user but need to be converted to Radians before being used in the formula. Use Math.toRadians() to convert degrees to radians.

Route File

A route file is constructed of a number of points that designate the segments of the route. This route is for Point A to Point C. The first line is just a description that should be ignored by your program. To drive the route there would be two road segments based on the file:

The Segments would be
Segment 1 (A to B)
•	Start Point: 
o	51.06462917144981, -114.0864067825141
•	End Point
o	51.06293706734136, -114.08640792330227
•	avgSpeed
o	20 KPH
Segment 2 (B to C)
•	Start Point
o	51.06293706734136, -114.08640792330227
•	End Point
o	51.058508622831475, -114.08599125943302
•	avgSpeed
o	30 KPH

Here are two 2 examples:

SAIT Polytechnic to Scotiabank Saddledome Route 1
51.06468311177396, -114.08642823771946,40
51.06692543378166, -114.06255781655366, 40
51.04843318186761, -114.06290077682085, 30
51.04838328236272, -114.06041443209398, 40
51.04139750017505, -114.06095974712035, 30
51.041117308234504, -114.05109437691239, 20
51.03906655644697, -114.05126612775439, 0

SAIT Polytechnic to Scotiabank Saddledome Route 2
51.06462917144981, -114.0864067825141, 20
51.06293706734136, -114.08640792330227, 20
51.058508622831475, -114.08599125943302, 40
51.05187820508853, -114.08590772440026, 15
51.0498337489462, -114.08340602587718, 40
51.04519429210967, -114.08382299316297, 45
51.044615239628946, -114.06068396352694, 30
51.04136648350178, -114.06089219913909, 20
51.04113080085554, -114.05113729171204, 20
51.039066555251615, -114.05120175740815, 0

Creating your own Route Files

To create your own route file go to www.google.ca/maps and establish a start and end destination. Then go into the map and identify the straight segments and their lat/long along the route. To figure out the lat/long in google maps right-click on a point in the road and then in the pull-down select the lat/long to copy the data to the clipboard. You can then paste this data into a text file along with an estimate of the speed limit for that segment. You don’t have the same real-time data for the average speed for each segment but your distances should be very similar!
