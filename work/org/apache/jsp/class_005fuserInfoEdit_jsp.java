package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class class_005fuserInfoEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(' ');
      out.write('\r');
      out.write('\n');

	response.setContentType("text/html; charset=UTF-8"); 
      out.write(' ');
 String class_no =
	request.getAttribute("class_no").toString(); String syusseki_no =
	request.getAttribute("syusseki_no").toString(); String gakuseki_no =
	request.getAttribute("gakuseki_no").toString(); String simei_1 =
	request.getAttribute("simei_1").toString(); String simei_2 =
	request.getAttribute("simei_2").toString(); String kana_1 =
	request.getAttribute("kana_1").toString(); String kana_2 =
	request.getAttribute("kana_2").toString(); String umare =
	request.getAttribute("umare").toString(); 
	
	String[] classList = {"AT11A192", "AT11B203", "CG11A172", "IT11A172", "AT12A165",
	 "AT12B165", "IH12A101", "IW12A185", "AT13A223", "AP13A223", "IH13A223", "IW13A187",
	 "CD13A166", "AP14A226", "AT14A226", "IH14A223", "CT14A187", "IW14A187", "xx14Axx"};

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/daisyui@0.22.0/dist/full.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <title>class_userInfoEdit.jsp</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div\r\n");
      out.write("      class=\"flex justify-center items-center gap-6 h-screen w-full bg-gray-100\"\r\n");
      out.write("    >\r\n");
      out.write("      <div class=\"card shadow-lg p-8 bg-white w-1/3\">\r\n");
      out.write("        <form action=\"./class_update_done\" method=\"POST\">\r\n");
      out.write("          <div class=\"flex justify-center items-center flex-col gap-2\">\r\n");
      out.write("            <div class=\"text-xl font-bold text-gray-700 text-center\">\r\n");
      out.write("              クラス名簿 - 更新\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\t<table class=\"table w-full\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class='w-24'>クラス記号</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"CLASS_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"select select-bordered select-primary w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled>クラス記号を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 for (int i = 0; i < classList.length; i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print( classList[i] );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
 if(classList[i].equals(class_no)) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tselected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( classList[i] );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</option>            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>出席番号</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"SYUSSEKI_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( syusseki_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"出席番号\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>学籍番号</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"GAKUSEKI_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( gakuseki_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"学籍番号\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>氏名(姓)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"SIMEI_1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( simei_1 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"氏名(姓)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>氏名(名)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"SIMEI_2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( simei_2 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"氏名(名)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>カナ(姓)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"KANA_1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( kana_1 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"カナ(姓)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>カナ(名)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"KANA_2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( kana_2 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"カナ(名)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>生年月日</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"UMARE\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( umare );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"生年月日\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-primary btn-wide w-44\">更新</button>\r\n");
      out.write("        \t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"./class_update_deleteSort1\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"DELETE_CLASS_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( class_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"DELETE_GAKUSEKI_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( gakuseki_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-secondary btn-wide w-44\">削除 - OP1</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"card shadow-lg p-8 bg-white w-1/3\">\r\n");
      out.write("        <form action=\"./class_update_done2\" method=\"POST\">\r\n");
      out.write("          <div class=\"flex justify-center items-center flex-col gap-2\">\r\n");
      out.write("            <div class=\"text-xl font-bold text-gray-700 text-center\">\r\n");
      out.write("              クラス名簿 - 更新OP2\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\t<table class=\"table w-full\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class='w-24'>クラス記号</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"CLASS_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"select select-bordered select-primary w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled>クラス記号を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 for (int i = 0; i < classList.length; i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print( classList[i] );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
 if(classList[i].equals(class_no)) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tselected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( classList[i] );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</option>            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>出席番号</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"SYUSSEKI_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( syusseki_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"出席番号\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>学籍番号</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"GAKUSEKI_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( gakuseki_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"学籍番号\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>氏名(姓)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"SIMEI_1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( simei_1 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"氏名(姓)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>氏名(名)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"SIMEI_2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( simei_2 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"氏名(名)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>カナ(姓)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"KANA_1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( kana_1 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"カナ(姓)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>カナ(名)</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"KANA_2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( kana_2 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"カナ(名)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>生年月日</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"UMARE\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print( umare );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input input-primary input-bordered w-full\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"生年月日\"\r\n");
      out.write("\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-primary btn-wide w-44\">更新</button>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"hidden\" name=\"_CLASS_NO\" value=\"");
      out.print( class_no );
      out.write("\"/>\r\n");
      out.write("        \t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"./class_update_deleteSort1\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"DELETE_CLASS_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( class_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"DELETE_GAKUSEKI_NO\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( gakuseki_no );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-secondary btn-wide w-44\">削除 - OP1</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
