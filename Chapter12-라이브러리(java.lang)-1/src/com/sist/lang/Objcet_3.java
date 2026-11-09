package com.sist.lang;
// 객체 비교 => equals : 오버라이딩전에는 메모리 주소값 비교 => 오버라이딩
class Human
{
	private String name,sex;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Human(String n,String s)
	{
		name=n;
		sex=s;
		//Human.n=n; => 클래스명으로 구분 / 인스턴스는 this로 구분
	}
	/*
	 *   변수
	 *   ----
	 *     지역변수(메소드안에 선언), 매개변수(사용자 요청값) 우선순위
	 *     static 변수
	 *     인스턴스 변수
	 *     ===> 충돌시에는 this. (구분자)
	 * 
	 * 
	*/

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Human) // 객체비교 연산자
	{
		Human s=(Human)obj;
		return name==s.name && sex==s.sex;
	}
	return false;
}
//String => ==(주소비교), equals (실제 문자열 비교)
}
public class Objcet_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human h1=new Human("홍길동","남자");
        Human h2=new Human("홍길동","남자");
        Human h3=h1;
        System.out.println("h1:"+h1);
        System.out.println("h2:"+h2);
       if(h1.equals(h2)) //주소
        {
          System.out.println(h1+"==="+h3);	
        }
        else
        {
          System.out.println(h1+"!="+h2);	
        }
        
	}
     // 문자열만 비교
	

}
