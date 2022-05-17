package ch.bzz.dev.ash.bookshelf.service;

import ch.bzz.dev.ash.bookshelf.data.DataHandler;
import ch.bzz.dev.ash.bookshelf.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("books")
public class BookService {
    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooks() {
        List<Book> allBooks = DataHandler.getInstance().readAllBooks();
        return Response
                .status(200)
                .entity(allBooks)
                .build();
    }

    @Path("book/{bookUUID}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSingleBook(@PathParam("bookUUID") String bookUUID) {
         Book book = DataHandler.getInstance().readBookByUUID(bookUUID);
        return Response
                .status(200)
                .entity(book)
                .build();
    }
}
