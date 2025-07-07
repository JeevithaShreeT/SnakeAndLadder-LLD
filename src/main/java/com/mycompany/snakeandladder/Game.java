
package com.mycompany.snakeandladder;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Game {
         
   private Queue<Player> players;
   private Board board;
   private Dice dice;
   
   Game(List<Player> players, Board board, Dice dice){
       this.players = new LinkedList<>(players);
       this.board = board;
       this.dice = dice;
   }
   
   public void start(){
       
       while(true){
       Player currentplay = players.poll();
       int roll = dice.roll();
       int oldpos = currentplay.getPosition();
       int tempnewpos = oldpos+roll;
       int newpos;
       
       if(tempnewpos <= 100){
          newpos = board.getNewPosition(tempnewpos);
       }
       else{
           newpos = oldpos;
       }
       
       currentplay.setPosition(newpos);
       
       System.out.println(currentplay.getName()+" rolled a "+roll+" and moved from "+oldpos+" "+newpos);
       
       if(newpos == 100){
           System.out.println(currentplay.getName()+" wins the game");
           break;
       }
       
       players.add(currentplay);
       }
   }
    
}
