package Assignments.Strategy.Assignment2;

public   class  VideomanagerFactory {

    public static QualityAdjustmentStrategy createfactory (VideoQuality videoQuality){
            return   switch (videoQuality){
                    case LOW -> new LowAdjustment();
                    case MEDIUM -> new MeduimAdjustment();
                    case HIGH -> new HighAdjustment();
        };
    }
}
