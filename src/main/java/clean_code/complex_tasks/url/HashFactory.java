package clean_code.complex_tasks.url;

public class HashFactory extends ShortenerFactory {

    private final ShorteningStrategy strategy = new HashStrategy();

    @Override
    ShorteningStrategy createStrategy() {
        return strategy;
    }
}
