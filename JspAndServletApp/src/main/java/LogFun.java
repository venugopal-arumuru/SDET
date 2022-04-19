import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogFun
 */
@WebServlet("/LogFun")
public class LogFun extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogFun() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		
		if(uname.equals("venugopal") && pwd.equals("12345"))
			response.sendRedirect("WelcomePage.jsp");
		else
			response.sendRedirect("ErrorPage.jsp");
	}
}
