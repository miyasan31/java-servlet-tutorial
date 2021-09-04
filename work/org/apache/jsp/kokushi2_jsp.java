package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kokushi2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write("\r\n");
 
	String name = request.getAttribute("name").toString();
	String gakunen = request.getAttribute("gakunen").toString();
	String gozen = request.getAttribute("gozen").toString();
	String gogo = request.getAttribute("gogo").toString();
	String goukei = request.getAttribute("goukei").toString();
	String hantei = request.getAttribute("hantei").toString();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/daisyui@0.22.0/dist/full.css\" rel=\"stylesheet\">\r\n");
      out.write("    <title>\r\n");
      out.write("        kokushi2.jsp\r\n");
      out.write("    </title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<section class=\"h-screen flex flex-col\">\r\n");
      out.write("\r\n");
      out.write("\t<header class=\"text-gray-600 body-font shadow mb-5\">\r\n");
      out.write("\t  <div class=\"container mx-auto flex justify-center p-5\">\r\n");
      out.write("\t    <a href=\"/JV27/kokushi2.html\" class=\"flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0\">\r\n");
      out.write("\t      <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-10 h-10 text-white p-2 bg-indigo-500 rounded-full\" viewBox=\"0 0 24 24\">\r\n");
      out.write("\t        <path d=\"M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5\"></path>\r\n");
      out.write("\t      </svg>\r\n");
      out.write("\t      <span class=\"ml-3 text-xl\">国家試験判定</span>\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<main class=\"p-5\">\r\n");
      out.write("\t\r\n");
      out.write("\t    <a href=\"/JV27/kokushi2.html\">\r\n");
      out.write("\t    \t<button class=\"btn btn-accent btn-sm pr-6\">\r\n");
      out.write("\t    \t<svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-6 w-6\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\">\r\n");
      out.write("\t\t\t  <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M11 17l-5-5m0 0l5-5m-5 5h12\" />\r\n");
      out.write("\t\t\t</svg>もどる</button>\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"flex-grow text-center text-2xl\">\r\n");
      out.write("                国家試験判定\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <span class=\"text-indigo-500 text-5xl\">\r\n");
      out.write("                    ");
      out.print( gakunen );
      out.write("\r\n");
      out.write("                </span>\r\n");
      out.write("                年生の\r\n");
      out.write("                <span class=\"text-yellow-500 text-5xl\">  \r\n");
      out.write("                    ");
      out.print( name );
      out.write("\r\n");
      out.write("                </span>\r\n");
      out.write("                さん\r\n");
      out.write("                <br>\r\n");
      out.write("                あなたの得点は\r\n");
      out.write("                <br>\r\n");
      out.write("                午前\r\n");
      out.write("                <span class=\"text-purple-500 text-5xl\">  \r\n");
      out.write("                    ");
      out.print( gozen );
      out.write("\r\n");
      out.write("                </span>\r\n");
      out.write("                点\r\n");
      out.write("                <br>\r\n");
      out.write("                午後\r\n");
      out.write("                <span class=\"text-pink-500 text-5xl\">  \r\n");
      out.write("                    ");
      out.print( gogo );
      out.write("\r\n");
      out.write("                </span>\r\n");
      out.write("                点\r\n");
      out.write("                <br>\r\n");
      out.write("                合計  \r\n");
      out.write("                <span class=\"text-green-500 text-5xl\">  \r\n");
      out.write("                    ");
      out.print( goukei );
      out.write("\r\n");
      out.write("                </span>\r\n");
      out.write("                点\r\n");
      out.write("                <br>\r\n");
      out.write("                判定結果 \r\n");
      out.write("                <span class=\"text-red-500 text-5xl\">  \r\n");
      out.write("                    ");
      out.print( hantei );
      out.write("\r\n");
      out.write("                </span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
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
