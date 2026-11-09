package com.sist.lang;
// 수행시간 측정
/*
 * 
 *   종료 : exit(0)
 *   가비지컬렉션 : gc()
 *   걸린 시간 측정 : currentTimeMillis() => 1/1000
 *   출력 / 입력
 *       System.in / System.out
 *   운영체제 + 자바정보 : getProperty
*/public class System_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      long start=System.currentTimeMillis();
      for(int i=1;i<=1000000000;i++)
      {
    	  System.out.println(i);
      }
      long end=System.currentTimeMillis();
      System.out.println("걸린 시간:"+(end-start));
	}

}
