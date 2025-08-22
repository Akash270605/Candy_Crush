/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.frontend;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Sound {
    private Clip clip;
    private String soundFile;
    
    public Sound(String soundFilePath){
        this.soundFile = soundFilePath;
        try{
            File file = new File(soundFile);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            //Loop forever
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException e){
            e.printStackTrace();
        }
    }
    
    public void stopSound(){
        if(clip != null && clip.isRunning()){
            clip.stop();
        }
    }
}
