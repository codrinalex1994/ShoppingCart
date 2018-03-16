import java.util.HashMap;
import java.util.Map;



public class ShopCart {
	private Map<Product, Integer> products;



	public ShopCart() {
		this.products = new HashMap<Product, Integer>();
	}



	public void addProduct(Shop shop, int id, int quantity) {
		Product product = shop.get(id);

		for(Product element : this.products.keySet()) {
			if(element.getId() == product.getId() && element.equals(product) == false) {
				throw new RuntimeException("products have the same id, but are different");
			}
			if(element.getId() != product.getId() && element.equals(product) == true) {
				throw new RuntimeException("products are the same, but have different ids");
			}
		}

		if(product.getQuantity() < quantity) {
			throw new RuntimeException("too many products " + product.getName() + " added to cart");
		}
		product.setQuantity(product.getQuantity() - quantity);

		if(this.products.keySet().contains(product)) {
			quantity += this.products.get(product);
		}

		this.products.put(product, quantity);
	}

	public void removeProduct(int id, int quantity) {
		Product product = this.getProduct(id);

		if(this.products.keySet().contains(product)) {
			int currQuanity = this.products.get(product);
			if(quantity > currQuantity) {
				throw new RuntimeException("cannot remove this many products");
			}

			quantity = this.products.get(product) - quantity;
			product.setQuantity(product.getQuantity() + quantity);
			if(quantity <= 0) {
				this.products.remove(product);
			}
		}
	}

	public void removeProduct(int id) {
		Product product = this.getProduct(id);
		this.products.remove(product);
	}



	public boolean contains(int id) {
		try {
			this.getProduct(id);
		}
		catch(Exception e) {
			return false;
		}

		return true;
	}

	public boolean contains(Product product) {
		return this.products.keySet().contains(product);
	}



	public double getTotalPrice() {
		double price = 0;

		for(Product product : this.products.keySet()) {
			price += this.getProductTotalPrice(product);
		}

		return price;
	}

	public Product[] getProducts() {
		return this.products.keySet().toArray(new Product[this.products.size()]);
	}

	public Product getProduct(int id) {
		for(Product product : this.products.keySet()) {
			if(product.getId() == id) {
				return product;
			}
		}

		throw new RuntimeException("no product with id " + id + " found in shop cart");
	}

	public double getProductTotalPrice(int id) {
		 return this.getProductTotalPrice(this.getProduct(id));
	}

	public int getProductQuantity(int id) {
		return this.getProductQuantity(this.getProduct(id));
	}



	private double getProductTotalPrice(Product product) {
		if(this.products.keySet().contains(product) == false) {
			throw new RuntimeException("product not found");
		}

		int quantity = this.products.get(product);
		double price = product.getPrice() * quantity;

		if(quantity >= 10) {
			price -= price * 3 / 5;
		}
		else if(quantity >= 5) {
			price -= price / 5;
		}

		return price;
	}

	private int getProductQuantity(Product product) {
		return this.products.get(product);
	}
}
