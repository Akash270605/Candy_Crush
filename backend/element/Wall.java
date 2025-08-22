/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.backend.element;

/**
 *
 * @author Leveno
 */
public class Wall extends Element{
    
    @Override
    public boolean isMovable(){
        return false;
    }
    
    @Override
    public String getKey(){
        return "WALL";
    }
}
