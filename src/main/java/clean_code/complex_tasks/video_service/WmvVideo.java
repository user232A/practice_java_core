package clean_code.complex_tasks.video_service;

public class WmvVideo extends Video {

    public WmvVideo(VideoFormat format, String name, String duration, String path) {
        super(name, format, duration, path);
    }

    public WmvVideo(Video video) {
        super(video);
    }
}
