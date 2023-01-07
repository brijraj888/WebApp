package Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DAOImpl;

@WebServlet("/ReadServelet")
public class ReadServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReadServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			HttpSession session = request.getSession(false);
			if(session.getAttribute("email")!=null) 
			{
			DAOImpl dao = new DAOImpl();
			dao.connectDB();
			ResultSet result = dao.readRegistration();
			
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/ReadRegistration.jsp");
			rd.forward(request, response);
			}else {
				
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);	
			}
			
		} catch (Exception e) {
			request.setAttribute("error", "Session Time Out. Please Login Again.");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);	
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
