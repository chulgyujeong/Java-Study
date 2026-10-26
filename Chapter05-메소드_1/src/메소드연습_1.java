// 1~10까지 출력하는 메소드 구현 => void
// 1~10까지 합을 구하는 메소드
public class 메소드연습_1 {
    static void print()
    {
    	 for(int i=1;i<=10;i++)
    	 {
    		System.out.print(i+"");
    	 }
    }
    static void alpha()
    {
    	 for(char c='A';'A'<='Z';c++)
    	 {
    		System.out.print(c+"");
    	 }
    }
    static int sum(int n)
    {
        int s=0;
    	for(int i=1;i<=10;i++)
    	 {
    		s+=i;
    	 }
    	return s;
    }
    // 대문자를 소문자 변경 A=65 a=97 => 32
    static char change(char c)
    {
    	return (char)(c+32);
    }
    // 문자열을 보내고 거꾸로 출력
    // 그림을 거꾸로 출력하는 프로그램을 구현
    static void reverse(String msg)
    {
    	for(int i=msg.length()-1;i>=0;i--)
    	{
    		System.out.println(msg.charAt(i));
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		print();
		System.out.println();
		alpha();
		System.out.println();
        int s=sum(s);
        System.out.println(s);
        s=sum(100);
        System.out.println(s);
	    int k='A';
	    
	}

}
