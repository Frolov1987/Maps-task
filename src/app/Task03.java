package app;
import java.util.LinkedHashMap;
import java.util.Map;


public class Task03 {

    public static void main(String[] args) {
        String title = "Initial contacts:";
        getOutput(formatData(title, getInitData()));

        title = "Updated contacts:";
        getOutput(formatData(title, addData(getInitData())));
    }

    private static Map<String, String> getInitData() {
        Map<String, String> contacts = new LinkedHashMap<>();
        contacts.put("Tom", "tom@mail.com");
        contacts.put("Lisa", "lisa@mail.com");
        contacts.put("Alice", "alisa@mail.com");
        contacts.put("Denis", "den@mail.com");
        return contacts;
    }

    private static Map<String, String> addData(Map<String, String> contacts) {
        contacts.put("Tom", "tomasdev@glob.net");
        return contacts;
    }

    private static String formatData(String title, Map<String, String> contacts) {
        StringBuilder builder = new StringBuilder(title).append("\n");
        int counter = 1;
        for (String name : contacts.keySet()) {
            String email = contacts.get(name);
            builder.append(counter++).append(") ")
                    .append(name).append(" - ").append(email).append("\n");
        }
        return builder.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }

}