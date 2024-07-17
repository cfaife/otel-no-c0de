package mz.co.vm.servicea.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import mz.co.vm.servicea.service.RestClientService;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Path("/touch-a")
public class TracedResource {

    @RestClient
    private RestClientService restClientService;

    private static final Logger LOG = Logger.getLogger(TracedResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        LOG.info("you have just touch the A service");
        restClientService.callServiceB();
        return "touched A\n";
    }
    
}
