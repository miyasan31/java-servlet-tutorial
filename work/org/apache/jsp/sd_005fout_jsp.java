package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class sd_005fout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");

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
 
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write(" <html>\r\n");
      out.write(" <head>\r\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write(" <title>従業員テーブルの内容を読み込みそのまま表示するプログラム</title>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write("\r\n");
      out.write(" <form method=\"post\" action=\"./servlet/sd_outtime\">\r\n");
      out.write("\t<select name=\"INOUT_ID\">\r\n");
      out.write("\t\t\t<option disabled selected>選択してください</option>\r\n");
      out.write("\t\t\t");
 for (int i = 0; i < list.size(); i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print( list.get(i).get("f_inout_id") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( list.get(i).get("f_employee_name") );
      out.write("\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<button>送信</button>\r\n");
      out.write(" </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write(" </html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
