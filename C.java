package com.JavaPractice.conditions;


class C{
	
	public static void m(Object o){
		if(o instanceof Double){
			System.out.println((Double)o*2);
		}
		else if (o instanceof String){
			System.out.println((Double.valueOf((String)o)/2));
		}
		else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String...abc){
		C.m(20.8);
		C.m("30.5");
		C.m('A');
	}
}

//Output:
41.6
15.25
//Invalid