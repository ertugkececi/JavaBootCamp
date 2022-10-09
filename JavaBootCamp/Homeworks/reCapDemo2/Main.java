package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2, 6.3, 4.3, 5.6};
		double total = 0;
		double maxNumber = myList[0];
		
		for (double number : myList) {
			if(maxNumber<number) {
				maxNumber=number;
			}
			total += number;
			System.out.println(number);
		}
		
		System.out.println(total);
		System.out.println("Biggest number is " + maxNumber);
		
		
	}

}
