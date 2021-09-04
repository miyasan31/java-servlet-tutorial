<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.util.HashMap" %>
<%@ page import = "java.util.ArrayList" %>

 <%
 	request.setCharacterEncoding("UTF-8");
 	response.setCharacterEncoding("UTF-8");

 	Connection con = null;
 	Statement stmt = null;
 	StringBuffer SQL = null;
 	ResultSet rs = null;

 	String USER = "miyasan";
 	String PASSWORD = "0301";
 	String URL = "jdbc:mysql://localhost/sd_kadai";
 	String DRIVER = "com.mysql.jdbc.Driver";

 	StringBuffer ERMSG = null;

 	HashMap<String,String> map = null;

 	ArrayList<HashMap> list = null;
 	list = new ArrayList<HashMap>();

 	try{
 		Class.forName(DRIVER).newInstance();

 		con = DriverManager.getConnection(URL,USER,PASSWORD);

 		stmt = con.createStatement();

 		SQL = new StringBuffer();

 		SQL.append("SELECT f_inout_id, f_employee_name");
 		SQL.append(" FROM t_inout, t_employee");
 		SQL.append(" WHERE t_inout.f_employee_id = t_employee.f_employee_id");
 		SQL.append(" AND f_inout_out IS NULL");
 		System.out.println(SQL.toString());

 		rs = stmt.executeQuery(SQL.toString());

 		while (rs.next()){
 						 map = new HashMap<String,String>();
							map.put("f_inout_id",rs.getString("f_inout_id"));
							map.put("f_employee_name",rs.getString("f_employee_name"));
 						 list.add(map);
 				}
 		}


 		catch(ClassNotFoundException e){
 					ERMSG = new StringBuffer();
 					ERMSG.append(e.getMessage());
 		}
 		catch(SQLException e){
 					ERMSG = new StringBuffer();
 					ERMSG.append(e.getMessage());
 		}
 		catch(Exception e){
 					ERMSG = new StringBuffer();
 					ERMSG.append(e.getMessage());
 		}

 		finally{

 		    try{
 		        if(rs != null){
 		                     rs.close();
 		        }
 		        if(stmt != null){
 		        			 stmt.close();
 		        }
 		        if(con != null){
 		        			 con.close();
 		        }
 		    }

 		    	catch(SQLException e){
 		    	ERMSG = new StringBuffer();
 		    	ERMSG.append(e.getMessage());
 		 		}
 		 	}
 %>

 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>従業員テーブルの内容を読み込みそのまま表示するプログラム</title>
 </head>
 <body>

 <form method="post" action="./servlet/sd_outtime">
	<select name="INOUT_ID">
			<option disabled selected>選択してください</option>
			<% for (int i = 0; i < list.size(); i++) { %>
					<option value="<%= list.get(i).get("f_inout_id") %>">
						<%= list.get(i).get("f_employee_name") %>
					</option>
			<% } %>
	</select>
	<button>送信</button>
 </form>


 </body>
 </html>
