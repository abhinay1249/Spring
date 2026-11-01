import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;


@WebServlet("/servletLife")
public class servletLife extends HttpServlet {
	
	
	static {
		System.out.println("Servlet is Loaded.");
	}

    public servletLife() {
        System.out.println("Servlet is Instantiated!");
    }

    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet is Initialized..");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Client Request is handled by the Service Method.");
	}
	
	public void destroy() {
		
	}

}
