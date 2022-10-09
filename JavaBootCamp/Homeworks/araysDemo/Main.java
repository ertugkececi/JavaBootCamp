package araysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ertug";
		String ogrenci2 = "Cansu";
		String ogrenci3 = "Melih";
		String ogrenci4 = "Cavit";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------");
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ertug";
		ogrenciler[1] = "Cansu";
		ogrenciler[2] = "Melih";
		ogrenciler[3] = "Safure";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----  foreach -----");
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
