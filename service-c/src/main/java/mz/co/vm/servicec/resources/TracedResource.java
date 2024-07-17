package mz.co.vm.servicec.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/touch-c")
public class TracedResource {

    private static final Logger LOG = Logger.getLogger(TracedResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        LOG.info("you have just touch the C service");
        return "touched C\n";
    }
    
}
