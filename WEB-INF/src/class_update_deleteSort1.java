import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;
import java.util.ArrayList;

public class class_update_deleteSort1 extends HttpServlet {
	
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
		
		HashMap<String,String> map = null;
	    ArrayList<HashMap> list = null;
	    list = new ArrayList<HashMap>();

		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();
		
		String class_no,gakuseki_no,syusseki_no,simei_1,simei_2,kana_1,kana_2,umare;
		String delete_class_idStr = req.getParameter("DELETE_CLASS_NO");
		String delete_gakuseki_idStr = req.getParameter("DELETE_GAKUSEKI_NO");
		String _syusseki_noStr = "";

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = con.createStatement();
			
			//一件削除		
			StringBuffer query = new StringBuffer();
			query.append("delete from class_table where gakuseki_no = '");
			query.append(delete_gakuseki_idStr);
			query.append("'");
			stmt.executeUpdate(query.toString());
			
			//全件取得		
			query = new StringBuffer();
			query.append("select gakuseki_no from class_table where class_no = '");
			query.append(delete_class_idStr);
			query.append("' order by syusseki_no");
			ResultSet rs = stmt.executeQuery(query.toString());
			while (rs.next()) {
				map = new HashMap<String,String>();
	            map.put("gakuseki_no",rs.getString("gakuseki_no"));
	            list.add(map);
			}
			System.out.print(list);
			
			//全件更新 
			for (int i = 0; i < list.size(); i++) {
				query = new StringBuffer();
				query.append("update class_table set syusseki_no = '");
				if (i < 10) {
					_syusseki_noStr = String.format("%02d", i + 1);
					query.append(_syusseki_noStr);
				} else {
					_syusseki_noStr = String.valueOf(i + 1);
					query.append(_syusseki_noStr);
				}
				query.append("' where gakuseki_no = '");
				query.append(list.get(i).get("gakuseki_no"));
				query.append("'");
				stmt.executeUpdate(query.toString());
			}
			
			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
				sb.append("<head>");
					sb.append("<title>名簿削除&クラス並び替え完了</title>");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/daisyui@0.26.3/dist/full.css' rel='stylesheet' type='text/css' />");
				sb.append("</head>");
			sb.append("<body>");
        		sb.append("<div class='h-screen w-full'>");
						sb.append("<div class='text-2xl text-center bg-primary py-5 font-bold text-white'>名簿削除&クラス並び替え</div>");
						sb.append("<div class='px-5'>");
							sb.append("<div class='text-secondary text-lg text-center py-3 bg-white'>名簿削除&クラス並び替え完了</div>");
							sb.append("<div class='flex justify-center pt-5'>");
								sb.append("<a href='/JV27/class_update.html' class='btn btn-link'>更新に戻る</a>");
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
