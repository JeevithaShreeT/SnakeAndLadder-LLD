
package com.mycompany.snakeandladder;

import java.util.HashMap;
import java.util.Map;


public class Board {
    
    Map<Integer, Integer> map = new HashMap<>();
    
    public void addSnake(int start, int end){
        map.put(start, end);
    }
    
    public void addLadder(int start, int end){
        map.put(start, end);
    }
    
    public int getNewPosition(int position){
        
        if(map.containsKey(position)){
            position = map.get(position);
        }
        
        return position;
    }
}
