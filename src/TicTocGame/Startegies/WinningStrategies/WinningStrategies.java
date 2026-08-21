package TicTocGame.Startegies.WinningStrategies;

import TicTocGame.Models.Board;
import TicTocGame.Models.Move;

public interface WinningStrategies {
    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
