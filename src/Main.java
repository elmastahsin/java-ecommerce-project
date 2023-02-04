import category.Category;
import discount.Discount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{


        DataGenerator.createCustomer();

        DataGenerator.createCategory();

        DataGenerator.createProduct();

        DataGenerator.createBalance();

        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer: ");
        for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++) {
            System.out.println("Type " + i + " for customer: " + StaticConstants.CUSTOMER_LIST.get(i).getUsername());
        }

        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());
        while (true) {
            System.out.println("What would you like to do? Just type id for selection");

            for (int i = 0; i < prepareMenuOptions().length; i++) {
                System.out.println(i + "-" + prepareMenuOptions()[i]);
            }
            int menuSelection = scanner.nextInt();
switch (menuSelection){
    case 0:
        for (Category category : StaticConstants.CATEGORY_LIST) {
            System.out.println("Category code " +  category.generateCategoryCode()
                    + " category name" + category.getName());
        }
        break;
    case 1:
        try{
            for (Product product : StaticConstants.PRODUCT_LIST) {
                System.out.println("Product name " +  product.getName()
                        + " product category name " + product.getCategoryName());
            }
        }catch (Exception e){
            System.err.println("Product could not printed because category not found for product name: " + e.getMessage().split(",")[1]);
        }
        break;
    case 2:
        for (Discount discount : StaticConstants.DISCOUNT_LIST) {
            System.out.println("Discount Name: " + discount.getName() + " discount threshold amount " + discount.getThresholdAmount());
        }
        break;
    case 3:
        break;
    case 4:
        break;
    case 5:
        break;
    case 6:
        break;
    case 7:
        break;
    case 8:
        break;
    case 9:
        break;


}




        }


    }

    private static String[] prepareMenuOptions(){
        return new String[]{"List Categories","List Products","List Discount","See Balance","Add Balance","Place and Order","See Cart","See order Details","See your address","Close App"};

    }
}