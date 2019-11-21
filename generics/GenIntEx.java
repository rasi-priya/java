package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class GenIntEx {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(56));
		num.add(new Integer(40));
		num.add(new Integer(78));
		num.add(new Integer(50));
		num.add(new Integer(34));
		int sum=0;
		for (Integer i : num) {
			sum+=i;
					
				}
		System.out.println("sum is" +sum);
	}

}
