package clean_code.complex_tasks.url;

import org.apache.commons.codec.digest.DigestUtils;

public class HashStrategy implements ShorteningStrategy {

    @Override
    public String shortenUrl(String url) {
        String hex = DigestUtils.sha256Hex(url);
        return "https://fake.ly/" + hex.substring(0, 10);
    }
}
