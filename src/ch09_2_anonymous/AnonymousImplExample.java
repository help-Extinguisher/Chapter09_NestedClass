package ch09_2_anonymous;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

class AnonymousImpl {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("Tv �� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("Tv �� ���ϴ�");
		}
	};
	
	void method1 () {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�");
				
			}
		};
		
		
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}



public class AnonymousImplExample {
	public static void main(String[] args) {
		AnonymousImpl anony = new AnonymousImpl();
		
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTv�� �մϴ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTv�� ���ϴ�");
			}	
		});
		
	}

}
