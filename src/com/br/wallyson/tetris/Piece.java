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
public class Piece {
        public int distance;
        public Direction direction;
        public Tetromino parent;
        public int x, y;
        
        public Piece(int distance, Direction direction) {
            this.distance = distance;
            this.direction = direction;
        }
        
        public Piece copy() {
            return new Piece(distance, direction);
        }
        
        public void setParent(Tetromino parent) {
            this.parent = parent;
            x = parent.x + distance * direction.x;
            y = parent.y + distance * direction.y;
        }
        
        public void setDirection(Direction direction) {
            this.direction = direction;
            x = parent.x + distance * direction.x;
            y = parent.y + distance * direction.y;
        }
    }