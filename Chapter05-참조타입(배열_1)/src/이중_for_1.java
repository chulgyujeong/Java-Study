/*
 * 형식)
 *     for()
 *     {
 *     }
 *     for()
 *     {
 *     }
 *     ------------------단일
 *     
 *     for()   ===> 줄수
 *     {
 *       for()  ===> 출력
 *       {
 *       }
 *     }
 *     
 *     ****
 *     ****
 *     ****
 *     ****
 * 
 *     *
 *     **
 *     ***
 *     ****
 *      i   j
 *     줄수 별표   i=j
 *      1   1
 *      -----
 *      2   2
 *      -----
 *      3   3
 *      -----
 *      4   4
 *      
 *      ****
 *      ***
 *      **
 *      *
 *      
 *      줄수   별표
 *      1     4
 *      -------
 *      2     3
 *      -------
 *      3     2
 *      -------
 *      4     1
 *      ------- i+j=5 j=5-i ===> 역순 : +
 *      
 *      ★☆☆☆☆
 *      ★★☆☆☆
 *      ★★★☆☆
 *      ★★★★☆
 *      ★★★★★
 *      
 *      i   j
 *      1   1    j>=i
 *      2   1,2
 *      3   1,2,3
 *      4   1,2,3,4 
 *      5   1,2,3,4,5
        1   4
*       2   3
*       3   2
*
*/


public class 이중_for_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=5;i++)
     {
    	 for(int j=1;j<=5;j++)
    	 {
    		 if(j>=i)
    			 System.out.print("★");
    		 else
    		 System.out.print("☆");
    	 }
    	 System.out.println();
     }
}
}