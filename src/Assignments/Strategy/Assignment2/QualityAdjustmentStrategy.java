package Assignments.Strategy.Assignment2;

public interface QualityAdjustmentStrategy {
    VideoQuality supporttype();
    Video adjust (Video video);
}
