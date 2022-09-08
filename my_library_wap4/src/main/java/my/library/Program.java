package my.library;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import my.library.handlers.*;
import my.library.handlers.admin.AdminAuthorisationHandler;
import my.library.handlers.admin.AdminDashboardHandler;
import my.library.handlers.admin.NewAuthorFormHandler;

public class Program {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles(System.getenv("JAVA_RESOURCES") + "/my_library/static", Location.EXTERNAL);
        });

        app.get("/", new HomeHandler());
        app.get("/books/{books_id}", new BookDetailsHandler());
        app.get("/authors", new AuthorsHandler());
        app.get("/login", new LoginFormHandler());
        app.post("/login", new LoginSubmissionHandler());

        app.before("/admin", new AdminAuthorisationHandler());
        app.before("/admin/*", new AdminAuthorisationHandler());
        app.get("/admin", new AdminDashboardHandler());
        app.post("/admin/author/new", new NewAuthorFormHandler());

        app.start(9000);
    }
}
