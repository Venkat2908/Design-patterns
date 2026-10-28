package Assignments.Strategy.Assignment2;

public class HighAdjustment implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supporttype() {
        return VideoQuality.HIGH;
    }

    @Override
    public Video adjust(Video video) {
        video.setBitrate(2000);
        video.setCodec(VideoCodec.VP9);
        return video;
    }
}
