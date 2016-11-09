package jaxrs;

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;


@Path("/drums")
public class DrumStoreResource {

    public DrumStoreResource() {
    }

    @Path("hi")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi(){
        return "Hello World from JAX-WS. "+ Calendar.getInstance().getTime();
    }

}
