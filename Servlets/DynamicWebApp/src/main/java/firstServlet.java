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
		
		// writer.println("Hello " + username);
		// writer.println("Welcome to " + city);
		
		writer.println("<html><head><title>Dynamic Web App</title><head>");
		writer.println("<body><h1>Welcome to Dynamic Web Page</h1><h2>Please Fill the details</h2>");
		writer.println("<table>");
		writer.println("<tr><th>Username</th>  <th> City </th> </tr>");
		writer.println("<tr><td>"+ username +"</td><td>" +city+"</td></tr>");
		writer.println("</table> </body>");
		writer.println("</html>");
		
		writer.close();
	}
}
