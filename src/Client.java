import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ShopCart cart = new ShopCart();
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("List items\nList cart\nAdd product\nRemove product\n");
        Shop shop = new Shop();
        shop.addProduct(new Product(0, "apple", "abc", 5, "1.1.1001", 15));
        shop.saveShop();
        shop.setShop();
        while(true){
            input = scan.nextLine();
            if(input.equals("List items")){
                System.out.println(shop.getProducts());
            }
            else
            if(input.equals("Add product")){
                System.out.println("Choose product id and quantity.");
                Integer id=scan.nextInt();
                Integer quantity=scan.nextInt();
                cart.addProduct(shop,id,quantity);
            }
            else if(input.equals("List cart")){
                System.out.println(cart.getProducts());
            }
            else if(input.equals("Remove product")){
                System.out.println("Choose product id and quantity.");
                Integer id=scan.nextInt();
                Integer quantity=scan.nextInt();
                cart.removeProduct(id,quantity);
            }
        }
    }
}
