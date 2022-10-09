package oopWithNLayeredApp;


import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "IPhone XR", 90);
		
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);

	}

}
