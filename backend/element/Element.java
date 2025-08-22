/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.backend.element;

import game.backend.move.Direction;

public abstract class Element {
    
    public abstract boolean isMovable();
    public abstract String getKey();
    
    public String getFullKey(){
        return getKey();
    }
    
    public boolean isSolid(){
        return true;
    }
    
    public Direction[] explode(){
        return null;
    }
    
    public long getScore(){
        return 0;
    }
}
