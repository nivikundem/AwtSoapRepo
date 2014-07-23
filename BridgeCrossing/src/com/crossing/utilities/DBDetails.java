package com.crossing.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDetails {
	
	 //get database connections
	public Connection getDBConnection() throws ClassNotFoundException,
	SQLException {
		// Load the mySql Driver class
		Class.forName("com.mysql.jdbc.Driver");		
		// build the connection string, and get a connection
		String db_connect_string = "jdbc:mysql://localhost/";	
		String dbName = "qe2_bridge";
		String userName = "root"; 
		String password = "root";
		Connection con = DriverManager.getConnection(db_connect_string+dbName,userName,password);	
		return con;
    }
    	
	/**
	 * set the CrossingDetails into the DB table bridge_crossing_performance
	 * @param vrn
	 * @param gateno
	 * @param direction
	 * @param vehicleType 
	 * @return sqlQuery
	 */
	public String getCrossingDetailsInsertQuery(String vrn, String gateno, String direction, String vehicleType){		
			String	sqlQuery = " INSERT INTO qe2_bridge.bridge_crossing_performance  \n"+
					" (gate_number, vehicle_type, direction, vrn, crossing_datetime) \n"+
					"  VALUES ('"+gateno+"', '"+vehicleType+"',  '"+direction+"', '"+vrn+"', NOW()) \n";		  			
			return sqlQuery;		
	}
	
	/**
	 * Get Vehicle type for the vrn 
	 * @param vrn
	 * @return
	 */
	public String getVehicleTypeQuery(String vrn){
		String	sqlQuery = "SELECT VEHICLE_TYPE FROM qe2_bridge.vehicle_details v WHERE VRN = '"+vrn+"'";		  			
		return sqlQuery;		
	}
	
}
