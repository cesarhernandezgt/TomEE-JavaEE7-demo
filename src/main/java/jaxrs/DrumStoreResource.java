package jaxrs;

import ejb.CatalogBean;
import jaxb.Drum;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import java.util.List;

@Singleton
@Path("/drums")
public class DrumStoreResource {

    public DrumStoreResource() {
    }

    @Path("hi")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi(){
        return "Hello World from Singlenton JAX-WS. "+ Calendar.getInstance().getTime();
    }

    @Path("drumTemplate")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Drum drumTemplate(){ return new Drum(); }

    @Inject
    public CatalogBean ctl;

    @Path("bestseller")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Drum bestSeller(){
        return ctl.getCatalog().get(0);
    }

    @Path("catalog")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Drum> catalog(){
        return ctl.getCatalog();
    }
}
