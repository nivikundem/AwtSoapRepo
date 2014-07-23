<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBridgeCrossingWSProxyid" scope="session" class="com.crossing.www.BridgeCrossingWS.BridgeCrossingWSProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBridgeCrossingWSProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleBridgeCrossingWSProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleBridgeCrossingWSProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.crossing.www.BridgeCrossingWS.BridgeCrossingWS_PortType getBridgeCrossingWS_PortType10mtemp = sampleBridgeCrossingWSProxyid.getBridgeCrossingWS_PortType();
if(getBridgeCrossingWS_PortType10mtemp == null){
%>
<%=getBridgeCrossingWS_PortType10mtemp %>
<%
}else{
        if(getBridgeCrossingWS_PortType10mtemp!= null){
        String tempreturnp11 = getBridgeCrossingWS_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String vrn_1id=  request.getParameter("vrn16");
            java.lang.String vrn_1idTemp = null;
        if(!vrn_1id.equals("")){
         vrn_1idTemp  = vrn_1id;
        }
        String gateno_2id=  request.getParameter("gateno18");
            java.lang.String gateno_2idTemp = null;
        if(!gateno_2id.equals("")){
         gateno_2idTemp  = gateno_2id;
        }
        String direction_3id=  request.getParameter("direction20");
            java.lang.String direction_3idTemp = null;
        if(!direction_3id.equals("")){
         direction_3idTemp  = direction_3id;
        }
        java.lang.String sendCrossingDetails13mtemp = sampleBridgeCrossingWSProxyid.sendCrossingDetails(vrn_1idTemp,gateno_2idTemp,direction_3idTemp);
if(sendCrossingDetails13mtemp == null){
%>
<%=sendCrossingDetails13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sendCrossingDetails13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>