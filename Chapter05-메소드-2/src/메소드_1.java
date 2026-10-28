/*
 * 
 *  메소드는 사용자 요청 처리하기 위한 명령문의 집합
 *                            ===== ;
 *                            int a=10;
 *                            a 메모리를 만들어서 10을 저장
 *         ----------- 특정 작업(기능)
 *  => 코드 재사용 / 기능 분리 (분업 처리)
 *  => 개발 (X) => 유지보수 목적
 *  -------------------------------------------
 *  매개변수 : 사용자가 요청 값
 *  리턴형 : 요청처리 결과값
 *  ----- 권장 (동일) => 클수도 있다
 *  결과값을 넘겨주는 경우 : return 값
 *                          -----
 *  => 정수 10개 => 합을 구해서 반환
 *  -------------
 *     매개변수 : int[]
 *     리턴형 : int
 *     return 합계값
 * 
 * 
 *  최대값 최소값 짝수 홀수개수
*/
import java.util.*;
public class 메소드_1 {
	static int hap(int[] arr)
	{
	 int sum=0;
	 for(int i:arr)
	 {
		 sum+=i;
	 }
	 return sum;
	}
	
	static int Min(int[] arr)
	{
	 int Min=100;
	 for(int i:arr)
	 {
		 if(i<Min)
			 Min=i;
	 }
	 return Min;
	}
	
	static int Max(int[] arr)
	{
	 int Max=0;
	 for(int i:arr)
	 {
		 if(i>Max)
			 Max=i;
	 }
	 return Max;
	}
	
	static double div(int[] arr)
	{
	 int sum=0;
	 for(int i:arr)
	 {
		 sum+=i;
	 }
	 return sum/10.0;
	}
	
	static int even(int[] arr)
	{
	 int count=0;
	 for(int i:arr)
	 {
		 if(i%2==0)
		    count++;
	 }
	 return count;
	}
	
	static int odd(int[] arr)
	{
	 int count=0;
	 for(int i:arr)
	 {
		 if(i%2!=0)
		    count++;
	 }
	 return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr=new int[10];
          for(int i=0;i<arr.length;i++)
          {
        	  arr[i]=(int)(Math.random()*100)+1;
          }
          
          int sum=hap(arr);
        		  System.out.println(Arrays.toString(arr));
        		  System.out.println("합:"+sum);
        		  
          int Min=Min(arr);
         System.out.println("최소값:"+Min);
         
         int Max=Max(arr);
         System.out.println("최대값:"+Max);
         
         double div=div(arr);
         System.out.println("평균:"+div);
         
         int even=even(arr);
         System.out.println("짝수:"+even);
         
         int odd=odd(arr);
         System.out.println("홀수:"+odd);
	}

}
