package clean_code.complex_tasks.url;

import java.util.Base64;

public class Base64Strategy implements ShorteningStrategy {

    @Override
    public String shortenUrl(String url) {
        String encoded = Base64.getUrlEncoder().withoutPadding().encodeToString(url.getBytes());
        return "https://fake.ly/" + encoded.substring(0, 10);
    }
}
