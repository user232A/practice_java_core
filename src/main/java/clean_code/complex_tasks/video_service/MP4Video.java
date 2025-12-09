package clean_code.complex_tasks.video_service;

public class MP4Video extends Video {

    public MP4Video(VideoFormat format, String name, String duration, String path) {
        super(name, format, duration, path);
    }

    public MP4Video(Video video) {
        super(video);
    }
}
