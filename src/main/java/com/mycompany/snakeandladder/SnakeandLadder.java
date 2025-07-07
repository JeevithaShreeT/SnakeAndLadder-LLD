

package com.mycompany.snakeandladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SnakeandLadder {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        
        int s = sc.nextInt();
        for(int i=0; i<s; i++){
            board.addSnake(sc.nextInt(), sc.nextInt());
        }
        
        int l = sc.nextInt();
        for(int i=0; i<l; i++){
            board.addLadder(sc.nextInt(), sc.nextInt());
        }
        
        int p = sc.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0; i<p; i++){
            players.add(new Player(sc.next()));
        }
        
        Game game = new Game(players, board, new Dice());
        game.start();
    }
}
