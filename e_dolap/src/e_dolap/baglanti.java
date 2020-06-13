/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_dolap;

/**
 *
 * @author ASUS
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.net.ConnectException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class baglanti {
    
          static Connection myConn;
	  static Statement sorgu;
	
	  static ResultSet yap() {
		
		ResultSet res=null;
		try {
			
		  Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
                  Statement sorgu = myConn.createStatement();
                  res = sorgu.executeQuery("select * from dolap");
                  
		   } catch (Exception e) {
                    e.printStackTrace();
        }
                return res;
          }

               
	
		
         
          
public void malzeme_ekle(String sorgucumlecigi){
	try {
	 	 Connection baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");//veritaban�yla baglant� kuruyoruz diger a��klamalar yukar�da va
	 	 Statement sorgu = baglanti.createStatement(); //sql sorgusu icin yeni bir ifade nesnesi oluşturuyoruz
                 sorgu.executeUpdate(sorgucumlecigi);
	      
	     } 
        catch (Exception e) 
	  {
             e.printStackTrace();
	  }
}
          
public void sil(String sorgucumlecigi){
        try {

	  Connection baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
	  Statement sorgu = baglanti.createStatement(); //sql sorgusu icin yeni bir ifade nesnesi oluşturuyoruz
	  sorgu.executeUpdate(sorgucumlecigi);
        }
        catch (Exception e){
     
	 e.printStackTrace(); }   
 }
      
public void guncelleme (String sorgucumlecigi){
        try {

	 Connection baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
	 Statement sorgu = baglanti.createStatement(); 
	 sorgu.executeUpdate(sorgucumlecigi);
        }
 catch (Exception e) {
	 
	 e.printStackTrace();
 } 
 }
static ResultSet sorgula(String sql_sorgu){
    
    ResultSet res=null;
              try {
                  Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
                  Statement sorgu = myConn.createStatement();
                  res=sorgu.executeQuery(sql_sorgu);
                
              } catch (Exception e) {
                  e.printStackTrace();
                 
              }
    return res; 
}
       
}

