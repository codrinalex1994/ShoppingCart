import java.util.Scanner;

public class Administrator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        Int inputId;
        System.out.println("Add item\n Remove iteam\n Edit iteam");
        Shop shop = new Shop();
        while(true){

            input = scan.nextLine();
            if(input.equals("Add item")){
              System.out.println("Add id produs :");
                inputId = scan.nextInt();
                  shop.addProduct(inputId);
            }
            else
                if(input.equals("Remove item")){
                    System.out.println("Choose a iteam to remove.");
                    inputId = scan.nextId();
                    shop.removeProduct(inputId);
                }
              else
                  if(input.equals("Edit item")){
                    System.out.println("Choose a iteam to edit.");
                      inputId = scan.nextInt();
                        shop.editProduct(inputId);
                  }

        }
    }
}
