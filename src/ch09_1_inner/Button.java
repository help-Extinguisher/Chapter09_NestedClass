package ch09_1_inner;

public class Button {
	// 417페이지부터
	OnClickListener listener;
	
	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void thuch() {
		listener.onClick();
	}
	
	static interface OnClickListner {
		void onClick();
	}

}
