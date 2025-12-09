package clean_code.complex_tasks.video_service;

public class MovVideo extends Video {

    public MovVideo(VideoFormat format, String name, String duration, String path) {
        super(name, format, duration, path);
    }

    public MovVideo(Video video) {
        super(video);
    }
}
