package com.sist.lang;

public class System_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String osName=System.getProperty("os.name");
    		System.out.println("OSNAme:"+osName);
    		String userName=System.getProperty("user.name");
    		System.out.println("UserName:"+userName);
    		String userHome=System.getProperty("user.home");
    		System.out.println("UserHome:"+userHome);
    		String java=System.getProperty("java.version");
    		System.out.println("Java:"+java);
	}

}
