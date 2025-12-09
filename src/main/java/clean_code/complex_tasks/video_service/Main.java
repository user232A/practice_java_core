package clean_code.complex_tasks.video_service;

public class Main {
    public static void main(String[] args) {

        VideoService service = new VideoService(new MovVideo(VideoFormat.MOV, "clip1", "25",
                "/home/user/example"), new MovVideoAdapter());

        service.streamVideo();
    }
}
