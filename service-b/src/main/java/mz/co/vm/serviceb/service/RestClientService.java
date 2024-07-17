package mz.co.vm.serviceb.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/touch-c")
@RegisterRestClient(configKey = "call-service-c")
public interface RestClientService {

    @GET
    void callServiceC();

    
} 