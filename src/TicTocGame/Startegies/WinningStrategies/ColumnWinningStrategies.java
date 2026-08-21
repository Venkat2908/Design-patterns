package TicTocGame.Startegies.WinningStrategies;

import TicTocGame.Models.Board;
import TicTocGame.Models.Move;

public class ColumnWinningStrategies implements WinningStrategies {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
