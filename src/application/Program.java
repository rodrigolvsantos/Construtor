package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Enter product data: ");
	
	System.out.print ("Name: ");
	String name = sc.nextLine();
	System.out.print("Price: ");
	double price = sc.nextDouble();
	
	//Instanciando o método constrtutor!!
	Product product = new Product(name, price);
	
	System.out.println();
	System.out.println("Product data: ");

	System.out.println();

	
	System .out.println();
	System.out.println("Updata data: " + product);
	
	System.out.println();
	System.out.print("Enter the number of product to be removed from stock: ");
	int quantity = sc.nextInt();
	product.removeproducts(quantity);
	
	System.out.println();
	System.out.print("Udate data: " + product);
	
	sc.close();
	
}
}
