package my.library.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import my.library.database.dao.AuthorDAO;
import my.library.database.dao.BookDAO;
import my.library.templating.Renderer;
import my.library.utils.MainMenu;

import java.util.HashMap;

public class AuthorsHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        HashMap<String, Object> modelData = new HashMap<>();
        modelData.put("main_menu", MainMenu.get());
        modelData.put("authors", AuthorDAO.all());
        String html_content = Renderer.render("authors.ftl", modelData);
        context.html(html_content);
    }
}
