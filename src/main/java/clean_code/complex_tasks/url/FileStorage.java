package clean_code.complex_tasks.url;

import java.util.HashMap;
import java.util.Map;

public class FileStorage implements UrlStorage {

    private static FileStorage file;
    Map<String, String> fileStorage;

    private FileStorage() {
        fileStorage = new HashMap<>();
    }

    public static FileStorage getInstance() {
        if (file == null) {
            file = new FileStorage();
        }
        return file;
    }

    @Override
    public void addLinks(String shortUrl, String url) {
        System.out.println("Adding url to file storage");
        fileStorage.put(shortUrl, url);
    }

    @Override
    public Map<String, String> getStorage() {
        return fileStorage;
    }
}
