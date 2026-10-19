
public class 반복문_while_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0, even=0, odd=0;
       int i=1;
       while(i<=100)
       {
    	   sum+=i;
    	   if(i%2==0)
    		   even+=i;
    	   else
    	        odd+=i;
    	   i++;
       }
       System.out.println("1~100까지 사이의 총합 : "+sum);
       System.out.println("1~100까지 사이의 총합 : "+even);
       System.out.println("1~100까지 사이의 총합 : "+odd);
	}

}
