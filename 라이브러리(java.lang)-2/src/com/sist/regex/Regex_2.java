package com.sist.regex;

public class Regex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("====== 데이터 추출 =======");
       String price="가격: 30,000원";
       String s=price.replaceAll("[^0-9]", "");
       System.out.println(s);
       
       
       String res="홍길동|남자|30|서울|010-1111-1111";
       String[] info=res.split("\\|");
       System.out.println(res);
       for(String i:info)
       {
    	   System.out.println(i);
       }
       
       // 특수기호를 이용해서 복잡한 문자를 찾는 방법
       //                     ------------ 문자 형식 => 패턴 => Matcher
       // => p.matcher(res) => res는 대상
       //    패턴안에 포함 여부
       // => m.find() => 패턴에 맞는 데이터 찾는다
       // => m.group() => 실제 찾은 문자열을 가지고 온다
       
	}

}
