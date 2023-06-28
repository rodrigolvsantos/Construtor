package entities;

public class Product {

	public String name;
		public double price;
		public int quantity;
		
		//Criando o  construtor dessa xana
		
	
		public Product(String nome, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		public Product(String nome, double price) {
			this.name = name;
			this.price = price;
			
		}

		public double totalValuesInStock() {
			return price * quantity;
		}
		
		public void addproduct (int quantity) {
			this.quantity  += quantity;
		}
		
		public void removeproducts (int quantity) {
			this.quantity -= quantity;
		}
		
		public String toString() {
			return name
			+ ", $ "
			+ String.format("%.2f", price)
			+", "
			+ quantity
			+" units, Total: $ "
			+ String.format("%.2f",totalValuesInStock());
			
		}
	}


