package my.library.handlers.admin;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import my.library.database.dao.BookDAO;
import my.library.models.Book;

import java.util.HashMap;
import java.util.List;


public class NewBookSubmitHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        List<String> book_authors = context.formParams("book_author");
        String title = context.formParam("title");
        HashMap<String, Object> book_data = new HashMap<>();
        book_data.put("title", title);
        Book book = new Book(book_data);
        int book_id = BookDAO.save(book);
        BookDAO.save_authors(book_authors, book_id);
    }
}
