import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_servlet extends HttpServlet {
  public void doPost (
    HttpServletRequest req,
    HttpServletResponse res )
  
    throws ServletException , IOException {
      req.setCharacterEncoding("UTF-8");
      res.setContentType("text/html;charset=UTF-8");

      String selectStr,gakunenStr,class_noStr;

      try {
    	  nhs00157.gakuseki_bean gakuseki_bean = new nhs00157.gakuseki_bean();
        selectStr = req.getParameter("SELECT");
        if (selectStr.equals("1")){
          class_noStr = req.getParameter("CLASS_NO");
          gakuseki_bean.setJyouken("class_no = '" + class_noStr + "'");
          gakuseki_bean.DBselect();
        } else {
          gakunenStr = req.getParameter("GAKUNEN");
          gakuseki_bean.DBselect_1();
          req.setAttribute("gakunenStr", gakunenStr);
        }
        
        req.setAttribute("gakuseki_bean", gakuseki_bean);
        ServletContext sc = getServletContext();
        if (selectStr.equals("1")){
        	sc.getRequestDispatcher("/class_bean.jsp").forward(req, res);
        } else {
        	sc.getRequestDispatcher("/class_bean1.jsp").forward(req, res);
        }
      } 
      catch (Exception ex) {
        PrintWriter out;
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        out = res.getWriter();
        ex.printStackTrace(out);
      }
    }
}