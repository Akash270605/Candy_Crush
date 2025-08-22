/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.backend;

public abstract class GameState {
    private long score = 0;
    private int moves = 0;
    
    public void addScore(long value){
        this.score = this.score  + value;
    }
    
    public long getScore(){
        return score;
    }
    
    public void addMove(){
        moves++;
    }
    
    public int getMoves(){
        return moves;
    }
    
    public abstract boolean gameOver();
    public abstract boolean playerWon();
}
