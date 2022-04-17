package co.test;

import java.util.Scanner;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	Scanner scanner = new Scanner(System.in);
	
	String name;
	int tan;
	String phone;
	
	public Exam4(String name, int tan, String phone) {
		super();
		this.name = name;
		this.tan = tan;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTan() {
		return tan;
	}

	public void setTan(int tan) {
		this.tan = tan;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	void showInfo() {
		System.out.printf("이름 : %4s \n생일 : %4d\n 전화번호 : %2s \n", name, tan, phone );
	}
	
	
}
