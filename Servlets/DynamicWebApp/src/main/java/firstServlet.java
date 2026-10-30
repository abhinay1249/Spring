import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
	
	public firstServlet() {
		IO.println("Constructor Called!");
	}
	
	public void doPost(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("uname");
		String city = request.getParameter("city");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("Hello " + username);
		writer.println("Welcome to " + city);
		
		writer.close();
	}
}
