package Assignments.Strategy.Assignment2;

public class MeduimAdjustment implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supporttype() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video adjust(Video video) {

        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);

        return video;
    }
}
