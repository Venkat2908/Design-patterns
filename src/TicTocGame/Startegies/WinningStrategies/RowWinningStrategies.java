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
            rowcheck.put(row,new HashMap<>());
        }
        HashMap<Symbol,Integer> rowmap = rowcheck.get(row);

        if (!rowmap.containsKey(sym)){
            rowmap.put(sym,0);
        }
        else{
            rowmap.put(sym, rowmap.get(sym)+1);
        }

        if (rowmap.get(sym)==(board.getDimension())){
            return  true;
        }

        return  false;

    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
