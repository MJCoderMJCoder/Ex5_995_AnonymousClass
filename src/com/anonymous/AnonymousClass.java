package com.anonymous;

abstract class Student3 {
	abstract void speak();	//抽象方法；抽象类不能直接创建实例对象
}

class Teacher2 {
	void look(Student3 s) {
		s.speak();
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		Teacher2 zhang = new Teacher2();
		
		//Java允许把类体与对象的创建组合在一起。
		//也就是说，类创建对象时，除了构造方法还有类体，此类体被称为匿名类
		Student3 liu = new Student3() {
			//重写抽象方法
			void speak() {
				System.out.println("这是匿名类中的方法");
				
			}
		};	//匿名类结束
		
		zhang.look(liu);

	}

}
