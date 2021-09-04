import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sd_insert extends HttpServlet {
	
	public void doPost (
		HttpServletRequest req,
		HttpServletResponse res )
		throws ServletException , IOException {

		final String URL = "jdbc:mysql://localhost/sd_kadai?useUnicode=true&characterEncoding=UTF-8";
		final String USER = "miyasan";
		final String PASSWORD = "0301";
		final String DRIVER = "com.mysql.jdbc.Driver";

		Connection con = null;
		Statement stmt = null;

		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		String employee_name = req.getParameter("EMPLOYEE_NAME");
		String employee_name_sub = req.getParameter("EMPLOYEE_NAME_SUB");
		String birthday_year = req.getParameter("BIRTHDAY_YEAR");
		String birthday_month = req.getParameter("BIRTHDAY_MONTH");
		String birthday_day = req.getParameter("BIRTHDAY_DAY");
		String employee_sex = req.getParameter("SEX");
		String employee_in_ymd = req.getParameter("EMPLOYEE_IN_YMD");
		String phone_number = req.getParameter("PHONE_1");
		String phone_number2 = req.getParameter("PHONE_2");
		String phone_number3 = req.getParameter("PHONE_3");
		String zipcode = req.getParameter("ZIPCODE");
		String address = req.getParameter("ADDRESS");
		String employee_type = req.getParameter("EMPLOYEE_TYPE");

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = con.createStatement();

			StringBuffer query = new StringBuffer();
			query.append("select * from t_employee where f_phone_number ='");
			query.append(phone_number);
			query.append("'");
			ResultSet rs = stmt.executeQuery(query.toString());

			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
				sb.append("<head>");
					sb.append("<title>従業員登録完了</title>");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />");
					sb.append("<link href='https://cdn.jsdelivr.net/npm/daisyui@0.26.3/dist/full.css' rel='stylesheet' type='text/css' />");
				sb.append("</head>");
				sb.append("<body>");
					sb.append("<div class='h-screen w-full'>");
						sb.append("<div class='text-2xl text-center bg-primary py-5 font-bold text-white'>従業員登録</div>");
						sb.append("<div class='px-5'>");
							if (rs.next()) {
								sb.append("<div class='text-secondary text-lg text-center py-3 bg-white'>従業員登録失敗</div>");
								sb.append("<div class='text-center'>" + employee_name + "はすでに登録済みです</div>");
							} else {
								query = new StringBuffer();
								query.append("INSERT INTO t_employee");
								query.append("(f_employee_name, f_employee_name_sub, f_employee_birthday, f_employee_sex, f_in_ymd, f_phone_number, f_phone_number2, f_phone_number3, f_employee_address, f_employee_zipcode, f_employee_type)");
								query.append("values('");
								query.append(employee_name);
								query.append("','");
								query.append(employee_name_sub);
								query.append("','");
								query.append(birthday_year + "-" + birthday_month + "-" + birthday_day);
								query.append("','");
								query.append(employee_sex);
								query.append("','");
								query.append(employee_in_ymd);
								query.append("','");
								query.append(phone_number);
								query.append("','");
								query.append(phone_number2);
								query.append("','");
								query.append(phone_number3);
								query.append("','");
								query.append(address);
								query.append("','");
								query.append(zipcode);
								query.append("','");
								query.append(employee_type);
								query.append("')");
								stmt.executeUpdate(query.toString());
								sb.append("<div class='text-secondary text-lg text-center py-3 bg-white'>従業員登録完了</div>");
							}
							sb.append("<div class='flex justify-center pt-5'>");
								sb.append("<a href='/JV27/sd_insert.html' class='btn btn-link'>登録に戻る</a>");
								sb.append("<a href='/JV27/sd_index.html' class='btn btn-link'>ホームに戻る</a>");
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
