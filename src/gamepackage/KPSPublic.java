/**
 * KPSPublic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gamepackage;

import gamepackage.KPSPublicSoap_PortType;

public interface KPSPublic extends javax.xml.rpc.Service {
    public java.lang.String getKPSPublicSoapAddress();

    public KPSPublicSoap_PortType getKPSPublicSoap() throws javax.xml.rpc.ServiceException;

    public KPSPublicSoap_PortType getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getKPSPublicSoap12Address();

    public KPSPublicSoap_PortType getKPSPublicSoap12() throws javax.xml.rpc.ServiceException;

    public KPSPublicSoap_PortType getKPSPublicSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
