package clean_code.complex_tasks.video_service;

public class AviVideoAdapter implements VideoAdapter {

    @Override
    public Video convertVideo(Video video) {
        Video convertedVideo = null;
        if (!(video.format.toString().equals("MP4"))) {
            convertedVideo = new AviVideo(video);
            convertedVideo.setFormat(VideoFormat.MP4);
        }
        return convertedVideo;
    }
}
