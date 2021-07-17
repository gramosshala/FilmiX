/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilityEffects;

import javax.swing.JPanel;

/**
 *
 * @author Gramos
 */
public class PanelShakingEffect {
    
    private final static int TIME_SHAKINGLENGTH = 20; // e ndryshoj nashta me vone njeher qekjo po pershtatet
    private final static int POSITEMOVEBY = 5;
    
    public static void vibrate(JPanel jpanel) { 
    try { 
       int originalLocationX = jpanel.getLocation().x;
       int originalLocationY = jpanel.getLocation().y;
      for(int i = 0; i < TIME_SHAKINGLENGTH; i++) { 
        Thread.sleep(5); 
        jpanel.setLocation(originalLocationX, originalLocationY - POSITEMOVEBY); 
        Thread.sleep(5); 
        jpanel.setLocation(originalLocationX, originalLocationY + POSITEMOVEBY);
        Thread.sleep(5); 
        jpanel.setLocation(originalLocationX + POSITEMOVEBY, originalLocationY);
        Thread.sleep(5); 
        //normalizo frame  ne gjendjen fillestare.
        jpanel.setLocation(originalLocationX, originalLocationY);  
      } 
    } 
    catch (Exception err) { 
      err.printStackTrace(); 
    } 
  }
}
