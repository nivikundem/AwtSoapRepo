/**
 * BridgeCorssingSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.crossing.www.BridgeCrossingWS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.crossing.utilities.DBDetails;

public class BridgeCorssingSOAPImpl implements com.crossing.www.BridgeCrossingWS.BridgeCrossingWS_PortType{
    public java.lang.String sendCrossingDetails(java.lang.String vrn, java.lang.String gateno, java.lang.String direction) throws java.rmi.RemoteException {
    	String result = setPerformanceDetails(vrn,gateno,direction);
        return (result +" VRN :: "+vrn + ", Gateno ::  "+gateno+", Direction :: "+direction);
    }
    
    /**
     * Insert the values from the soap xml/webservice request into the table
     * @param vrn
     * @param gateno
     * @param direction
     * @return
     */
    private String setPerformanceDetails(String vrn, String gateno, String direction){ 
 	   Connection con = null;
 	   String result = "SUCCESS";
        try {       			
				DBDetails dbDetails = new DBDetails();
				con = dbDetails.getDBConnection();
				String vehicleType = getVehicleType(vrn,dbDetails);
				String sqlQuery = dbDetails.getCrossingDetailsInsertQuery(vrn,gateno,direction,vehicleType);
				Statement stmt;
		   		stmt = con.createStatement();
		   	    stmt.executeUpdate(sqlQuery);
		        stmt.close();
				con.close();						
             return result;   
        } catch (java.lang.Exception ex) {        	
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }          
    }

    /**
     * getVehicleType from db table
     * @param vrn
     * @param dbDetails
     * @return
     */
	private String getVehicleType(String vrn, DBDetails dbDetails) {
		Connection con = null;
		String vehicleType = "UNKNOWN";
		try {
			String sqlQuery = dbDetails.getVehicleTypeQuery(vrn);
			Statement stmt;
			con = dbDetails.getDBConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while (rs.next()) {
				vehicleType = rs.getString("VEHICLE_TYPE");
			}
			stmt.close();
			con.close();
			return vehicleType;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
