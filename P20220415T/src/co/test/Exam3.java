package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] ary = new int[10];
		int sum = 0;
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			num = sum / array.length;
			if (array[i] > 5) {
				ary[i] = array[i];
				System.out.println(ary[i]);
			}
		}
		System.out.println("평균 " + num);
	}
}
