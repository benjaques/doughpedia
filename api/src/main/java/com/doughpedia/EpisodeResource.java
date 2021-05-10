package com.doughpedia;

import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import java.util.List;
import javax.ws.rs.core.Response;
import javax.transaction.Transactional;

@Path("episodes")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class EpisodeResource {

    @GET
    public List<Episode> get() {
        return Episode.listAll(Sort.by("id"));
    }

    @GET
    @Path("{id}")
    public Episode getSingle(@PathParam("") Long id) {
        Episode entity = Episode.findById(id);
        if (entity == null) {
            throw new WebApplicationException("Episode with id of " + id + " does not exist.", 404);
        }
        return entity;
    }

    @POST
    @Transactional
    public Response create(Episode ep) {
        if (ep.id != null) {
            throw new WebApplicationException("Id was invalidly set on request.", 422);
        }

        ep.persist();
        return Response.ok(ep).status(201).build();
    }

}
