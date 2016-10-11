/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import model.Bomb;
import model.Player;
import model.Tool;

/**
 *
 * @author Lauren
 */
public class HideAndSeek {

    public static void laurenTest() {
        System.out.println("beginning laurenTest");

    }

    /**
     * @param args the command line arguments
     */

    public static void teamTest() {
        System.out.println("beginning teamTest");
        Player username = new Player();

        username.setUsername("Hirendira");

        String playerInfo = username.toString();
        System.out.println(playerInfo);
    }

    public static void irhenTest() {
        System.out.println("beginning irhenTest");
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
        laurenTest();
    }

}
