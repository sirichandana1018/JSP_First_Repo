/* This example is to show why JSPs are introduced - to separate
 * presentation layer (HTML) from java code
 * We have forwarded our functionng to .jsp files in this program,
 * otherwise we will have to write that code in out.println of this program only
 */

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Handle User Inputs
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("User Name:"+username);
		System.out.println("Password:"+password);
		//Perform (or Invoke) Business Logic
		if(username.equals("aspire") && password.equals("aspire123")){
		//Invoke Success response page.
		RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
		rd.forward(request, response);
		}else{
		//Invoke Failure response page.
		RequestDispatcher rd = request.getRequestDispatcher("/Failure.jsp");
		rd.forward(request, response);
		}
		}

}
