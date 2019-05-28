package com.anonymous;

abstract class Student3 {
	abstract void speak();	//���󷽷��������಻��ֱ�Ӵ���ʵ������
}

class Teacher2 {
	void look(Student3 s) {
		s.speak();
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		Teacher2 zhang = new Teacher2();
		
		//Java��������������Ĵ��������һ��
		//Ҳ����˵���ഴ������ʱ�����˹��췽���������壬�����屻��Ϊ������
		Student3 liu = new Student3() {
			//��д���󷽷�
			void speak() {
				System.out.println("�����������еķ���");
				
			}
		};	//���������
		
		zhang.look(liu);

	}

}
