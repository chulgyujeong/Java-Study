/*
 * 
*/
import java.io.*;
public class 반복문_while_실전_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      FileReader fr=
    		  new FileReader("C:\\javaDev\\javaStudy\\Chapter04-제어문(반복문)\\src\\반복문_while_6.java");
	  int i=0;
	  while((i=fr.read())!=-1)
	  {
		  System.out.print((char)i);
	  }
	}

}
