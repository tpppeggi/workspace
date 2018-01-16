package exam;

public class Bubble {

	public static void main(String[] args) {
		int[] numbers = { 45, 81, 9, 72, 4, 6 };
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
