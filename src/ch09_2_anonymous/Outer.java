package ch09_2_anonymous;

public class Outer {
	int num = 0;
	class Memver {
		// �޼ҵ�
		void add(int n) {
			num += n;
		}
		int getNum() {
			return num;
		}
	}

}
