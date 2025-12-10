package clean_code.complex_tasks.video_service;

public class MovVideoAdapter extends VideoAdapter {

    @Override
    Video createVideo(Video video) {
        return new MovVideo(video);
    }
}
