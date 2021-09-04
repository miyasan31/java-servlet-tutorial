import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_update_done extends HttpServlet {
	
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

		String class_no,gakuseki_no,syusseki_no,simei_1,simei_2,kana_1,kana_2,umare;
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		String class_noStr = req.getParameter("CLASS_NO");
		String syusseki_noStr = req.getParameter("SYUSSEKI_NO");
		Integer syusseki_noInt = Integer.parseInt(syusseki_noStr);
		String gakuseki_noStr = req.getParameter("GAKUSEKI_NO");
		String simei_1Str = req.getParameter("SIMEI_1");
		String simei_2Str = req.getParameter("SIMEI_2");
		String kana_1Str = req.getParameter("KANA_1");
		String kana_2Str = req.getParameter("KANA_2");
		String umareStr = req.getParameter("UMARE");
		String _syusseki_noStr = "";

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = con.createStatement();
			StringBuffer query = new StringBuffer();

			if(syusseki_noInt < 10){
				_syusseki_noStr = String.format("%02d", syusseki_noInt);
			} else {
				_syusseki_noStr = String.valueOf(syusseki_noInt);
			}
			
			query = new StringBuffer();
			query.append("update class_table set class_no = '");
			query.append(class_noStr);
			query.append("', syusseki_no = '");
			query.append(_syusseki_noStr);
			query.append("', simei_1 = '");
			query.append(simei_1Str);
			query.append("', simei_2 = '");
			query.append(simei_2Str);
			query.append("', kana_1 = '");
			query.append(kana_1Str);
			query.append("', kana_2 = '");
			query.append(kana_2Str);
			query.append("', umare = '");
			query.append(umareStr);
			query.append("' where gakuseki_no = '");
			query.append(gakuseki_noStr);
			query.append("'");
			
			stmt.executeUpdate(query.toString());

			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
				sb.append("<head>");
					sb.append("<title>名簿更新完了</title>");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/daisyui@0.26.3/dist/full.css' rel='stylesheet' type='text/css' />");
				sb.append("</head>");
				sb.append("<body>");
					sb.append("<div class='h-screen w-full'>");
						sb.append("<div class='text-2xl text-center bg-primary py-5 font-bold text-white'>名簿更新</div>");
						sb.append("<div class='px-5'>");
							sb.append("<div class='text-secondary text-lg text-center py-3 bg-white'>名簿更新完了</div>");
							sb.append("<div class='flex justify-center pt-5'>");
								sb.append("<a href='/JV27/class_update.html' class='btn btn-link'>更新に戻る</a>");
								sb.append("<a href='/JV27/class_index.html' class='btn btn-link'>ホームに戻る</a>");
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
