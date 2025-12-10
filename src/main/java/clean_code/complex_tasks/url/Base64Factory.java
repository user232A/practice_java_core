package clean_code.complex_tasks.url;

public class Base64Factory extends ShortenerFactory {

    private final ShorteningStrategy strategy = new Base64Strategy();

    @Override
    ShorteningStrategy createStrategy() {
        return strategy;
    }
}
