/**
 * BridgeCorssingSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.crossing.www.BridgeCrossingWS;

public class BridgeCorssingSOAPSkeleton implements com.crossing.www.BridgeCrossingWS.BridgeCrossingWS_PortType, org.apache.axis.wsdl.Skeleton {
    private com.crossing.www.BridgeCrossingWS.BridgeCrossingWS_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vrn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gateno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "direction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sendCrossingDetails", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.crossing.com/BridgeCrossingWS/", "sendCrossingDetails"));
        _oper.setSoapAction("urn:SendCrossingDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendCrossingDetails") == null) {
            _myOperations.put("sendCrossingDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendCrossingDetails")).add(_oper);
    }

    public BridgeCorssingSOAPSkeleton() {
        this.impl = new com.crossing.www.BridgeCrossingWS.BridgeCorssingSOAPImpl();
    }

    public BridgeCorssingSOAPSkeleton(com.crossing.www.BridgeCrossingWS.BridgeCrossingWS_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String sendCrossingDetails(java.lang.String vrn, java.lang.String gateno, java.lang.String direction) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.sendCrossingDetails(vrn, gateno, direction);
        return ret;
    }

}
