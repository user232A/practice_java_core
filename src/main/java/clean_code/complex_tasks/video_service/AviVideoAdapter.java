package clean_code.complex_tasks.video_service;

public class AviVideoAdapter extends VideoAdapter {

    @Override
    Video createVideo(Video video) {
        return new AviVideo(video);
    }
}
