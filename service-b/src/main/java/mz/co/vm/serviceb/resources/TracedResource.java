package mz.co.vm.serviceb.resources;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import mz.co.vm.serviceb.service.RestClientService;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Path("/touch-b")
public class TracedResource {

    @RestClient
    private RestClientService restClientService;

    private static final Logger LOG = Logger.getLogger(TracedResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        LOG.info("you have just touch the B service");
        restClientService.callServiceC();
        return "touched B\n";
    }
    
}
