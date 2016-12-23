package hei.devweb.barquartier.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.devweb.barquartier.services.QuartierService;
import hei.dewweb.barquartier.pojos.Quartiers;

@WebServlet("/addQuartier")
public class AddQuartierServlet extends AbstractGenericServlet{

	private static final long serialVersionUID = 2492704346652473241L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomQuartier = req.getParameter("nomQuartier");
		String descriptionQuartier = req.getParameter("descriptionQuartier");
		String imgQuartier = req.getParameter("imgQuartier");
		
		Quartiers quartierToAdd = new Quartiers(null,nomQuartier,descriptionQuartier,imgQuartier);
		QuartierService.getInstance().addQuartier(quartierToAdd);
		
		resp.sendRedirect("quartiers");
	}
	




}