import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class gakuseki_servlet extends HttpServlet {
  public void doPost (
    HttpServletRequest req,
    HttpServletResponse res )
    throws ServletException , IOException {
      req.setCharacterEncoding("UTF-8");
      res.setContentType("text/html;charset=UTF-8");

      String selectStr,gakuseki_noStr,simei1_Str,simei2_Str,class_noStr,syusseki_noStr;

      try {
        nhs00157.gakuseki_bean gakuseki_bean = new nhs00157.gakuseki_bean();
        selectStr = req.getParameter("SELECT");
        if (selectStr.equals("1")){
          gakuseki_noStr = req.getParameter("GAKUSEKI_NO");
          gakuseki_bean.setJyouken("gakuseki_no = '" + gakuseki_noStr + "'");
        } else if (selectStr.equals("2")){
        	simei1_Str = req.getParameter("SIMEI_1");
        	simei2_Str = req.getParameter("SIMEI_2");
          gakuseki_bean.setJyouken("simei_1 = '" + simei1_Str + "' and simei_2 = '" + simei2_Str + "'");
        } else {
    	  class_noStr = req.getParameter("CLASS_NO");
    	  syusseki_noStr = req.getParameter("SYUSSEKI_NO");
          gakuseki_bean.setJyouken("class_no = '" + class_noStr + "' and syusseki_no = '" + syusseki_noStr + "'");
        }

        gakuseki_bean.DBselect();
        
        req.setAttribute("gakuseki_bean", gakuseki_bean);
        ServletContext sc = getServletContext();
        sc.getRequestDispatcher("/gakuseki_show.jsp").forward(req, res);
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
