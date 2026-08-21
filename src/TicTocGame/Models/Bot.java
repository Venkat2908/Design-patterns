package TicTocGame.Models;

import TicTocGame.Factory.BotFactoryStrategy;
import TicTocGame.Startegies.BotStrategies.Botstrategies;

public class Bot extends Player {
   private BotDifficultyLevel botDifficultyLevel;
   private Botstrategies botstrategies;


   public Bot(int id, String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
      super(id, name, symbol, playerType);
      this.botDifficultyLevel = botDifficultyLevel;
      this.botstrategies = BotFactoryStrategy.createfactory(botDifficultyLevel);
   }
   public BotDifficultyLevel getBotDifficultyLevel() {
      return botDifficultyLevel;
   }

   public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
      this.botDifficultyLevel = botDifficultyLevel;
   }

   public Botstrategies getBotstrategies() {
      return botstrategies;
   }

   public void setBotstrategies(Botstrategies botstrategies) {
      this.botstrategies = botstrategies;
   }

   public Move makemove(Board board) {
      Move move = botstrategies.makemove(board);
      move.setPlayer(this);
      return  move;

   }

}
