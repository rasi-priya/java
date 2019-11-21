package com.hcl.generics;


class Data<T>{
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value" +a+ "B value" +b);
		}
}

public class GenDemo {
	public static void main(String[] args) {
		Data obj=new Data();
		int a=7,b=6;
		obj.swap(a, b);
		double a1=12.5,b1=5.7;
		obj.swap(a1,b1);
		String s1="bharath",s2="heamanth";
		obj.swap(s1, s2);
		boolean f1=true,f2=false;
		obj.swap(f1,f2);
		
		
		
		
	}
	

}
