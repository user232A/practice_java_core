package clean_code.complex_tasks.video_service;

abstract class VideoAdapter {
    abstract Video createVideo(Video video);

    Video convertVideo(Video video){
        Video convertedVideo = null;
        if (!(video.format.toString().equals("MP4"))) {
            convertedVideo = createVideo(video);
            convertedVideo.setFormat(VideoFormat.MP4);
        }
        return convertedVideo;
    }
}
