<%@ page contentType="text/html;charset=UTF-8" %> 
<% response.setContentType("text/html;charset=UTF-8"); %>

<html>
  <head>
    <link
      href="https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link href='https://cdn.jsdelivr.net/npm/daisyui@1.1.1/dist/full.css' rel='stylesheet' type='text/css' />
    <title>名簿検索２</title>
  </head>
  <body>
    <jsp:useBean id="gakuseki_bean" scope="request" class="nhs00157.gakuseki_bean"/>
    <div class='h-screen w-full'>
      <div class='text-2xl text-center bg-primary py-5 font-bold text-white'>
        名簿検索
      </div>
      <% if (gakuseki_bean.getHint_flag() == 1) { %>
      <div class='px-5'>
        <table class='table table-compact w-full px-3 rounded-lg'>
          <thead>
            <tr>
              <th>
                クラス
              </th>
              <th>
                出席番号
              </th>
              <th>
                学籍番号
              </th>
              <th>
                氏名（姓）
              </th>
              <th>
                氏名（名）
              </th>
              <th>
                カナ（姓）
              </th>
              <th>
                カナ（名）
              </th>
              <th>
                生年月日
              </th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="class_no"/>
                <%-- <%= gakuseki_bean.getClass_no() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="syusseki_no"/>
                <%-- <%= gakuseki_bean.getGakuseki_no() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="gakuseki_no"/>
                <%-- <%= gakuseki_bean.getSyusseki_no() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="simei_1"/>
                <%-- <%= gakuseki_bean.getSimei_1() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="simei_2"/>
                <%-- <%= gakuseki_bean.getSimei_2() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="kana_1"/>
                <%-- <%= gakuseki_bean.getKana_1() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="kana_2"/>
                <%-- <%= gakuseki_bean.getKana_2() %> --%>
              </td>
              <td>
                <jsp:getProperty name="gakuseki_bean" property="umare"/>
                <%-- <%= gakuseki_bean.getUmare() %> --%>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <% } else { %>
        <h1 class="text-secondary text-lg text-center py-3">該当なし</h1>
      <% } %>

      <div class='flex justify-center pt-5'>
          <a href='/JV27/gakuseki_select.html'><button class='btn btn-link'>検索に戻る</button></a>
          <a href='/JV27/class_index.html'><button class='btn btn-link'>ホームに戻る</button></a>
      </div>
    </div>
  </body>
</html>
