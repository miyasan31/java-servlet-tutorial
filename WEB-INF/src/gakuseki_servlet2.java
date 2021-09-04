import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class gakuseki_servlet2 extends HttpServlet {

  public void doPost (
    HttpServletRequest req,
    HttpServletResponse res )
    throws ServletException , IOException {

      String gakuseki_noStr = req.getParameter("SIMEI_1");

      try {
        nhs00157.gakuseki_bean gakuseki_bean = new nhs00157.gakuseki_bean();

        gakuseki_bean.setJyouken("gakuseki_no = '" + gakuseki_noStr + "'");

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
