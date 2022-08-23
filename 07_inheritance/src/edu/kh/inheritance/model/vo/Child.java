package edu.kh.inheritance.model.vo;

public class Child extends Parent {
//The type Child cannot subclass the final class Parent
	
	@Override
	public void method1() {
		// Cannot override the final method from Parent
		// Parent의 파이널 매서드를 오버라이드 할 수 없다
		System.out.println("자식의 메서드");
	}
}
