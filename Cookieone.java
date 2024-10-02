package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieone")
public class Cookieone extends HttpServlet  {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	{
		String name=req.getParameter("username");
		String pass=req.getParameter("userpassword");
		
		Cookie c1=new Cookie("k1",name);
		Cookie c2=new Cookie("k2",pass);
		
        resp.addCookie(c1);
        resp.addCookie(c2);
        
        req.getRequestDispatcher("cookietwo").forward(req, resp);
	
	}
}
