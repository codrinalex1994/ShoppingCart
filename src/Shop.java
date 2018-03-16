import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> list = new ArrayList<>();

    public Shop() {
    }

    public Shop(List<Product> list) {
        this.list = list;
    }

    public void addProduct(Product...products) {
        for(Product product : products) {
            list.add(product);
        }
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

    public void saveShop() {
        try {
            FileOutputStream fos = new FileOutputStream("myshop.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void setShop() {
        List<Product> arraylist= new ArrayList<>();
    try {
        FileInputStream fis = new FileInputStream("myshop.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        arraylist = (ArrayList) ois.readObject();
        ois.close();
        fis.close();
    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    catch (ClassNotFoundException e){
        e.printStackTrace();
    }

        list = arraylist;
    }
}
