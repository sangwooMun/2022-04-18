package co.test;

import java.util.InputMismatchException;
import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
public class Exam5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exam4[] exam = new Exam4[2];

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회(이름) 5.종료");
			System.out.println("선택 : ");
			int menu = -1;
			try {
				menu = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("번호를 입력하세요.");
			}
			scanner.nextLine();

			if (menu == 1) {
				for (int i = 0; i < exam.length; i++) {
					System.out.println("추가할 학생 이름 : ");
					String name = scanner.nextLine();
					System.out.println("추가할 학생 생일 : ");
					int tan = scanner.nextInt();
					scanner.nextLine();
					System.out.println("추가할 학생 번호 : ");
					String phone = scanner.nextLine();
					Exam4 exams = new Exam4(name, tan, phone);
					exam[i] = exams;
				}
			} else if (menu == 2) {
				System.out.println("번호를 수정할 사람의 이름을 적어주세요 : ");
				String name = scanner.nextLine();
				System.out.println("바꿀 전화번호를 입력하세요 : ");
				String phone = scanner.nextLine();

				for (int i = 0; i < exam.length; i++) {
					if (exam[i].getName().equals(name)) {
						exam[i].setPhone(phone);
					}
				}
			} else if (menu == 3) {
				System.out.println("조회할 이름을 입력하세요 :");
				String name = scanner.nextLine();
				for (int i = 0; i < exam.length; i++) {
					if (exam[i].getName().equals(name)) {
						exam[i].showInfo();
					}
				}
			} else if (menu == 4) {
			} else if (menu == 5) {
			}

		}
//		System.out.println("end of prog.");
	}
}
