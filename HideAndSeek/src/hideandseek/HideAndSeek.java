/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import model.Player;
import model.Tool;

/**
 *
 * @author Lauren
 */
public class HideAndSeek {
    public static void teamTest(){
       Player username = new Player();
    
       username.setUsername("Hirendira");

       String playerInfo = username.toString();
       System.out.println(playerInfo); 
    }
    
    public static void irhenTest(){
            Tool hammer = new Tool();
            hammer.setName("Hammer");
            hammer.setType("toolbox");
            String toolInfo = hammer.toString();
            System.out.println(toolInfo);
            
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            teamTest();
            irhenTest();
    }
    
}
