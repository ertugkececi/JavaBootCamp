package perfectNumber;

public class Main {

	public static void main(String[] args) {
		int number = 6;
		int totalRemainder = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				totalRemainder += i;
			}
		}

		if (totalRemainder == number) {
			System.out.println("Tihs number is perfect number: " + number);
		} else {
			System.out.println("Tihs number is not perfect number: " + number);
		}
	}

}
