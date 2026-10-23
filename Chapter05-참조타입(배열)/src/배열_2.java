/*
 * 배열 => 몇개가 필요한지 확인
 * 배열 => 선언
 * 배열 => 초기화
 * 배열 => 출력
 * 배열 => 저장된 데이터 변경
*/
import java.util.*;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr=new int[10];
         for(int i=0;i<arr.length;i++)
         {
        	 arr[i]=(int)(Math.random()*100)+1;
         }
         System.out.println("===== 일반 for ========");
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.print(arr[i]+" ");
         }
         System.out.println("\n========= for-each =========");
         // 값을 변경할 수 없다 => 출력용으로만 사용
         for(int i:arr)
         {
        	 System.out.print(i+" ");
         }
         System.out.println("\n========= toString =======");
         System.out.println(Arrays.toString(arr));
			/*
			 *  int[] arr={10,20,30,40,50};
			 *  
			 *  
			 *  stack              heap
			 * --arr-----   --------------------------  
			 *                 10    20     30    40    50 간격일정+연속배치
			 *                  |     |                |     |같은 데이터형만 사용이 가능
			 *                arr[0] arr[1]          arr[4]
			 *  ---------   --------------------------
			 *                  |
			 *             [I@58644d46
			 *                            (2*4)+0x100
			 *              ---------------------------
			 *                          (1*4)+0x100
			 *                       (1*4)+0x100
			 *               (0*4)+0x100
			 *  
			*/	
                int max=arr[0];
                int min=arr[0];
                for(int i:arr)
                {
                	if(i>max)
                		max=i;
                	if(i<min)
                		min=i;
                }
                System.out.println("MAX = "+max);
                System.out.println("MIN = "+min);
                
                System.out.println("======= MAX의 위치 =======");
                int index=0;
                for(int i=0; i<arr.length;i++)
                {
                	if(max==arr[i])
                	{
                		index=i;
                		break;
                	}
                	
                }
                System.out.println("MAX 위치가 "+(index+1)+"이다");
                System.out.println("======= MIN의 위치 =======");
                
                for(int i=0; i<arr.length;i++)
                {
                	if(min==arr[i])
                	{
                		index=i;
                		break;
                	}
                	
                }
                System.out.println("MIN 위치가 "+(index+1)+"이다");
         }
	

}
