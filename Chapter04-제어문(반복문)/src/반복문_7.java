// 2+4+6+8+...+100 i+=2
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int sum=0;
//        for(int i=2;i<=100;i+=2)
//        {
//        	sum+=i;
//        }
//        System.out.println("2+4+6..+100의 합: "+sum);
		// 5 10 15 20 25 30 35 40 45 50
//		  for(int i=1;i<=10;i++)
//			  System.out.print(i*5+" ");
		  // B D F H J L N
		  for(char a='B';a<='N';a+=2)
		  {
			  if(a>'B' && a<='N')
			  System.out.print(",");
		      System.out.print(a);
	      }
}
}