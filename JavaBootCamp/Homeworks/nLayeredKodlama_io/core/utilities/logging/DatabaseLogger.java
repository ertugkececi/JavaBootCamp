package nLayeredKodlama_io.core.utilities.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı : " + data);
		
	}

}