import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class class_update_userFetch extends HttpServlet {
	public void doPost (
			HttpServletRequest req,
			HttpServletResponse res )
		throws ServletException , IOException {
			req.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			
		final String URL = "jdbc:mysql://localhost/nhs00157db?useUnicode=true&characterEncoding=UTF-8";
		final String USER = "miyasan";
		final String PASSWORD = "0301";
		final String DRIVER = "com.mysql.jdbc.Driver";

		Connection con = null;
		Statement stmt = null;
		String class_no,gakuseki_no,syusseki_no,simei_1,simei_2,kana_1,kana_2,umare;
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();
		
		String update_idStr = req.getParameter("UPDATE_ID");
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = con.createStatement();
			StringBuffer query = new StringBuffer();
			query.append("select * from class_table where ");
			query.append("gakuseki_no = '");
			query.append(update_idStr);
			query.append("'");
			ResultSet rs = stmt.executeQuery(query.toString());
			
			while (rs.next()) {
				req.setAttribute("class_no", rs.getString("class_no"));
				req.setAttribute("syusseki_no", rs.getString("syusseki_no"));
				req.setAttribute("gakuseki_no", rs.getString("gakuseki_no"));
				req.setAttribute("simei_1", rs.getString("simei_1"));
				req.setAttribute("simei_2", rs.getString("simei_2"));
				req.setAttribute("kana_1", rs.getString("kana_1"));
				req.setAttribute("kana_2", rs.getString("kana_2"));
				req.setAttribute("umare", rs.getString("umare"));
			}
			
			ServletContext sc = getServletContext();
			sc.getRequestDispatcher("/class_userInfoEdit.jsp").forward(req, res);
			
		} catch (SQLException ex) {
			out.println(" ---- SQL Exception ----");
			out.println(" ---- Error Message ----");
			while (ex != null) {
				out.println(ex.getMessage());
				ex = ex.getNextException();
			}
		} catch (Exception ex) {
			ex.printStackTrace(out);
		}
	}
}
