/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.wallyson.tetris;

/**
 *
 * @author wally
 */
public enum Direction {
    UP(0, -1),
    RIGHT(1, 0),
    DOWN(0, 1),
    LEFT(-1, 0);
    
    int x, y;
    
    Direction( int x, int y ) {
        this.x = x;
        this.y = y;
    }
    
    public Direction prev() {
        int nextIndex = ordinal() - 1;
        
        if ( nextIndex == -1 ) {
            nextIndex = Direction.values().length - 1;
        }
        
        return Direction.values()[nextIndex];
    }
    
    public Direction next() {
        int nextIndex = ordinal() + 1;
        
        if ( nextIndex == Direction.values().length ) {
            nextIndex = 0;
        }
        
        return Direction.values()[nextIndex];
    }
}
