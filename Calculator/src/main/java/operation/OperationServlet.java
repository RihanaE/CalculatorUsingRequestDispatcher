package operation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class OperationServlet
 */
public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
//	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String operation = request.getParameter("operation");
	    RequestDispatcher rd = null;
	          
	    if(operation.equals("multiply")){  
	        rd=request.getRequestDispatcher("/MultiplicationServlet");  
	        // rd.forward(request, response);  
	    }  
	    else{  
	       
	        rd=request.getRequestDispatcher("/AdditionServlet");  
	        // rd.forward(request, response);  
	                      
	        }  
		   rd.forward(request, response); 
	    }  

}
