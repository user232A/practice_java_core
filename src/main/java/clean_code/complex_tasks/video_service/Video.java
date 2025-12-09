package clean_code.complex_tasks.video_service;

public class Video {

    protected String name;
    protected VideoFormat format;
    protected String duration;
    protected String path;

    public Video(String name, VideoFormat format, String duration, String path) {
        this.name = name;
        this.format = format;
        this.duration = duration;
        this.path = path;
    }

    public Video(Video video) {
        this.name = video.name;
        this.format = video.format;
        this.duration = video.duration;
        this.path = video.path;
    }

    public void setFormat(VideoFormat format) {
        this.format = format;
    }

    public void play() {
        System.out.println("Playing video " + this.name + " in format " + this.format.toString());
    }
}
