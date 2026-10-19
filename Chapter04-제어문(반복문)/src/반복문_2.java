// => 1~100까지의 총합
/*
 *   변수의 범위
 *   
 *   if(조건)
 *   {
 *     int a=10;
 *     if(조건)
 *     {
 *       int b=20;
 *       if(조건)
 *       {
 *         int c=30;
 *       }//c
 *     }//b
 *   } //a  
*/public class 반복문_2 {
  // 지역변수는 {} 안에서만 사용가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 누적변수 1~100합
		int sum=0; // main에서 사용되는 변수
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		System.out.println("sum="+sum+",i="+i);
		sum+=i;
		}
		System.out.println("1~100까지의 합:"+sum);
	}

}
