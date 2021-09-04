package nhs00157;

import java.sql.*;
import java.io.*;

public class gakuseki_bean implements Serializable {

  final String URL = "jdbc:mysql://localhost/nhs00157db?useUnicode=true&characterEncoding=UTF-8";
  final String USER = "miyasan";
  final String PASSWORD = "0301";
  final String DRIVER = "com.mysql.jdbc.Driver";

	Connection con = null;
	Statement stmt = null;

  int hint_flag;
  String class_no,gakuseki_no,syusseki_no,simei_1,simei_2,kana_1,kana_2,umare;
  String table = "class_table";
  String field = "*";
  String jyouken = "";
  String sort = "";

  public gakuseki_bean() {
    super();
  }

  public void DBselect() {
    try {
      Class.forName(DRIVER);
      con = DriverManager.getConnection(URL,USER,PASSWORD);
      stmt = con.createStatement();
      Statement stmt = con.createStatement();
      
      StringBuffer query = new StringBuffer();
      query.append("select ");
      query.append(field);
      query.append(" from ");
      query.append(table);
      query.append(" where ");
      query.append(jyouken);
      query.append(" ");
      query.append(sort);
      ResultSet rs = stmt.executeQuery(query.toString());
      System.out.println(query);

      if (rs.next() == true) {
        hint_flag = 1;
        class_no = rs.getString("class_no");
        gakuseki_no = rs.getString("gakuseki_no");
        syusseki_no = rs.getString("syusseki_no");
        simei_1 = rs.getString("simei_1");
        simei_2 = rs.getString("simei_2");
        kana_1 = rs.getString("kana_1");
        kana_2 = rs.getString("kana_2");
        umare = rs.getString("umare");
      } else {
        hint_flag = 0;
      }
      rs.close();
      stmt.close();
      con.close();
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public void setJyouken(String inJyouken) {
    jyouken = inJyouken;
  }
  public int getHint_flag() {
    return hint_flag;
  }
  public String getClass_no() {
    if (class_no.equals("")) return "";
    return class_no;
  }
  public String getGakuseki_no() {
    if (gakuseki_no.equals("")) return "";
    return gakuseki_no;
  }
  public String getSyusseki_no() {
    if (syusseki_no.equals("")) return "";
    return syusseki_no;
  }
  public String getSimei_1() {
    if (simei_1.equals("")) return "";
    return simei_1;
  }
  public String getSimei_2() {
    if (simei_2.equals("")) return "";
    return simei_2;
  }
  public String getKana_1() {
    if (kana_1.equals("")) return "";
    return kana_1;
  }
  public String getKana_2() {
    if (kana_2.equals("")) return "";
    return kana_2;
  }
  public String getUmare() {
    if (umare.equals("")) return "";
    return umare;
  }
}
