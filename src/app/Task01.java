package app;
import  java.util.HashMap;
import java.util.Map;



public class Task01 {

    public static void main(String[] args) {
        Map<String, Integer> products = createProductList();

        String initialData = getFormattedData("Initial data:", products);
        System.out.println(initialData);

        updateProductList(products);

        String updatedData = getFormattedData("Updated data:", products);
        System.out.println(updatedData);
    }

    public static Map<String, Integer> createProductList() {
        Map<String, Integer> products = new HashMap<>();
        products.put("orange", 12);
        products.put("banana", 25);
        products.put("lemon", 8);
        products.put("pineapple", 13);
        products.put("grape", 9);
        return products;
    }

    public static void updateProductList(Map<String, Integer> products) {
        products.put("banana", 14);
        products.put("plum", 15);
    }

    public static String getFormattedData(String title, Map<String, Integer> products) {
        StringBuilder result = new StringBuilder(title + "\n");
        int counter = 1;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            result.append(counter++).append(") ")
                    .append(entry.getKey()).append(", ")
                    .append(entry.getValue()).append(" kg\n");
        }
        return result.toString();
    }
}