<%@ page contentType="text/html;charset=UTF-8" %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<% 
	String name = request.getAttribute("name").toString();
	String gakunen = request.getAttribute("gakunen").toString();
	String gozen = request.getAttribute("gozen").toString();
	String gogo = request.getAttribute("gogo").toString();
	String goukei = request.getAttribute("goukei").toString();
	String hantei = request.getAttribute("hantei").toString();
%>

<html>
<head>
  <link href='https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css' rel='stylesheet' type='text/css' />
    <link href="https://cdn.jsdelivr.net/npm/daisyui@0.22.0/dist/full.css" rel="stylesheet">
    <title>
        kokushi2.jsp
    </title>
</head>
<body>

<section class="h-screen flex flex-col">

	<header class="text-gray-600 body-font shadow mb-5">
	  <div class="container mx-auto flex justify-center p-5">
	    <a href="/JV27/kokushi2.html" class="flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0">
	      <svg xmlns="http://www.w3.org/2000/svg" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-10 h-10 text-white p-2 bg-indigo-500 rounded-full" viewBox="0 0 24 24">
	        <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
	      </svg>
	      <span class="ml-3 text-xl">国家試験判定</span>
	    </a>
	  </div>
	</header>
	
	<main class="p-5">
	
	    <a href="/JV27/kokushi2.html">
	    	<button class="btn btn-accent btn-sm pr-6">
	    	<svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor">
			  <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M11 17l-5-5m0 0l5-5m-5 5h12" />
			</svg>もどる</button>
	    </a>
	
	    <div class="flex-grow text-center text-2xl">
                国家試験判定
                <br><br>
                <span class="text-indigo-500 text-5xl">
                    <%= gakunen %>
                </span>
                年生の
                <span class="text-yellow-500 text-5xl">  
                    <%= name %>
                </span>
                さん
                <br>
                あなたの得点は
                <br>
                午前
                <span class="text-purple-500 text-5xl">  
                    <%= gozen %>
                </span>
                点
                <br>
                午後
                <span class="text-pink-500 text-5xl">  
                    <%= gogo %>
                </span>
                点
                <br>
                合計  
                <span class="text-green-500 text-5xl">  
                    <%= goukei %>
                </span>
                点
                <br>
                判定結果 
                <span class="text-red-500 text-5xl">  
                    <%= hantei %>
                </span>
		</div>
    </main>
</body>
</html>