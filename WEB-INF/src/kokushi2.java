import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class kokushi2 extends HttpServlet {
	
	public void doPost (
		HttpServletRequest req,
		HttpServletResponse res )
	throws ServletException , IOException {
	req.setCharacterEncoding("UTF-8");
	res.setContentType("text/html; charset=UTF-8");

	String nameStr = req.getParameter("NAME");
	String gakunenStr = req.getParameter("GAKUNEN");
	String gozenStr = req.getParameter("GOZEN");
	Integer gozenInt = Integer.parseInt(gozenStr);
	String gogoStr = req.getParameter("GOGO");
	Integer gogoInt = Integer.parseInt(gogoStr);
	int goukeiInt = gozenInt + gogoInt;
	
	String hantei = "";
    if (gozenInt >= 65 && gogoInt >= 65 && goukeiInt >= 140) {
       hantei = "合格";
    } else {
    	hantei = "不合格";
    }
	
	
	req.setAttribute("name", nameStr);
	req.setAttribute("gakunen", gakunenStr);
	req.setAttribute("gogo", gogoStr);
	req.setAttribute("gozen", gozenStr);
	req.setAttribute("goukei", goukeiInt);
	req.setAttribute("hantei", hantei);
	
	ServletContext sc = getServletContext();
	sc.getRequestDispatcher("/kokushi2.jsp").forward(req, res);
	}		
}