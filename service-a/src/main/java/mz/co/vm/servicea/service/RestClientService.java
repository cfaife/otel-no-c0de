package mz.co.vm.servicea.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/touch-b")
@RegisterRestClient(configKey = "call-service-b")
public interface RestClientService {

    @GET
    void callServiceB();

    
} 