package rest;

import javax.ws.rs.*;
import javax.ws.rs.Consumes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Path("/library")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class Library {
    List<Book> books = new ArrayList<Book>();
    @GET
    @Path("/books")
    public Collection<Book> getBooks() {
        books.add(new Book("123","Fawad"));
        return books;
    }

    @GET
    @Path("/book/{isbn}")
    public Book getBook(@PathParam("isbn") String id) {
        return null;
    }

    @PUT
    @Path("/book/{isbn}")
    public Book addBook(@PathParam("isbn") String id, @QueryParam("title") String title) {
        return null;
    }

    @POST
    @Path("/book/{isbn}")
    public Book updateBook(@PathParam("isbn") String id, String title) {
        return null;
    }

    @DELETE
    @Path("/book/{isbn}")
    public Book removeBook(@PathParam("isbn") String id) {
        return null;
    }
}