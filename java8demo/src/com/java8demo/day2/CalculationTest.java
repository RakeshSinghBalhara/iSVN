package com.java8demo.day2;

@FunctionalInterface
public interface CalculationTest {

	void sayHello();
//	void sayHello2();

	default void display() {
		System.out.println("Hi from display method");
	}

	static void display2() {
		System.out.println("Hi from display method");
	}
}

class CalDemo implements CalculationTest {
	@Override
	public void sayHello() {
		System.out.println("Hello from my class");
	}
}

class SumDemo implements Sum {
	@Override
	public int sum(int a, int b) {
		return a + b;
	}
}

class MainTest {
	public static void main(String[] args) {
		CalculationTest c = new CalDemo();
		c.sayHello();

		CalculationTest c2 = new CalculationTest() {
			@Override
			public void sayHello() {
				System.out.println("Hi from anonymuos function");
			}
		};
	}
}

class LambdaDemo {
	public static void main(String[] args) {
		System.out.println("Hi from LambdaDemo");
		CalculationTest c = () -> System.out.println("Hello from my class");
		c.sayHello();

//		Sum s = (int a, int b) -> {return a+b;};
//		Sum s = ( a,  b) -> {return a+b;};
		Sum s = (a, b) -> a + b;
		System.out.println("sum of two no is " + s.sum(10, 20));

		Sum s1 = new SumDemo();
		System.out.println(s1.sum(22, 20));

//		Sum2 s2 = new Sum2() {
//			@Override
//			public int sum2(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
//	}
//
//	Sum s3 = new Sum() {
//		@Override
//		public int sum(int a, int b) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};
	}
}

@FunctionalInterface
//interface Sum extends Sum2{
interface Sum {
	int sum(int a, int b);
}

interface Sum2 {
	int sum2(int a, int b);
}
