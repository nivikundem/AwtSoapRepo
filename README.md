AwtSoapRepo
==================
Demo of sending the form data from the AWT interface using SOAP webservice and insert into the db table




BridgeCrossing[Implementation of AWT interface]
-------
1.	Using wsdl, populate/ construct the client using bottom up approach in eclipse IDE
2.	Create java applet using frame/panels and add button event listener to send the form data to the webservice client.
3.	Invoke the methods in the webservice client, by calling webservice url, and invoking the methods in it.

To Run
-------
BridgeCrossingApplet - Run as java application.


BridgeCrossingClient[Implementation of SOAP webservice]
---------
1.	Using wsdl create a webservice  using bottom up approach
2.	In the implementation class add the functionality to accept the data sent by the client [from the AWT interface]
3.	Insert into the db table.

To Run
-------
Deploy to the Tomcat server.

Technologies
---------
Java AWT
J2EE
MySql
Tomcat
SOAP



