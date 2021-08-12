package ch09_2_anonymous;

class Animal {
	void sound() { System.out.println("~"); }
	
}

//class Dog extends Animal {
//	@Override
//	void sound() { System.out.println("�۸�!"); }
//	void run () { System.out.println("ȣ�ٴ�~!"); }
//		
//	
//}

class Cat extends Animal {
	@Override
	void sound() { System.out.println("�ֿ�"); }
	void jump () { System.out.println("ĹŸ���� �ö󰩴ϴ�"); }
	
}

class Fish extends Animal {
	@Override
	void sound() { System.out.println("��������"); }
	void swim () { System.out.println("������~!"); }
	
}

	
	
	
public class Example {
	public static void main(String[] args) {
		Animal ani = new Animal() { 
			void run () { System.out.println("ȣ�ٴ�~!"); }
			@Override
			void sound() {
				System.out.println("�۸�!!");
			}
			
			
		};  
		
	}

}
