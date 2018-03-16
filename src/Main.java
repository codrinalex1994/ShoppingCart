package lab3;



public class Main {

	public static void main(String[] args) {
		ShopCart cart = new ShopCart();
		Product p1 = new Product(0, "apple", "abc", 5, "1.1.1001", 15);
		Product p2 = new Product(1, "orange", "xyz", 6, "1.1.2013", 1);
		Product p3 = new Product(0, "lemon", "abc", 5, "1.1.1001", 15);
		
		cart.addProduct(p1, 6);
		cart.addProduct(p2, 1);
		System.out.println(cart.getTotalPrice() + " " + cart.getProductTotalPrice(p1.getId()) + " " 
													  + cart.getProductTotalPrice(p2.getId()));
		
		cart.addProduct(p1, 5);
		System.out.println(cart.getTotalPrice() + " " + cart.getProductTotalPrice(p1.getId()) + " " 
													  + cart.getProductTotalPrice(p2.getId()));
		
		cart.removeProduct(p2.getId(), 1);
		System.out.println(cart.getTotalPrice() + " " + cart.getProductTotalPrice(p1.getId()));
		
		// Must throw errors
//		System.out.println(cart.getProductTotalPrice(p2.getId()));
//		cart.removeProduct(p2.getId(), 100);
//		cart.addProduct(p2, 2);
//		cart.addProduct(p3, 5);
	}

}
