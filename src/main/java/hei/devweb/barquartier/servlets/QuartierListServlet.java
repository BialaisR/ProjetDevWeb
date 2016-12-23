package hei.devweb.barquartier.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

@WebServlet("/quartiers")
public class QuartierListServlet extends AbstractGenericServlet{


	private static final long serialVersionUID = -7969072066466076929L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		TemplateEngine templateEngine = this.createTemplateEngine(req);
		WebContext context = new WebContext(req, resp, getServletContext());
		templateEngine.process("quartiers", context, resp.getWriter());
		
	}
	
}