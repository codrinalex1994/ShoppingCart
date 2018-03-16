import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> list = new ArrayList<>();

    public Shop() {
    }

    public Shop(List<Product> list) {
        this.list = list;
    }

    public void addProduct(Product product) {
        list.add(product);
    }

	public Product[] getProducts() {
		return this.list.toArray(new Product[this.list.size()]);
	}

    public Product getProductByName(String name) {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product get(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
