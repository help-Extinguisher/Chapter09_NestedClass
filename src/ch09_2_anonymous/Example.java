package ch09_2_anonymous;

class Animal {
	void sound() { System.out.println("~"); }
	
}

//class Dog extends Animal {
//	@Override
//	void sound() { System.out.println("¸Û¸Û!"); }
//	void run () { System.out.println("È£´Ù´Ú~!"); }
//		
//	
//}

class Cat extends Animal {
	@Override
	void sound() { System.out.println("¿Ö¿Ä"); }
	void jump () { System.out.println("Ä¹Å¸¿ö·Î ¿Ã¶ó°©´Ï´Ù"); }
	
}

class Fish extends Animal {
	@Override
	void sound() { System.out.println("»µ²û»µ²û"); }
	void swim () { System.out.println("Çì¾öÇì¾ö~!"); }
	
}

	
	
	
public class Example {
	public static void main(String[] args) {
		Animal ani = new Animal() { 
			void run () { System.out.println("È£´Ù´Ú~!"); }
			@Override
			void sound() {
				System.out.println("¸Û¸Û!!");
			}
			
			
		};  
		
	}

}
