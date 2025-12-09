package clean_code.complex_tasks.url;

import java.util.HashMap;
import java.util.Map;

public class DBStorage implements UrlStorage {

    private static DBStorage dbStorage;
    private Map<String, String> dataBaseStorage;

    private DBStorage() {
        dataBaseStorage = new HashMap<>();
    }

    public static DBStorage getInstance() {
        if (dbStorage == null) {
            dbStorage = new DBStorage();
        }
        return dbStorage;
    }

    @Override
    public void addLinks(String shortUrl, String url) {
        System.out.println("Adding url to data base storage");
        dataBaseStorage.put(shortUrl, url);
    }

    @Override
    public Map<String, String> getStorage() {
        return dataBaseStorage;
    }
}
