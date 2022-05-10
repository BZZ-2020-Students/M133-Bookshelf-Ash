package ch.bzz.dev.ash.bookshelf.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("test")
public class TestService {
    @Path("test")
    @GET
    public Response test() {
        return Response
                .status(200)
                .entity("test erfolgreich")
                .build();
    }
}
