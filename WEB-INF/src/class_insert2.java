import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_insert2 extends HttpServlet {
	
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

		String class_no,gakuseki_no,simei_1,simei_2,kana_1,kana_2,umare;
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		String class_noStr = req.getParameter("CLASS_NO");
		String nyuugakunendo_noStr = req.getParameter("NYUUGAKUNENDO_NO");
		String simei_1Str = req.getParameter("SIMEI_1");
		String simei_2Str = req.getParameter("SIMEI_2");
		String kana_1Str = req.getParameter("KANA_1");
		String kana_2Str = req.getParameter("KANA_2");
		String umareStr = req.getParameter("UMARE");
		String max = "";
		String maxStr = "";
		String max_gakusekinoStr = "";
		int max_gakusekinoInt;
		int new_max_gakusekinoInt;
		String new_max_gakusekinoStr;
		
		char lastChar = nyuugakunendo_noStr.charAt(nyuugakunendo_noStr.length() - 1);

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = con.createStatement();
			
			StringBuffer query = new StringBuffer();
			query.append("select gakuseki_no from class_table where gakuseki_no like '");
			query.append(lastChar);
			query.append("____' order by gakuseki_no desc limit 1");
			ResultSet rs = stmt.executeQuery(query.toString());
			
			while (rs.next()) {
				max_gakusekinoStr = rs.getString("gakuseki_no");

				System.out.print(max_gakusekinoStr);
			}
			max_gakusekinoInt =  Integer.parseInt(max_gakusekinoStr);
			new_max_gakusekinoInt =  max_gakusekinoInt + 1;
			new_max_gakusekinoStr = String.valueOf(new_max_gakusekinoInt);

			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
				sb.append("<head>");
					sb.append("<title>??????????????????</title>");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/daisyui@0.26.3/dist/full.css' rel='stylesheet' type='text/css' />");
				sb.append("</head>");
				sb.append("<body>");
					sb.append("<div class='h-screen w-full'>");
						sb.append("<div class='text-2xl text-center bg-primary py-5 font-bold text-white'>????????????</div>");
						sb.append("<div class='px-5'>");
						
							query = new StringBuffer();
							query.append("select * from class_table where class_no = '");
							query.append(class_noStr);
							query.append("'");
							query.append("order by syusseki_no desc limit 1");
							ResultSet rsmax = stmt.executeQuery(query.toString());
							if(rsmax.next()){
								max = rsmax.getString("syusseki_no");
								rsmax.close();
							}
							int maxint = Integer.parseInt(max);
							maxint = maxint + 1;

							System.out.print(maxint);
							if(maxint < 10){
								maxStr = String.format("%02d", maxint);
							} else {
								maxStr = String.valueOf(maxint);
							}
							query = new StringBuffer();
							query.append("INSERT INTO class_table");
							query.append("(class_no,syusseki_no,gakuseki_no,simei_1,simei_2,kana_1,kana_2,umare)");
							query.append("values('");
							query.append(class_noStr);
							query.append("','");
							query.append(maxStr);
							query.append("','");
							query.append(new_max_gakusekinoStr);
							query.append("','");
							query.append(simei_1Str);
							query.append("','");
							query.append(simei_2Str);
							query.append("','");
							query.append(kana_1Str);
							query.append("','");
							query.append(kana_2Str);
							query.append("','");
							query.append(umareStr);
							query.append("')");
							stmt.executeUpdate(query.toString());
							sb.append("<div class='text-secondary text-lg text-center py-3 bg-white'>??????????????????</div>");
							sb.append("<div class='flex justify-center pt-5'>");
								sb.append("<a href='/JV27/class_insert.html' class='btn btn-link'>???????????????</a>");
								sb.append("<a href='/JV27/class_index.html' class='btn btn-link'>??????????????????</a>");
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
	}
}