import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class gakuseki_servlet1 extends HttpServlet {

  public void doPost (
    HttpServletRequest req,
    HttpServletResponse res )
    throws ServletException , IOException {

      String class_noStr = req.getParameter("CLASS_NO");
      String syusseki_noStr = req.getParameter("SYUSSEKI_NO");

      try {
        nhs00157.gakuseki_bean gakuseki_bean = new nhs00157.gakuseki_bean();

        gakuseki_bean.setJyouken("class_no = '" + class_noStr + "' and syusseki_no = '" + syusseki_noStr + "'");

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
