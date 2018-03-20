package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.forms.BonjourForm;
import models.beans.User;

/**
 * Servlet implementation class Bonjour
 */
@WebServlet("/bonjour")
public class Bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bonjour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher( "/WEB-INF/bonjourForm.jsp")
			.forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BonjourForm bf = new BonjourForm();
		User nom = bf.verifierNom(request);
		if (bf.getErreurs().isEmpty()) {
			request.getSession().setAttribute("user_session", nom);
			request.getRequestDispatcher( "/WEB-INF/bonjourOk.jsp")
				.forward( request, response );
		} else {
			request.setAttribute("erreurs", bf.getErreurs());
			this.doGet(request, response);
		}
		
	}

}




