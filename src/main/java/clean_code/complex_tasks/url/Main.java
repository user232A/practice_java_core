package clean_code.complex_tasks.url;

public class Main {
    public static void main(String[] args) {

        UrlShortenerService service1 = new UrlShortenerService(MemoryStorage.getInstance(), new Base64Factory());

        String transformed = service1.transformUrl("https://www.google.com/search?q=gismeteo&oq=gis&" +
                "gs_lcrp=EgZjaHJvbWUqDQgBEAAYsQMYyQMYgAQyBggAEEUYQTINCAEQABixAxjJAxiABDIKCAIQABiSAxiA");
        System.out.println(transformed);
        System.out.println();

        UrlShortenerService service2 = new UrlShortenerService(FileStorage.getInstance(), new HashFactory());
        String transformedUrl = service2.transformUrl("https://www.example.com/catalog/products/electronics/smartphones/" +
                "brand/samsung/model/galaxy_s21_ultra/specifications/camera_zoom_100x_f1.8_wide_telephoto_android_12");
        System.out.println(transformedUrl);
        System.out.println();

        System.out.println("Restored link: " + service1.restoreUrl(transformed));
        System.out.println("Restored link: " + service2.restoreUrl(transformedUrl));
    }
}
