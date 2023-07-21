package app;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task02 {

    public static void main(String[] args) {
        Map<String, Integer> products = createProductList();
        String productListOutput = getProductListOutput(products);
        getOutput(productListOutput);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a product name to search:");
        String name = scanner.nextLine().trim();

        int quantity = searchProduct(products, name);
        String searchResultOutput = getSearchResultOutput(name, quantity);
        getOutput(searchResultOutput);
    }

    public static Map<String, Integer> createProductList() {
        Map<String, Integer> products = new HashMap<>();
        products.put("cheese", 12);
        products.put("cucumber", 7);
        products.put("lemon", 3);
        products.put("carrot", 18);
        products.put("potato", 25);
        return products;
    }
    public static int searchProduct(Map<String, Integer> products, String name) {
        return products.getOrDefault(name, -1);
    }

    public static String getProductListOutput(Map<String, Integer> products) {
        StringBuilder output = new StringBuilder("Product list:\n");
        int counter = 1;

        for (String product : products.keySet()) {
            output.append(counter++).append(") ").append(product).append("\n");
        }
        return output.toString();
    }

    public static String getSearchResultOutput(String name, int quantity) {
        StringBuilder output = new StringBuilder();
        if (quantity == -1) {
            output.append("Sorry, we don't have ").append(name).append(" in stock.");
        } else {
            output.append("We have ").append(name).append(", ").append(quantity).append(" kg in stock.");
        }
        return output.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}