package Assignments.Strategy.Assignment2;

public class LowAdjustment implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supporttype() {
        return VideoQuality.LOW;
    }

    @Override
    public Video adjust(Video video) {
         video.setCodec(VideoCodec.H264);
         video.setBitrate(500);
         return  video;
    }
}
