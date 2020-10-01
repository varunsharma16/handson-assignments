package user.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hsbc.exception.AuthenticationException;

import com.hsbc.model.User;
import com.hsbc.service.UserService;
import com.hsbc.utility.UserFactory;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService userService = (UserService) UserFactory.getInstance("service");
		RequestDispatcher rd = null;
		try {
			User user = userService.login(request.getParameter("username"), request.getParameter("password"));
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			rd = request.getRequestDispatcher("loginSuccess.jsp");
			rd.forward(request, response);
		} catch (AuthenticationException e) {
			rd = request.getRequestDispatcher("loginFailure.jsp");
			request.setAttribute("err", e.getMessage());
			rd.forward(request, response);
		}
	}
	}


