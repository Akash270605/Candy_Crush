/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.backend.element;

/**
 *
 * @author Leveno
 */
public class Cream extends Element{
    
    @Override
    public boolean isMovable(){
        return false;
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
    
    @Override
    public String getKey(){
        return "CREAM";
    }
}
