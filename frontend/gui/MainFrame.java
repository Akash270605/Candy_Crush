/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.frontend.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    private static final long serialVersionUID = 1L;
    
    public MainFrame() throws IOException{
        setBounds(0, 0, 1024, 580);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        BufferedImage icon = ImageIO.read(new File("src/game/resources/images/icon.png"));
        setIconImage(icon);
        
        setResizable(false);
        
        BufferedImage myImage = ImageIO.read(new File("src/game/resources/images/background_intro.png"));
        setContentPane(new ImagePanel(myImage));
        
        PlayButton playButton = new PlayButton(this);
        add(playButton);
        
        try{
            
        }catch(IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
    public void play() throws IOException{
        LevelsFrame levelsFrame = new LevelsFrame(this);
        levelsFrame.setVisible(true);
        levelsFrame.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e){
            setVisible(true);
        }
        });
    }
}
