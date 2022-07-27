package com.pradnya.java.acessspecifier;

public class Sample
{
	private void method1() 
	{
		System.out.println("private method");
	}
	protected void method2()
	{
		System.out.println("protected method");
	}
	void method3()
	{
		System.out.println("default method");
		
	}
	public void method4()
	{
		System.out.println("public method");
		
	}
	public static void main(String []args)
	{
		Sample p=new Sample();
		p.method1();
		p.method2();
		p.method3();
		p.method4();
		
	}
}


