package com.sist.string;
/* 문자열 분리 => split / StringTokenizer
 * 
[재료]
알감자, 양파, 대파, 청양고추, 마늘, 멸치다시팩, 맛소금

 * 
*/
import java.util.*;

public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String data=" 알감자, 양파, 대파, 청양고추, 마늘, 멸치다시팩, 맛소금";
     String[] datas=data.split(",");
     for(String s:datas)
     {
    	 System.out.println(s);
     }
     System.out.println();
     StringTokenizer st=new StringTokenizer(data,",");
     System.out.println("분리된 재료:"+st.countTokens());
	}
	/*
	 *  countTokens() : 분리된 단어 갯수
	 *  hasMoreTokrens() : 분리된 단어가 있는 동안
	 *  nextToken() : 실제 단어를 한개씩 읽어온다
	 *  단점 : ""공백 / null인 경우에는 문제가 발생
	*/}
