package friendNumbers;

public class Main {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		
		int totalRemainder1 = 0;
		int totalRemainder2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				totalRemainder1 += i;
			}
		}
		
		for (int j = 1; j < number2; j++) {
			if(number2 % j == 0) {
				totalRemainder2 += j;
			}
		}
		System.out.println(totalRemainder1 + " - " + totalRemainder2);
		if (number1 == totalRemainder2 && number2 == totalRemainder1) {
			System.out.println("Theese numbers are friend numbers: " + number1 + " - " + number2);
		} else {
			System.out.println("Theese numbers are not friend numbers: " + number1 + " - " + number2);
		}

	}

}
