import java.sql.*;
public class FlightManagementSystem
{
    public Flight viewFlightById(int flightId)
    {
        
        try{
        Flight flight=null;
        
        Connection con=DB.getConnection();
        PreparedStatement stmt=con.prepareStatement("select * from flight where flightId =?");
        stmt.setInt(1,flightId);
        
        
        ResultSet rs=stmt.executeQuery();
        String source;
        String destination;
        int noofseats;
        double fare;
        while(rs.next())
        {
            source=rs.getString(2);
            destination=rs.getString(3);
            noofseats=rs.getInt(4);
            fare=rs.getDouble(5);
            flight=new Flight(flightId,source,destination,noofseats,fare);
        }
        
        return flight;
        }    
        catch(ClassNotFoundException c)
        {
            return null;
        }
        catch(SQLException c)
        {
            return null;
        }
    }
}