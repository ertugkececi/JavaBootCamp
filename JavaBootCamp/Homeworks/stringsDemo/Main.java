package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Weather is beautiful today.";
		System.out.println(message);
		
//		System.out.println("Char count : " + message.length());
//		System.out.println("5.char in string is : " + message.charAt(4));
//		System.out.println(message.concat(" Great!!!"));
//		System.out.println(message.startsWith("W"));
//		System.out.println(message.endsWith("."));
//		char[] characters = new char[7];
//		message.getChars(0, 7, characters, 0);
//		System.out.println(characters);
//		System.out.println(message.indexOf("at"));
//		System.out.println(message.lastIndexOf("a"));
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(6, 10));
		
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
