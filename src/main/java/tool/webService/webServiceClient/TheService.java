
package tool.webService.webServiceClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TheService", targetNamespace = "http://webServiceServer.webService.tool/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TheService {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "addResult", partName = "addResult")
    @Action(input = "http://webServiceServer.webService.tool/TheService/addRequest", output = "http://webServiceServer.webService.tool/TheService/addResponse")
    public int add(
        @WebParam(name = "a", partName = "a")
        int a,
        @WebParam(name = "b", partName = "b")
        int b);

}
