package clean_code.complex_tasks.url;

abstract class ShortenerFactory {

    abstract ShorteningStrategy createStrategy();

    public String convertToShortUrl(String url) {
        ShorteningStrategy strategy = createStrategy();
        return strategy.shortenUrl(url);
    }
}
