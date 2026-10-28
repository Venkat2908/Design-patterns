package TicTocGame;

import TicTocGame.Controllers.GameController;
import TicTocGame.Exceptions.InvalidBotException;
import TicTocGame.Exceptions.InvalidInputException;
import TicTocGame.Exceptions.InvalidPlayerException;
import TicTocGame.Exceptions.InvalidSymbolException;
import TicTocGame.Models.*;
import TicTocGame.Startegies.WinningStrategies.ColumnWinningStrategies;
import TicTocGame.Startegies.WinningStrategies.DiagonalWinningStrategies;
import TicTocGame.Startegies.WinningStrategies.RowWinningStrategies;
import TicTocGame.Startegies.WinningStrategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tictocgame {
    public  static  void main (String [] args) throws InvalidPlayerException, InvalidBotException, InvalidSymbolException, InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player( 1,"venkat", new Symbol('X'), PlayerType.HUMAN));
        players.add(new Bot( 2,"Raman", new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY));

        List<WinningStrategies> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategies());
        winningStrategies.add(new ColumnWinningStrategies());
        winningStrategies.add(new DiagonalWinningStrategies());

        GameController gameController = new GameController();
        Game game = gameController.startgame(dimension, players, winningStrategies);

        while(game.getGameState().equals(GameState.INPROGRESS)) {

            // Print the board
            // Make the move

            gameController.PrintBoard(game);

            System.out.println("If you want to undo? Enter y/n");
            String undo = scanner.next();

            if(undo.equalsIgnoreCase("y")) {
                gameController.undo(game);
                continue;
            }

            gameController.MakeMove(game);
        }

        gameController.PrintBoard(game);


        // Make a check of game state
        // If the game is a draw, print message accordingly
        System.out.println(gameController.GetWinner(game).getName());

    }

    }


