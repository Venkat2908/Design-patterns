package TicTocGame.Models;

import TicTocGame.Exceptions.InvalidBotException;

import TicTocGame.Exceptions.InvalidInputException;
import TicTocGame.Exceptions.InvalidPlayerException;
import TicTocGame.Exceptions.InvalidSymbolException;
import TicTocGame.Startegies.WinningStrategies.WinningStrategies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private  int nextplayermoveindex;
    private List<WinningStrategies> winningStrategies;

    private Game(int Dimension, List<Player> players, List<WinningStrategies> winningStrategies) {
        this.board =new Board(Dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.gameState = GameState.INPROGRESS;
        this.winner = null;
        this.nextplayermoveindex = 0;
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextplayermoveindex() {
        return nextplayermoveindex;
    }

    public void setNextplayermoveindex(int nextplayermoveindex) {
        this.nextplayermoveindex = nextplayermoveindex;
    }

    public List<WinningStrategies> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategies> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void Printgame (){
        board.Printboard();
    }

    public void makeMove() throws InvalidInputException {

        Player currentplayer = players.get(nextplayermoveindex);

        System.out.println("Current player name "+currentplayer.getName());

        Move move = currentplayer.makemove(board);

     int row=   move.validateinput(move.getCell().getRow(),board);
       int col= move.validateinput(move.getCell().getCol(),board);

       Cell celltochange  = board.getCell().get(row).get(col);
       celltochange.setCellState(CellState.FILLED);
       celltochange.setPlayer(currentplayer);

       Move finalmoveobject = new Move(currentplayer,celltochange);
       moves.add(finalmoveobject);
       nextplayermoveindex+=1;
       nextplayermoveindex %=players.size();

       if (checkwinner(finalmoveobject)){
           winner = currentplayer;
           gameState =GameState.ENDED;
       }else{
           gameState = GameState.DRAW;
       }


    }

    public boolean checkwinner(Move move){

        for (WinningStrategies winningStrategies1:winningStrategies){
            if (winningStrategies1.checkWinner(board,move)){
                return  true;
            }
            else{
                return  false;
            }
        }

    }



    public static Builder getbuilder(){
        return  new Builder();
    }

    public static   class Builder{
        private int Dimensions;
        private  List<Player> players;
        List<WinningStrategies> winningStrategies;

        public Builder setDimensions(int dimensions) {
            Dimensions = dimensions;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return  this;
        }

        public Builder setWinningStrategies(List<WinningStrategies> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return  this;
        }

        public void playerCount () throws InvalidPlayerException{
            if (players.size()!=Dimensions-1){
                throw  new InvalidPlayerException("the Count of players is incorrect");
            }
        }


        public  void botvalidation() throws InvalidBotException{
            int botcount  =0;

            for (Player player : players){
                if (player.equals(PlayerType.BOT)){
                    botcount+=1;
                }
            }

            if (botcount> 1){
                throw new InvalidBotException("invalid bot exception");
            }
        }

        public void ValidateSymbol()throws InvalidSymbolException{
            HashSet<Symbol> hs = new HashSet<>();
            for (Player player:players){
                if (hs.contains(player.getSymbol())){
                    throw new InvalidSymbolException("Symbol has been already acquired by other player");
                }
                else{
                    hs.add(player.getSymbol());
                }
            }
        }

        public  void validate() throws InvalidBotException,InvalidSymbolException,InvalidPlayerException{
            ValidateSymbol();
            botvalidation();
            playerCount();
        }


        public Game build() throws InvalidBotException,InvalidSymbolException,InvalidPlayerException{
            validate();

            return  new Game(Dimensions,players,winningStrategies);
        }
    }
}
