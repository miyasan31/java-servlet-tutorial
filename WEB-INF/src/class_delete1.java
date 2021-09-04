import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_delete1 extends HttpServlet {
	
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

		String searchStr = "";
		String selectStr = req.getParameter("CLASS_NO");
		
 		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
			sb.append("<head>");
				sb.append("<title>名簿削除</title>");
				sb.append("<link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />");
				sb.append("<link href='https://cdn.jsdelivr.net/npm/daisyui@1.1.1/dist/full.css' rel='stylesheet' type='text/css' />");
			sb.append("</head>");
			sb.append("<body>");
				sb.append("<div class='h-screen w-full'>");
					sb.append("<div class='text-2xl text-center bg-primary py-5 font-bold text-white'>名簿削除</div>");
					sb.append("<div class='px-5'>");
						sb.append("<div class='text-secondary text-lg py-3 bg-white'>検索結果 : " + searchStr + "</div>");
						sb.append("<form action='./class_delete_check1' method='POST'>");
							sb.append("<table class='table table-compact w-full rounded-lg'>");
								sb.append("<thead>");
									sb.append("<tr>");
										sb.append("<th>");
											sb.append("削除");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("出席番号");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("学籍番号");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("氏名（姓）");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("氏名（名）");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("カナ（姓）");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("カナ（名）");
										sb.append("</th>");
										sb.append("<th>");
											sb.append("生年月日");
										sb.append("</th>");
									sb.append("</tr>");
								sb.append("</thead>");
								try {
									Class.forName(DRIVER);
									con = DriverManager.getConnection(URL,USER,PASSWORD);
									stmt = con.createStatement();
									StringBuffer query = new StringBuffer();
									query.append("select * from class_table where ");
									query.append("class_no = '");
									query.append(selectStr);
									query.append("' order by syusseki_no");
									ResultSet rs = stmt.executeQuery(query.toString());
									while (rs.next()) {
										syusseki_no = rs.getString("syusseki_no");
										gakuseki_no = rs.getString("gakuseki_no");
										simei_1 = rs.getString("simei_1");
										simei_2 = rs.getString("simei_2");
										kana_1 = rs.getString("kana_1");
										kana_2 = rs.getString("kana_2");
										umare = rs.getString("umare");
										sb.append("<tbody>");
											sb.append("<tr>");
												sb.append("<td>");
													sb.append("<label>");
														sb.append("<input class='checkbox checkbox-primary checkbox-mark' type='checkbox' name='DELETE_ID' value='" + gakuseki_no + "' />");
														sb.append("<span class='checkbox-mark'></span>");
													sb.append("<label>");
												sb.append("</td>");
												sb.append("<td>");
													sb.append(syusseki_no);
												sb.append("</td>");
												sb.append("<td>");
													sb.append(gakuseki_no);
												sb.append("</td>");
												sb.append("<td>");
													sb.append(simei_1);
												sb.append("</td>");
												sb.append("<td>");
													sb.append(simei_2);
												sb.append("</td>");
												sb.append("<td>");
													sb.append(kana_1);
												sb.append("</td>");
												sb.append("<td>");
													sb.append(kana_2);
												sb.append("</td>");
												sb.append("<td>");
													sb.append(umare);
												sb.append("</td>");
											sb.append("</tr>");
										sb.append("</tbody>");
									}
							sb.append("</table>");
							sb.append("<div class='flex justify-center pt-5'>");
								sb.append("<button class='btn btn-primary btn-wide'>確認</button>");
							sb.append("</div>");
						sb.append("</form>");
						sb.append("<div class='flex justify-center pt-5'>");
							sb.append("<a href='/JV27/class_delete.html'><button class='btn btn-link'>検索に戻る</button></a>");
							sb.append("<a href='/JV27/class_index.html'><button class='btn btn-link'>ホームに戻る</button></a>");
						sb.append("</div>");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</body>");
		sb.append("</html>");

		out.println(sb.toString());
		stmt.close();
		con.close();
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
}}
