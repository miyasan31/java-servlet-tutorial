<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %> 
<% 
  response.setContentType("text/html;charset=UTF-8");
  String select =	request.getAttribute("select").toString();
%>

<html>
  <head>
    <link
      href="https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link href='https://cdn.jsdelivr.net/npm/daisyui@1.1.1/dist/full.css' rel='stylesheet' type='text/css' />
   <title>名簿検索1</title>
  </head>
  <body>
    <jsp:useBean id="gakuseki_bean" scope="request" class="nhs00157.gakuseki_bean"/>
    <div class='h-screen w-full'>
      <div class='text-2xl text-center bg-primary py-5 font-bold text-white'>
        名簿検索
      </div>

      <div class='px-5 w-2/3 mx-auto'>

        <div class='text-secondary text-lg py-3 bg-white'>
        検索結果 : <%= select %>
        </div>

        <% if (gakuseki_bean.getHint_flag() == 1) { 
          ArrayList tbl = gakuseki_bean.getTbl();
          ArrayList row = (ArrayList)tbl.get(0);
        %>
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
            <%
              for(int i=0; i<tbl.size();i++){
              row = (ArrayList)tbl.get(i);
            %>
              <tr>
            <%
                for(int j=0;j<row.size();j++){
            %>
                <td>
                  <%= (String)row.get(j) %>
                </td>
              <%
                  }
              %>
                </tr>
              <%
                }
              %>
            </tbody>
          </table>
        <% } else { %>
          <h1 class="text-secondary text-lg text-center py-3">該当なし</h1>
        <% } %>
      </div>

      <div class='flex justify-center pt-5 pb-40'>
          <a href='/JV27/class_bean.html'><button class='btn btn-link'>検索に戻る</button></a>
          <a href='/JV27/class_index.html'><button class='btn btn-link'>ホームに戻る</button></a>
      </div>
    </div>
  </body>
</html>