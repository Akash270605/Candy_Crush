/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.frontend;

import game.frontend.gui.MainFrame;
import java.io.IOException;

public class GameApp {
    public static void main(String args[]) throws IOException{
        MainFrame mF = new MainFrame();
        mF.setVisible(true);
        
        Sound musiq = new Sound("src/game/resources/sounds/candy_crush.wav");
    }
}
