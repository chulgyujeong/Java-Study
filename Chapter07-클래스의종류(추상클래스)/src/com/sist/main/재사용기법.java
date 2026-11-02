package com.sist.main;
import javax.swing.*;
public class 재사용기법 
//extends JFrame
{

	 JFrame f=new JFrame(); // 포함 클래스 => 변경없이 사용 : 오버라이딩 가능
	 // 익명의 클래스 : 윈도우 / 쓰레드 / 네트워크
     public 재사용기법()
     {
//    	 setSize(640,400);
//    	 setVisible(true);
    	 f.setSize(640,400);
    	 f.setVisible(true);
     }
     public static void main(String[] args) {
 		// TODO Auto-generated method stub\
    	 new 재사용기법();
	}

}
