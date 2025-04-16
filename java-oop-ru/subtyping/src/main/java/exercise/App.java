package exercise;


import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Set<String> keys = storage.toMap().keySet();
        keys.forEach(key -> {
            String value = storage.get(key,"");
            storage.unset(key);
            storage.set(value, key);
        });
    }
}
// END
