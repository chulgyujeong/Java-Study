package com.sist.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// String과 동일 => 문자열 결합 (속도가 빠르다) => append
/*
 *    StringBuffer => 문자열 => 비동기화
 *    ------------
 *    StringBuffer sb=new StringBuffer()
 *    sb.append(문장) ...
 *    
 *                     String   StringBuffer   StringBuilder
 *    문자열 변경          불가          가능             가능
 *                  메모리 누수
 *                  
 *    문자열 추가     새로운 객체 생성   기존 객체 유지     기존 객체 변경
 *    
 *    동기화           해당 없음         지원             미지원
 *    
 *    속도          반복적 변경시       상대적으로 느림      일반적으로 빠르다   
 *                 비효율적
 *    사용목적       일반 문자열          쓰레드 공유        문자열 조립    

            StringBuffer/StringBuilder
            ***append() : 문자열 결합
            insert() => 특정위치에 문자 삽입 sb.insert(0,"Hello")
            delete() => 특정 범위 삭제 뉴.delete(0,2)
            deleteCharAt() 문자 한개 삭제 sb.deleteCharAt(0)
            replace() => 문자변경 sb.replace(0,2,"JAVA")
            reverse() => 문자열 거꾸로 출력
            length() => 문자 갯수
            charAt() => 지정된 위치의 문자
            toString() => String변환
            
*/
public class StringBuilder {

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public StringBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
//        	 Document doc=Jsoup.connect("https://www.10000recipe.com/index.html").get();
//        	 System.out.println(doc.toString());		
//        	 URL url=new URL("https://www.10000recipe.com/index.html");
        	 // => 20버전 경고
        	 URI uri=URI.create("https://www.10000recipe.com/index.html");
        	 URL url=uri.toURL();
        	 
        	 
				/*
				 *   URLConnection
				 *       |
				 *   ----------------------------
				 *   |                          |
				 *   HttpURLConnection  HttpsURLConnection
				 * 
				 * 
				*/
        	 
        	 HttpURLConnection conn=
        			 (HttpURLConnection)url.openConnection();
        	 
        	 StringBuilder sb=new StringBuilder();
        	 String html="";
        	 if(conn!=null) //웹과 연결되었다면
        	 {
        		 BufferedReader br=
        				 new BufferedReader(
        				     new InputStreamReader(conn.getInputStream()));
        		 long start=System.currentTimeMillis();
        		 while(true)
        		 {
        			 String s=br.readLine();
        			 if(s==null)
        				 break;
//        			 sb.append(s+"\n");
        			 html+=s+"\n";
        		 }
        		 long end=System.currentTimeMillis();
        		 
        		 System.out.println(html);
        		 
        		 System.out.println("걸린 시간:"+(end-start)+"MS");
//        		 System.out.println(sb.toString());
        				 
        	 }
         }catch(Exception ex){}
	}

	}
		


