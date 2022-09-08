package my.library.handlers.admin;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import my.library.database.dao.AuthorDAO;
import my.library.models.Author;
import my.library.templating.Renderer;

import java.util.HashMap;

public class EditAuthorHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        String author_id = context.pathParam("author_id");
        Author author = AuthorDAO.get(Integer.parseInt(author_id));
        HashMap<String, Object> modelData = new HashMap<>();
        modelData.put("author", author);
        context.html(Renderer.render("admin/author_edit.ftl", modelData));
    }
}
