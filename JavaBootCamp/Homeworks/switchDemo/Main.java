package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Excellent: Passed");
			break;
		case 'B':
		case 'C':
			System.out.println("Good Gaming: Passed");
			break;
		case 'D':
			System.out.println("Not Bad: Passed");
			break;
		case 'F':
			System.out.println("Not Enough: Fail");
			break;
		default:
			System.out.println("Invalid Exam Grade");
			break;
		}

	}

}
