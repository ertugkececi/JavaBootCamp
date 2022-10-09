package oop1;

public class Main {

	public static void main(String[] args) {
		//String message = "Vade oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Ertuğ");
		individualCustomer.setLastName("Keçeci");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0544444444");
		corporateCustomer.setCustomerNumber("23456");
		corporateCustomer.setCompanyName("Kececi Software Solutions");
		corporateCustomer.setTaxNumber("35445874135");
		
		Customer[] customers = {individualCustomer, corporateCustomer};

	}

}
