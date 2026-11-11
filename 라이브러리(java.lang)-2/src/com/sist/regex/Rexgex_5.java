package com.sist.regex;
/*
 * 
 *  [A-Z] [a-z] [A-Za-z]
 *  [가-힣] 
 *  [0-9]
 *  [A-Za-z가-힣0-9]
 *  
*/
public class Rexgex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("a".matches("[a-z]"));
System.out.println("A".matches("[a-z]"));
System.out.println("코데디".matches("^코[가-힣]*"));
System.out.println("dog".matches("dog|cat|pig"));
System.out.println("gif".matches("gif|png|jpg"));
System.out.println("yes".matches("y(es)?"));
System.out.println("abcabc".matches("(abc)+"));
System.out.println("abc".matches("(abc)*"));
System.out.println("hahahe".matches("(ha)+he"));
System.out.println("aabb".matches("(a+b+)+"));
System.out.println("123123".matches("(\\d+)+"));
System.out.println("12313144".matches("([0-9]+)+"));
System.out.println("a1b2c3".matches("(\\w\\d)+"));
System.out.println("a1b2c3".matches("([a-z][0-9])+"));
System.out.println(" ".matches("\\s"));
System.out.println("1 2".matches("\\d\\s\\d"));
System.out.println("a 1".matches("\\w\\s\\d"));

System.out.println("1+2".matches("\\d\\+\\d"));
System.out.println("a\\b".matches("\\w\\\\\\w"));
System.out.println("c++".matches("\\w\\++"));
System.out.println("^abc$".matches("\\^(abc)\\$"));
// \\? \\|
	}

}
