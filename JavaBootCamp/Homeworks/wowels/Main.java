package wowels;

public class Main {

	public static void main(String[] args) {
		char character = 'E';
		
		switch (character) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bold wowel");
			break;

		default:
			System.out.println("Thin wowel");
			break;
		}
	}
}
