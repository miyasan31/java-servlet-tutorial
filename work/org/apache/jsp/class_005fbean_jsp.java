package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class class_005fbean_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 response.setContentType("text/html;charset=UTF-8"); 
      out.write('\r');
      out.write('\n');
 String select =	request.getAttribute("select").toString(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link href='https://cdn.jsdelivr.net/npm/daisyui@1.1.1/dist/full.css' rel='stylesheet' type='text/css' />\r\n");
      out.write("   <title>名簿検索1</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      nhs00157.gakuseki_bean gakuseki_bean = null;
      synchronized (request) {
        gakuseki_bean = (nhs00157.gakuseki_bean) _jspx_page_context.getAttribute("gakuseki_bean", PageContext.REQUEST_SCOPE);
        if (gakuseki_bean == null){
          gakuseki_bean = new nhs00157.gakuseki_bean();
          _jspx_page_context.setAttribute("gakuseki_bean", gakuseki_bean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    <div class='h-screen w-full'>\r\n");
      out.write("      <div class='text-2xl text-center bg-primary py-5 font-bold text-white'>\r\n");
      out.write("        名簿検索\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class='px-5 w-2/3 mx-auto'>\r\n");
      out.write("\r\n");
      out.write("        <div class='text-secondary text-lg py-3 bg-white'>\r\n");
      out.write("        検索結果 : ");
      out.print( select );
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
 if (gakuseki_bean.getHint_flag() == 1) { 
          ArrayList tbl = gakuseki_bean.getTbl();
          ArrayList row = (ArrayList)tbl.get(0);
        
      out.write("\r\n");
      out.write("          <table class='table table-compact w-full px-3 rounded-lg'>\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>\r\n");
      out.write("                  クラス\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  出席番号\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  学籍番号\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  氏名（姓）\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  氏名（名）\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  カナ（姓）\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  カナ（名）\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                  生年月日\r\n");
      out.write("                </th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

              for(int i=0; i<tbl.size();i++){
              row = (ArrayList)tbl.get(i);
            
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("            ");

                for(int j=0;j<row.size();j++){
            
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("                  ");
      out.print( (String)row.get(j) );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("              ");

                  }
              
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("              ");

                }
              
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        ");
 } else { 
      out.write("\r\n");
      out.write("          <h1 class=\"text-secondary text-lg text-center py-3\">該当なし</h1>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class='flex justify-center pt-5 pb-40'>\r\n");
      out.write("          <a href='/JV27/class_bean.html'><button class='btn btn-link'>検索に戻る</button></a>\r\n");
      out.write("          <a href='/JV27/class_index.html'><button class='btn btn-link'>ホームに戻る</button></a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
