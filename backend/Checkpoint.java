/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.backend;

/**
 *
 * @author Leveno
 */
public enum Checkpoint {
    U(-1, 0, 1),
    UU(-2, 0, 2),
    D(1, 0, 4),
    DD(2, 0, 8),
    R(0, 1, 16),
    RR(0, 2, 32),
    L(0, -1, 64),
    LL(0, -2, 128);
    
    private int i;
    private int j;
    private int value;
    
    private Checkpoint(int i, int j, int value){
        this.i = i;
        this.j = j;
        this.value = value;
    }
    
    public int getI(){
        return i;
    }
    
    public int getJ(){
        return j;
    }
    
    public int getValue(){
        return value;
    }
}
