package co.test.test2;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {

		int array[] = new int[10];
		int ary[] = new int[10];
		int sum = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * 10) + 1;
			array[i] = random;
			sum += array[i];
		}
		max = sum / array.length;
		System.out.println("평균값 " + max);
		for (int j = 0; j < ary.length; j++) {
			int random1 = (int) (Math.random() * 10) + 1;
			ary[j] = random1;
			if (ary[j] > max) {
				System.out.println("평균보다 큰 값 : " + ary[j]);
			}
		}
//		for (int j = 0; j < ary.length; j++) {
//			int random1 = (int) (Math.random() * 10) + 1;
//			if (random1 > max) {
//				ary[j] = random1;
//				System.out.println("평균보다 큰 값 : " + ary[j]);
//			}
//		}
	}
}
