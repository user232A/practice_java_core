package clean_code.complex_tasks.url;

public class HashFactory extends ShortenerFactory {

    @Override
    ShorteningStrategy createStrategy() {
        return new HashStrategy();
    }
}
