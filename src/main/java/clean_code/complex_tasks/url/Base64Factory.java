package clean_code.complex_tasks.url;

public class Base64Factory extends ShortenerFactory {

    @Override
    ShorteningStrategy createStrategy() {
        return new Base64Strategy();
    }
}
