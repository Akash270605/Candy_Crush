/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.backend;

import game.backend.element.Element;

public interface GameListener {
    public void gridUpdated();
    public void cellExplosion(Element e);
}
