package Task5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("alice", "pass1234");
        users.put("bob", "12345");
        users.put("charlie", "supersecure");
        users.put("diana", "qwerty");
        users.put("eva", "secure99");

        System.out.println("Users with password longer than 6 symbols:");
        for (Map.Entry<String, String> entry : users.entrySet())
            if (entry.getValue().length() > 6)
                System.out.println("Name: " + entry.getKey() + ", password: " + entry.getValue());
    }
}

