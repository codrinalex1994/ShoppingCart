
public class Main {

	public static void main(String[] args) {
		Shop shop = new Shop();
		Product p1 = new Product(0, "apple", "abc", 5, "1.1.1001", 15);
		Product p2 = new Product(1, "orange", "xyz", 6, "1.1.2013", 1);
		Product p3 = new Product(3, "lemon", "abc", 5, "1.1.1001", 15);


		shop.addProduct(p1,p2,p3);
		ShopCart cart = new ShopCart();

		cart.addProduct(shop,0,15);
		cart.addProduct(shop,1,1);
		cart.addProduct(shop,3,15);
	}

}
