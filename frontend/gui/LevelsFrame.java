/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.frontend.gui;

import game.backend.CandyGame;
import game.backend.level.ClassicLevel;
import game.backend.level.CreamLevel;
import game.backend.level.JellyLevel;
import game.backend.level.VoidLevel;
import game.frontend.CandyFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class LevelsFrame extends JFrame{
    
    private MainFrame parent;
    private static final long serialVersionUID = 1L;
    
    LevelsFrame(MainFrame main) throws IOException{
        this.setParent(main);
        setBounds(0, 0, 1024, 580);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - this.getSize().width / 2, dim.height/ 2 - this.getSize().height / 2);
        
        BufferedImage icon = ImageIO.read(new File("src/game/resources/images/icon.png"));
        setIconImage(icon);
        
        setResizable(false);
        
        BufferedImage myImage = ImageIO.read(new File("src/game/resources/images/background_map.png"));
        setContentPane(new ImagePanel(myImage));
        
        BufferedImage imageOne = ImageIO.read(new File("src/game/resources/images/one.png"));
        ImagePanel panelOne = new ImagePanel(imageOne, this, new CandyGame(ClassicLevel.class));
        panelOne.setBounds(115, 395, 35, 35);
        
        add(panelOne);
        
        BufferedImage imageTwo = ImageIO.read(new File("src/game/resources/images/two.png"));
        ImagePanel panelTwo = new ImagePanel(imageTwo, this, new CandyGame(VoidLevel.class));
        panelTwo.setBounds(395, 400, 35, 35);
        add(panelTwo);
        
        BufferedImage imageThree = ImageIO.read(new File("src/game/resources/images/three.png"));
        ImagePanel panelThree = new ImagePanel(imageThree, this, new CandyGame(JellyLevel.class));
        panelThree.setBounds(680, 405, 35, 35);
        add(panelThree);
        
        BufferedImage imageFour = ImageIO.read(new File("src/game/resources/images/four.png"));
        ImagePanel panelFour = new ImagePanel(imageFour, this, new CandyGame(CreamLevel.class));
        panelFour.setBounds(915, 320, 35, 35);
        add(panelFour);
        
        BufferedImage imageFive = ImageIO.read(new File("src/game/resources/images/five.png"));
        ImagePanel panelFive = new ImagePanel(imageFive);
        panelFive.setBounds(895, 115, 35, 35);
        add(panelFive);
        
        panelFive.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                System.out.println("Click on 5");
            }
        });
    }
    
    public void createGame(CandyGame game){
        CandyFrame frame;
        try{
            frame = new CandyFrame(game);
            frame.setVisible(true);
            
            frame.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e){
                setVisible(true);
            }
            });
        }catch(IOException e1){
            e1.printStackTrace();
        }
    }
    
    public MainFrame getParent(){
        return parent;
    }
    
    private void setParent(MainFrame parent){
        this.parent = parent;
    }
}
