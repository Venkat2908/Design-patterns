package TicTocGame.Factory;

import TicTocGame.Models.BotDifficultyLevel;
import TicTocGame.Startegies.BotStrategies.Botstrategies;
import TicTocGame.Startegies.BotStrategies.EasyWinningStartegy;
import TicTocGame.Startegies.BotStrategies.HardWinningstrategy;
import TicTocGame.Startegies.BotStrategies.MediumWinningStrategy;

public  class BotFactoryStrategy {
    public static Botstrategies createfactory(BotDifficultyLevel botDifficultyLevel){
         return switch (botDifficultyLevel){
            case EASY -> new EasyWinningStartegy();
            case MEDIUM ->  new MediumWinningStrategy();
            case HARD ->  new HardWinningstrategy();
        };
    }
}
