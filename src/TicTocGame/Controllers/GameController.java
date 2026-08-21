package TicTocGame.Controllers;

import TicTocGame.Exceptions.InvalidBotException;
import TicTocGame.Exceptions.InvalidInputException;
import TicTocGame.Exceptions.InvalidPlayerException;
import TicTocGame.Exceptions.InvalidSymbolException;
import TicTocGame.Models.Game;
import TicTocGame.Models.Player;
import TicTocGame.Startegies.WinningStrategies.WinningStrategies;

import java.util.List;

public class GameController {

    public Game startgame(int dimension, List<Player> players, List<WinningStrategies> winningStrategies)
            throws InvalidPlayerException,
            InvalidBotException, InvalidSymbolException {

        Game game = Game.getbuilder().setDimensions(dimension).setPlayers(players)
                .setWinningStrategies(winningStrategies).build();

        return game;
    }

    public void MakeMove(Game game) throws InvalidInputException {
        game.makeMove();

    }

    public  void PrintBoard (Game game){
        game.Printgame();

    }

    public void undo(Game game){


    }

    public void GetWinner(Game game){
        game.getWinner();

    }
}
