package org.acme.quickstart;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Path("/async-hello")
public class AsynchronousGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public CompletionStage<String> hello() {
        return CompletableFuture.supplyAsync(() -> {
            return "hello";
        });
    }
}
