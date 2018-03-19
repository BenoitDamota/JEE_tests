package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import models.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user1 = new User("Jean", "Némard", 42);
		User user2 = new User("Gerard", "Menvussa", 1337);
		User user3 = new User("Jean-Philippe", "Ervitemonslip", 69);
		Vector<User> users = new Vector<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		String id = request.getParameter("id");
		if (id != null) {
			request.setAttribute("idc", id);
		}
		request.setAttribute("utilisateurs", users);
		request.getRequestDispatcher( "/WEB-INF/user.jsp")
			.forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
