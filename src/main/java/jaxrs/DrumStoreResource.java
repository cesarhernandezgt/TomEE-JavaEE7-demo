package jaxrs;

import jaxb.Drum;
import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;

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
}
