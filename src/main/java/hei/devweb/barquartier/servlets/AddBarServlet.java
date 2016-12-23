package hei.devweb.barquartier.servlets;

import java.io.IOException;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.devweb.barquartier.services.BarService;
import hei.dewweb.barquartier.pojos.Bars;

@WebServlet("/addBar")
public class AddBarServlet extends AbstractGenericServlet{

	private static final long serialVersionUID = 2066407195262137564L;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomBar = req.getParameter("nomBar");
		String descriptionBar = req.getParameter("descriptionBar");
		String jourOuverture = req.getParameter("jourOuverture");
		Time horaireOuv = Time.valueOf(req.getParameter("horaireOuv"));
		Time horaireFermeture = Time.valueOf(req.getParameter("horaireFermeture"));
		String quartierBar = req.getParameter("quartierBar");
		String styleBar = req.getParameter("styleBar");
		String imgBar = req.getParameter("imgBar");
		
		Bars barToAdd = new Bars(null,nomBar,descriptionBar,jourOuverture, horaireOuv, horaireFermeture, quartierBar, styleBar, imgBar);
		BarService.getInstance().addBar(barToAdd);
		
		resp.sendRedirect("bars");
	}
}
