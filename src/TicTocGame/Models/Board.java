package TicTocGame.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int Dimension;
    private List<List<Cell>> board;
    public Board(int Dimension){
        this.Dimension = Dimension;
        this.board = new ArrayList<>();

        for (int i =0;i<Dimension;i++){
            board.add(new ArrayList<>());

            for (int j=0;j<Dimension;j++){
                board.get(i).add(new Cell(i,j));
            }

        }
    }

    public int getDimension() {
        return Dimension;
    }

    public void setDimension(int dimension) {
        Dimension = dimension;
    }

    public List<List<Cell>> getCell() {
        return board;
    }

    public void setCell(List<List<Cell>> cell) {
        this.board = cell;
    }

    public void Printboard(){

        for (List<Cell> rows : getCell()){
            for (Cell col : rows){
                col.display();
            }
            System.out.println();
        }
    }
}
