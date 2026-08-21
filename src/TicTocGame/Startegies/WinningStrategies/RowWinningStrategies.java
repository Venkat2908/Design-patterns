package TicTocGame.Startegies.WinningStrategies;

import TicTocGame.Models.Board;
import TicTocGame.Models.Move;
import TicTocGame.Models.Symbol;

import java.util.HashMap;

public class RowWinningStrategies implements WinningStrategies {

    HashMap<Integer,HashMap<Symbol,Integer>> rowcheck = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol sym = move.getPlayer().getSymbol();

        if (!rowcheck.containsKey(row)){
            if
            
        }
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
