import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ShopCart cart = new ShopCart();
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("List items\nList cart\nAdd product\nRemove product\n");
        Shop shop = new Shop();
        while(true){
            input = scan.nextLine();
            if(input.equals("List items")){
                shop.getItems();
            }
            else
                if(input.equals("Add product")){
                    System.out.println("Choose product it and quantity.");
                    Integer id=scan.nextInt();
                    Integer quantity=scan.nextInt();
                    cart.addProduct(shop,id,quantity);
                }
        }
    }
}
