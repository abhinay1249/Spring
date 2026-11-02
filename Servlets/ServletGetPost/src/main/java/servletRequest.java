import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/servletRequest")
public class servletRequest extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uname");
		String city  = request.getParameter("city");
		
		if(username.equals("Abhinay") && city.equals("Hyderabad")) {
			System.out.println("Hello " + username +"! Welcome to " + city);
		}else {
			System.out.println("Hello" + username + "Good to See You!");
		}	
		
	}
}
