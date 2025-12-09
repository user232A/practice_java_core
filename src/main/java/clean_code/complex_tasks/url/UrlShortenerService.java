package clean_code.complex_tasks.url;

public class UrlShortenerService {

    private UrlStorage storage;
    private ShortenerFactory factory;

    public UrlShortenerService(UrlStorage storage, ShortenerFactory factory) {
        this.storage = storage;
        this.factory = factory;
    }

    public String transformUrl(String url) {
        if (url == null) {
            throw new IllegalArgumentException("Invalid argument");
        }

        String replaced = url.trim().replaceAll("[\\s]+", "");

        System.out.println("Transform url by strategy " + factory.getClass().getSimpleName());
        String converted = factory.convertToShortUrl(replaced);
        storage.addLinks(converted, replaced);
        return converted;
    }

    public String restoreUrl(String url) {
        return storage.getStorage().get(url);
    }
}
