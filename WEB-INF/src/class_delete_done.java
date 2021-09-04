import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_delete_done extends HttpServlet {
	
	public void doPost (
		HttpServletRequest req,
		HttpServletResponse res )
		throws ServletException , IOException {

		final String URL = "jdbc:mysql://localhost/nhs00157db?useUnicode=true&characterEncoding=UTF-8";
		final String USER = "miyasan";
		final String PASSWORD = "0301";
		final String DRIVER = "com.mysql.jdbc.Driver";

		Connection con = null;
		Statement stmt = null;

		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		String delete_idStr = req.getParameter("DELETE_ID");

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = con.createStatement();

			StringBuffer query = new StringBuffer();
			query.append("delete from class_table where gakuseki_no = '");
			query.append(delete_idStr);
			query.append("'");
			
			stmt.executeUpdate(query.toString());
			
			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
				sb.append("<head>");
					sb.append("<title>名簿削除完了</title>");
        	sb.append("<link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/daisyui@0.26.3/dist/full.css' rel='stylesheet' type='text/css' />");
				sb.append("</head>");
				sb.append("<body>");
        	sb.append("<div class='h-screen w-full'>");
						sb.append("<div class='text-2xl text-center bg-primary py-5 font-bold text-white'>名簿削除</div>");
						sb.append("<div class='px-5'>");
							sb.append("<div class='text-secondary text-lg text-center py-3 bg-white'>名簿削除完了</div>");
							sb.append("<div class='flex justify-center pt-5'>");
								sb.append("<a href='/JV27/class_delete.html' class='btn btn-link'>削除に戻る</a>");
								sb.append("<a href='/JV27/class_index.html' class='btn btn-link'>ホームに戻る</a>");
							sb.append("</div>");
						sb.append("</div>");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</body>");
		sb.append("</html>");
		out.println(sb.toString());
		stmt.close();
		con.close();
		}
		catch (SQLException ex) {
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
