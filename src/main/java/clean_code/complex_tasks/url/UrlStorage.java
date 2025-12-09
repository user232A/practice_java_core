package clean_code.complex_tasks.url;

import java.util.Map;

public interface UrlStorage {
    void addLinks(String shortUrl, String url);

    Map<String, String> getStorage();
}
