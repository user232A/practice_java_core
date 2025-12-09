package clean_code.complex_tasks.video_service;

public class VideoService {

    private Video video;
    private VideoAdapter adapter;

    public VideoService(Video video, VideoAdapter adapter) {
        this.video = video;
        this.adapter = adapter;
    }

    public void streamVideo() {
        System.out.println("Converting video " + video.getClass().getSimpleName() + " " + video.name);
        Video convertedVideo = adapter.convertVideo(video);
        convertedVideo.play();
    }
}
