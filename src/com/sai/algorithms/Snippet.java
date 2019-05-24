package com.sai.algorithms;

public class Snippet extends parent {
	
	static void check(){
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		parent p = new Snippet();
	}
	
	/*int test(){
		
		try{
			System.out.println("try");
			return 1;
		}catch(Exception e){
			System.out.println("catch");
			return 2;
		}finally{
			System.exit(0);
			System.out.println("finally");
			return 3;
		}
		
	}*/
}
class parent{
	static void test(){
		System.out.println("out");
	}
}

