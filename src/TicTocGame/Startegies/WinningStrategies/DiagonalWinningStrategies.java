package TicTocGame.Startegies.WinningStrategies;

import TicTocGame.Models.Board;
import TicTocGame.Models.Move;
import TicTocGame.Models.Symbol;

import java.util.HashMap;

public class DiagonalWinningStrategies implements WinningStrategies {

    HashMap<Symbol,Integer> diagcheck= new HashMap<>();
    HashMap<Symbol,Integer> rightdiag = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if ((row==col) ){
            if (!diagcheck.containsKey(symbol)){
                diagcheck.put(symbol,0);
            }else {
                diagcheck.put(symbol,diagcheck.get(symbol)+1);
            }
            if (diagcheck.get(symbol)==board.getDimension()){
                return  true;
            }
        }

       if  (row+col ==board.getDimension()-1){
           if (!rightdiag.containsKey(symbol)){
               rightdiag.put(symbol,0);
           }else {
               rightdiag.put(symbol,rightdiag.get(symbol)+1);
           }
           if (rightdiag.get(symbol)==board.getDimension()){
               return  true;
           }

       }


        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
