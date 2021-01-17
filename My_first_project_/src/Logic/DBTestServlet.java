package Logic;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBTestServlet")

public class DBTestServlet extends HttpServlet{
	private DBTestDAO dao = new DBTestDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) 
			throws ServletException, IOException
	{
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) 
			throws ServletException, IOException
	{
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response ) 
			throws ServletException, IOException
	{
		System.out.println("연결성공");
	}

}
