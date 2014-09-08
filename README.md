AwtSoapRepo
==================
Demo of sending the form data from the AWT interface using SOAP webservice and insert into the db table




BridgeCrossing Client[Implementation of AWT interface]
-------
1.	Using wsdl, populate/ construct the client using topdown approach[contract-first] in eclipse IDE
2.	Create java applet using frame/panels and add button event listener to send the form data to the webservice client.
3.	Invoke the methods in the webservice client, by calling webservice url, and invoking the methods in it.

To Run
-------
BridgeCrossingApplet - Run as java application.


BridgeCrossing Server[Implementation of SOAP webservice]
---------
1.	Using wsdl create a webservice  using topdown approach [contract-first]
2.	In the implementation class add the functionality to accept the data sent by the client [from the AWT interface]
3.	Insert into the db table.

To Run
-------
Deploy to the Tomcat server.

Technologies
---------
- Java AWT
- J2EE
- MySql
- Tomcat
- SOAP



