package com.contable.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-000281-redhat-3
 * 2018-09-01T02:14:56.851-05:00
 * Generated source version: 3.1.11.fuse-000281-redhat-3
 * 
 */
@WebService(targetNamespace = "http://services.contable.com/", name = "ContableService")
@XmlSeeAlso({com.pica.javeriana.xmlns.contableservice.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ContableService {

    @WebMethod(action = "http://services.contable.com//saveOrden")
    @WebResult(name = "respuestaGenerica", targetNamespace = "http://xmlns.javeriana.pica.com/ContableService", partName = "parameters")
    public com.pica.javeriana.xmlns.contableservice.RespuestaGenerica saveOrden(
        @WebParam(partName = "parameters", name = "OrdenFinalizada", targetNamespace = "http://xmlns.javeriana.pica.com/ContableService")
        com.pica.javeriana.xmlns.contableservice.OrdenFinalizada parameters
    );

    @WebMethod(action = "http://services.contable.com//savePago")
    @WebResult(name = "respuestaGenerica", targetNamespace = "http://xmlns.javeriana.pica.com/ContableService", partName = "parameters")
    public com.pica.javeriana.xmlns.contableservice.RespuestaGenerica savePago(
        @WebParam(partName = "parameters", name = "PagoRealizado", targetNamespace = "http://xmlns.javeriana.pica.com/ContableService")
        com.pica.javeriana.xmlns.contableservice.PagoRealizado parameters
    );
}
