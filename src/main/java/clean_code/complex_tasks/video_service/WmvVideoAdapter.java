package clean_code.complex_tasks.video_service;

public class WmvVideoAdapter extends VideoAdapter {

    @Override
    Video createVideo(Video video) {
        return new WmvVideo(video);
    }
}
