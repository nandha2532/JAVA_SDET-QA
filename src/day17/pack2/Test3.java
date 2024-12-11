package day17.pack2;

import day17.pack1.Test1;

public class Test3 extends Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Test1 t1 = new Test1();
////		System.out.println(t1.y);	//The field Test1.y is not visible
//		System.out.println(t1.a);
//		
//		t1.m1(); //without importing the package it will show error
		
		Test3 t3 = new Test3();
		System.out.println(t3.a); //protected -- using inheritance
		
	}

}
