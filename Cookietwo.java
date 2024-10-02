package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookietwo")
public class Cookietwo extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException{
		
		Cookie[] c1=req.getCookies();
		for(Cookie cookie:c1)
		{
			resp.getWriter().print(cookie.getValue());
		}

	
	
	}
}
