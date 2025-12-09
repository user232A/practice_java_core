package clean_code.complex_tasks.url;

import java.util.HashMap;
import java.util.Map;

public class MemoryStorage implements UrlStorage {

    private static MemoryStorage memory;
    private Map<String, String> memoryStorage;

    private MemoryStorage() {
        memoryStorage = new HashMap<>();
    }

    public static MemoryStorage getInstance() {
        if (memory == null) {
            memory = new MemoryStorage();
        }
        return memory;
    }

    @Override
    public void addLinks(String shortUrl, String url) {
        System.out.println("Adding url to memory storage");
        memoryStorage.put(shortUrl, url);
    }

    @Override
    public Map<String, String> getStorage() {
        return memoryStorage;
    }
}
