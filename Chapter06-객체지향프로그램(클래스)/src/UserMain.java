class card{
	int no;
	String type;
	static int width; // 객체.변수, 클래스.변스
	static int height;	
	
}
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          card a = new card();
          a.no=2;
          a.type="☆";
          a.width=200;
          a.height=300;
          card b = new card();
          b.no=3;
          b.type="◆";
          b.width=250;
          b.height=350;
          card c = new card();
          c.no=4;
          c.type="＠";
          c.width=270;
          c.height=340;
          
          System.out.println(a.width);
          System.out.println(a.height);
          System.out.println(a.type);
          System.out.println(a.no);
	}

}
