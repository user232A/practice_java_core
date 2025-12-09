package clean_code.complex_tasks.video_service;

public class AviVideo extends Video {

    public AviVideo(VideoFormat format, String name, String duration, String path) {
        super(name, format, duration, path);
    }

    public AviVideo(Video video) {
        super(video);
    }
}
