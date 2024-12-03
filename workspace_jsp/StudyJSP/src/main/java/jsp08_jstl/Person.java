package jsp08_jstl;


public class Person {
	// 멤버변수 정의(외부에서 변수값을 변경 불가능하도록 접근제한자 private 사용)
	private int idx;
	private String name;
	
	public Person(int idx, String name) {
		this.idx = idx;
		this.name = name;
	}
	
	// 멤버변수에 직접 접근하는 대신 값을 주고받을 수 있도록 Getter/Setter 메서드 정의
	// Alt + Shift + S -> R
	public int getIdx() {
		System.out.println("getIdx() 호출됨!!");
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		System.out.println("getName() 호출됨!!");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
