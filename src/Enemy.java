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
    
    public Enemy(int width, int height, int speed, int x, int y){
        super(width,height,speed,x,y);
        character = new JButton("Enemy");
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
