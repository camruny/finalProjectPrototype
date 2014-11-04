/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cameron
 */
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Enemy extends Character{
    
    public Enemy(){
       
        character = new JButton("Enemy");
        speed = 0;
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
}
