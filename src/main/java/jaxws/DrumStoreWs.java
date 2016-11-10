package jaxws;

import ejb.CatalogBean;
import jaxb.Drum;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import java.util.Calendar;
import java.util.List;

@Stateless
@WebService(targetNamespace = "http://superbiz.org/wsdl")
public class DrumStoreWs {
    public DrumStoreWs() {
    }

    public String hi(){
        return "Hello World from JAX-WS. "+ Calendar.getInstance().getTime();
    }

    public Drum drumTemplate (){return new Drum();}

    @Inject
    public CatalogBean ctl;

    public Drum bestSeller(){
        return ctl.getCatalog().get(0);
    }

    public List<Drum> catalog(){
        return ctl.getCatalog();
    }
}
