package Assignments.Strategy.Assignment2;

public class Videomanager {

    private  QualityAdjustmentStrategy qualityAdjustmentStrategy;
    private VideoQuality videoQuality;

    public Videomanager(){

    }

    public void setVideoQuality(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    public Video createvideo (Video video){

        QualityAdjustmentStrategy v1 = VideomanagerFactory.createfactory(video.getVideoQuality());

         return v1.adjust(video);
    }
}
