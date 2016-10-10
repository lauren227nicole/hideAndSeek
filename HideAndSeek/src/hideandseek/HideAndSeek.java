/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import model.Player;

/**
 *
 * @author Lauren
 */
public class HideAndSeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player username = new Player();
    
       username.setUsername("Hirendira");

       String playerInfo = username.toString();
       System.out.println(playerInfo);
    }
    
}
