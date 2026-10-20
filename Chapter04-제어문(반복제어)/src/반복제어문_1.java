/*
 *  1. 반복 제어문
 *     반복문 안에서 사용 (제외 : break => switch)
 *     
 *     break : 반복문을 중단
 *     continue : 반복문에서 제외, 건너뛰기
 *     
 *     
 *     주의점)
 *           break,continue => 밑에는 소스코딩이 불가능
 *           
 *           for()
 *           {
 *             if()
 *             {
 *               break;
 *               System.out.println() => 오류
 *             }
 *             
 *             여기는 가능
 *           }
 *           
 *           자신의 반복문만 제어가 가능
 *           aaa:
 *           for()
 *           {
 *             for()
 *             {
 *               break aaa; => label break
 *             }
 *             
 *           }
 *           
 *           자신의 반복문만 제어가 가능
 *           => 웹 => 일차 for / while / break / 일차 배열
 *                   ---------------------------------
 *                   데이터베이스 : ArrayList<FileUpload>
 *                   
 *                => fileUpload
 *                   {
 *                    int no,...
 *                    String filename...
 *                    ArrayList file
 *                   }   
 *                   
 *                   FileUpload a=new FileUpload ()
 *                   a. File
*/public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String s1="Hello Java";
//       String s2="Hello Java";
//       String s3=new String("Hello java");
//       System.out.println(s1==s2);
//       System.out.println(s1.equals(s2));
//       System.out.println(s1==s3);
//       System.out.println(s1.equalsIgnoreCase(s3));
//         System.out.println("====== break ======");
//         for(int i=1;i<=10;i++)
//         {
//        	 if(i==5)
//        	 {
//        		 break;      		 
//        		 
//        	 }
//        	 System.out.println(i+" ");
//         }
//         System.out.println("\n======= continue =======");
//         for(int i=1;i<=10;i++)
//         {
//        	 if(i==5)
//        	 {
//        		 continue;
//        	 }
//        	 System.out.print(i+" ");
//         }
//          continue -> for(증가식) / while,do~while(조건식) => 무한루프
//         int i=1;
//         while(i<=10)
//         {
//        	 if(i==5)
//        		 continue;
//        	 System.out.print(i+" ");
//        	 i++;
//         }
        	 
        	 System.out.println("\n======= continue =======");
        	 int i=1;
        	 do
        	 {
        		 if(i==5)
        		 { i++;continue;}
        		 System.out.print(i+" ");
        		 i++; 
        	 }while(i<=10);
         } 
	}
