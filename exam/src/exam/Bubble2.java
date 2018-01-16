package exam;

public class Bubble2 {
	public static void main(String[] args) {
		int[] numbers = { 6, 5, 2, 8, 1, 9, 13, 4, 11, 7 };
		int i, j;
		for (i = 0; i < numbers.length - 1; i++) {
			for (j = 0; j < numbers.length - 1; j++) {
				if (numbers[j + 1] > numbers[j]) {
					int tump = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tump;
				}
			}
		}
		for (i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
