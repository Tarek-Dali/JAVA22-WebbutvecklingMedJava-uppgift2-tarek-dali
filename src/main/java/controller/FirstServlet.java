package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginBean;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/loggedIn.jsp");
		requestDispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = (request.getParameter("username"));
		String pass = (request.getParameter("password"));
		LoginBean loginBean = new LoginBean();
		
		loginBean.setUsername(user);
		loginBean.setPassword(pass);
		
		request.setAttribute("loginBean", loginBean);
		
		
		if(loginBean.checkCredentials()) {
			
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("loginBean", loginBean);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/loggedIn.jsp");
			requestDispatcher.forward(request, response);
		}else {
			response.sendRedirect("views/error.jsp");
		}
		
		
		
	}

}
