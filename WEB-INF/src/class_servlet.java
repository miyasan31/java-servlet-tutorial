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
          selectStr = req.getParameter("GAKUNEN");
          gakuseki_bean.setJyouken("class_no LIKE '___" + selectStr + "____'");
          gakuseki_bean.setSort("ORDER BY class_no, syusseki_no");
          gakuseki_bean.DBselect();
          req.setAttribute("select", selectStr + "年");
        } else {
          selectStr = req.getParameter("CLASS_NO");
          gakuseki_bean.setSort("ORDER BY syusseki_no");
          gakuseki_bean.setJyouken("class_no = '" + selectStr + "'");
          gakuseki_bean.setSort("ORDER BY syusseki_no");
          gakuseki_bean.DBselect();
          req.setAttribute("select", selectStr);
        }
        
        req.setAttribute("gakuseki_bean", gakuseki_bean);
        ServletContext sc = getServletContext();
        sc.getRequestDispatcher("/class_bean.jsp").forward(req, res);
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