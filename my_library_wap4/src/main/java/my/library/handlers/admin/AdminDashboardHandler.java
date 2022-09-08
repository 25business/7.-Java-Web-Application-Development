package my.library.handlers.admin;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import my.library.templating.Renderer;

public class AdminDashboardHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        context.html(Renderer.render("admin/dashboard.ftl"));
    }
}
