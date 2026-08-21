package TicTocGame.Startegies.BotStrategies;

import TicTocGame.Models.Board;
import TicTocGame.Models.Cell;
import TicTocGame.Models.CellState;
import TicTocGame.Models.Move;

import java.util.List;

public class EasyWinningStartegy implements Botstrategies {
    @Override
    public Move makemove(Board board) {
        for (List<Cell> row : board.getCell()){
            for (Cell col : row){

                if (col.getCellState().equals(CellState.EMPTY)){
                    return  new Move(null,col);
                }
            }
        }
        return  null;
    }
}
