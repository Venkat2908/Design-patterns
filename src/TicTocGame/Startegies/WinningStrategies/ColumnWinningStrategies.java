package TicTocGame.Startegies.WinningStrategies;

import TicTocGame.Models.Board;
import TicTocGame.Models.Move;
import TicTocGame.Models.Symbol;

import java.util.HashMap;

public class ColumnWinningStrategies implements WinningStrategies {

    HashMap<Integer,HashMap<Symbol,Integer>> colcount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int col = move.getCell().getCol();

        if (!colcount.containsKey(col)){
            colcount.put(col,new HashMap<>());
        }

        Symbol symbol = move.getPlayer().getSymbol();
        HashMap<Symbol,Integer> colsym = colcount.get(col);

        if (!colsym.containsKey(symbol)){
            colsym.put(symbol,0);
        }else{
            colsym.put(symbol,colsym.get(symbol));
        }

        if (colsym.get(symbol)== board.getDimension()){
            return  true;
        }
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
