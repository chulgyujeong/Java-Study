/*
 * 1~100까지 사이의 3배수/ 5배수/ 7배수 출력
*/public class 반복문_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//       while(i<=100)
//       {
//    	   if(i%3==0)
//    	   {
//    		   System.out.println(i+": 3의 배수 ");
//    	   }
//    	   else if(i%5==0)
//    	   {
//    		   System.out.println(i+": 5의 배수 ");
//    	   }
//    	   if(i%3==0 && i%5==0)
//        	   {
//        		   System.out.println(i+": 3,5의 배수 ");
//    	       }
//    	   if(i%7==0)
//    	   {
//    		   System.out.println(i+": 7의 배수 ");
//    	   }
//    	   i++;
//    	   }
//       }
//	}
	       
             System.out.println("\n======= 3의 배수 ======");
        	 int i=1;
             while(i<=100)
             {

          	   if(i%3==0)
          		   System.out.print(i+" ");
          	    i++;
          	   }
             System.out.println("\n======= 5의 배수 ======");
             
        	 int j=1;
             while(j<=100)
             {
          	   if(j%5==0)
          		   System.out.print(j+" ");
          	    j++;
          	   }
             
             System.out.println("\n=======7의 배수 ======");
        	 int k=1;
             while(k<=100)
             {
          	   if(k%7==0)
          		   System.out.print(k+" ");
          	    k++;
          	   }
	}
}
