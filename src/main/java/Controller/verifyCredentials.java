package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DAOImpl;

@WebServlet("/verifyCredentials")
public class verifyCredentials extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public verifyCredentials() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		
		DAOImpl dao = new DAOImpl();
		dao.connectDB();
		boolean verify = dao.verifyCredentials(email, password);
		
		if(verify==true) {
			
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/saveRegistration.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "Invalid Username/Password");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

}
