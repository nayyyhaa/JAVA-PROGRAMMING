/*Retrieve Flight Using Flight ID
Zaro Flight System wants to automate the process in their organization.  As a start up, they need to automate the flight management system. Help them to develop this application.

 You are provided with a public class Flight with following private attribute :

 int flightId

 String source

 String destination

 int noOfSeats

 double flightFare

 Appropriate setter and getter are written.

 A public 5 argument constructor with arguments – flightId, source, destination, noOfSeats and flightFare is also provided.   

Use Database for manipulation. Assume Flight details are already available in the database.

Create a class FlightManagementSystem which has the following method.  

public Flight viewFlightById(int flightId)  -  This method should accept a flight id as parameter and search the filight with that id in the database. If flight with that id is available return that flight object.  Else return null.

To connect to the database you are provided with database.properties file and DB.java file.

Create a class Main which has main method to perform the above operation.

In main method,

When viewFlightById method is invoked and if it returns a Flight object display the details as

Flight ID : xxx

Source : source name

Destination : destination name

No of seats : xxx

Flight Fare : xxx

If no flight with that id is available in the database, display “Invalid Flight ID”.

To execute on your machine, you can make the necessary changes to the values of connection url, username and password in the database.properties  file.  */

