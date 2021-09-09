<%@ page contentType="text/html;charset=UTF-8" %> 
<%
	response.setContentType("text/html; charset=UTF-8");
	String class_no = request.getAttribute("class_no").toString(); 
	String syusseki_no = request.getAttribute("syusseki_no").toString();
	String gakuseki_no = request.getAttribute("gakuseki_no").toString();
	String simei_1 = request.getAttribute("simei_1").toString();
	String simei_2 = request.getAttribute("simei_2").toString();
	String kana_1 = request.getAttribute("kana_1").toString();
	String kana_2 = request.getAttribute("kana_2").toString();
	String umare = request.getAttribute("umare").toString(); 

	String[] classList = {"AT11A192", "AT11B203", "CG11A172", "IT11A172", "AT12A165",
		"AT12B165", "IH12A101", "IW12A185", "AT13A223", "AP13A223", "IH13A223", "IW13A187",
		"CD13A166", "AP14A226", "AT14A226", "IH14A223", "CT14A187", "IW14A187", "xx14Axx"};
%>

<html>
  <head>
    <link
      href="https://cdn.jsdelivr.net/npm/tailwindcss@2.1/dist/tailwind.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/daisyui@0.22.0/dist/full.css"
      rel="stylesheet"
    />
    <title>class_userInfoEdit.jsp</title>
  </head>
  <body>
    <div
      class="flex justify-center items-center gap-6 h-screen w-full bg-gray-100"
    >
      <div class="card shadow-lg p-8 bg-white w-1/4">
				<div class="pb-2 text-xl font-bold text-gray-700 text-center">
					クラス名簿 - 更新
				</div>

				<table class="table w-full">
					<tbody>

						<form action="./class_update_done" method="POST">
					
							<tr>
								<td class='w-24 pb-2'>クラス記号</td> 
								<td class="pb-2">
									<select
										name="CLASS_NO"
										class="select select-bordered select-primary w-full"
										>
											<option value="" disabled>クラス記号を選択してください</option>
											<% for (int i = 0; i < classList.length; i++) { %>
												<option value="<%= classList[i] %>"
													<% if(classList[i].equals(class_no)) { %>
														selected
														<% } %>
														>
														<%= classList[i] %>
												</option>            
											<% } %>
									</select>
								</td>
							</tr>

							<tr>
								<td class="pb-2">出席番号</td> 
								<td class="pb-2">
									<input
										type="text"
										name="SYUSSEKI_NO"
										value="<%= syusseki_no %>"
										class="input input-primary input-bordered w-full"
										placeholder="出席番号"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">学籍番号</td> 
								<td class="pb-2">
									<input
										type="text"
										name="GAKUSEKI_NO"
										value="<%= gakuseki_no %>"
										class="input input-primary input-bordered w-full"
										placeholder="学籍番号"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">氏名(姓)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="SIMEI_1"
										value="<%= simei_1 %>"
										class="input input-primary input-bordered w-full"
										placeholder="氏名(姓)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">氏名(名)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="SIMEI_2"
										value="<%= simei_2 %>"
										class="input input-primary input-bordered w-full"
										placeholder="氏名(名)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">カナ(姓)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="KANA_1"
										value="<%= kana_1 %>"
										class="input input-primary input-bordered w-full"
										placeholder="カナ(姓)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">カナ(名)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="KANA_2"
										value="<%= kana_2 %>"
										class="input input-primary input-bordered w-full"
										placeholder="カナ(名)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-4">生年月日</td> 
								<td class="pb-4">
									<input
										type="text"
										name="UMARE"
										value="<%= umare %>"
										class="input input-primary input-bordered w-full"
										placeholder="生年月日"
										/>
								</td>
							</tr>
							
							<tr>
								<th colspan="2" class="pb-2">
									<button class="btn btn-primary btn-wide w-full">更新</button>
								</th>
							</tr>
						</form>

						<form action="./class_update_deleteSort1" method="POST">
							<tr >	
								<th colspan="2" class="pb-2">
										<input
											type="hidden"
											name="DELETE_CLASS_NO"
											value="<%= class_no %>"
											/>
										<input
											type="hidden"
											name="DELETE_GAKUSEKI_NO"
											value="<%= gakuseki_no %>"
											/>
										<button class="btn btn-secondary btn-wide  w-full">削除</button>
								</th>
							</tr>
						</form>
					</tbody>
				</table>
      </div>

			<div class="card shadow-lg p-8 bg-white w-1/4">
				<div class="pb-2 text-xl font-bold text-gray-700 text-center">
					クラス名簿 - 更新OP1
				</div>

				<table class="table w-full">
					<tbody>
						<form action="./class_update_done2" method="POST">
							<tr>
								<td class='w-24 pb-2'>クラス記号</td> 
								<td class="pb-2">
									<select
										name="CLASS_NO"
										class="select select-bordered select-primary w-full"
										>
											<option value="" disabled>クラス記号を選択してください</option>
											<% for (int i = 0; i < classList.length; i++) { %>
												<option value="<%= classList[i] %>"
													<% if(classList[i].equals(class_no)) { %>
														selected
														<% } %>
														>
														<%= classList[i] %>
												</option>            
											<% } %>
									</select>
								</td>
							</tr>
							
							<tr>
								<td class="pb-2">出席番号</td> 
								<td class="pb-2">
									<input
										type="text"
										name="SYUSSEKI_NO"
										value="<%= syusseki_no %>"
										class="input input-primary input-bordered w-full"
										placeholder="出席番号"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">学籍番号</td> 
								<td class="pb-2">
									<input
										type="text"
										name="GAKUSEKI_NO"
										value="<%= gakuseki_no %>"
										class="input input-primary input-bordered w-full"
										placeholder="学籍番号"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">氏名(姓)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="SIMEI_1"
										value="<%= simei_1 %>"
										class="input input-primary input-bordered w-full"
										placeholder="氏名(姓)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">氏名(名)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="SIMEI_2"
										value="<%= simei_2 %>"
										class="input input-primary input-bordered w-full"
										placeholder="氏名(名)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">カナ(姓)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="KANA_1"
										value="<%= kana_1 %>"
										class="input input-primary input-bordered w-full"
										placeholder="カナ(姓)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-2">カナ(名)</td> 
								<td class="pb-2">
									<input
										type="text"
										name="KANA_2"
										value="<%= kana_2 %>"
										class="input input-primary input-bordered w-full"
										placeholder="カナ(名)"
										/>
								</td>
							</tr>

							<tr>
								<td class="pb-4">生年月日</td> 
								<td class="pb-4">
									<input
										type="text"
										name="UMARE"
										value="<%= umare %>"
										class="input input-primary input-bordered w-full"
										placeholder="生年月日"
										/>
								</td>
							</tr>

							<tr>
								<th colspan="2" class="pb-2">
									<button class="btn btn-primary btn-wide  w-full">更新</button>
											<input type="hidden" name="_CLASS_NO" value="<%= class_no %>"/>
								</th>
							</tr>
						</form>

						<form action="./class_update_deleteSort1" method="POST">
							<tr>	
								<th colspan="2" class="pb-2">
										<input
											type="hidden"
											name="DELETE_CLASS_NO"
											value="<%= class_no %>"
											/>
										<input
											type="hidden"
											name="DELETE_GAKUSEKI_NO"
											value="<%= gakuseki_no %>"
											/>
										<button class="btn btn-secondary btn-wide  w-full">削除 - OP1</button>
								</th>
							</tr>
						</form>
					</tbody>
				</table>
      </div>
    </div>
  </body>
</html>
