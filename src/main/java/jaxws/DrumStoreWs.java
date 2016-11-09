package jaxws;


import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.Calendar;

@Stateless
@WebService(targetNamespace = "http://superbiz.org/wsdl")
public class DrumStoreWs {
    public DrumStoreWs() {
    }

    public String hi(){
        return "Hello World from JAX-WS. "+ Calendar.getInstance().getTime();
    }
}
