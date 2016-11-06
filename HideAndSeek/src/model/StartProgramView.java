/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fairy_000
 */
public class StartProgramView {

    private final String promptMessage;
   
    public StartProgramView() {
        String string1 = "Welcome to Hide and Seek";
        String string2 = "This game is about to find the Bombs and the Villian and save the village ";
        
        this.promptMessage = "Please enter your name: ";
       // System.out.print("Player Name:! ");      
        this.displayBanner();  
    }

    private void displayBanner() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print("This game is about *"
                + " * to find the Bombs and the *"
                + " *Villian and save the village *");

    }
    
    public static void main(String[] args){
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
 

    }

    private void displayStartProgramView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
