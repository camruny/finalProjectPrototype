
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cameron
 */
public class Character 
{    
    JButton character;
    int width;
    int height;
    int speed;
    int x;
    int y;
    
    public Character(int width, int height, int speed, int x, int y)
    {
        //super();
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.x = x;
        this.y = y;
        character = new JButton();
    }
    
    public void fireProjectile(int speed, int width, int direction, Projectile p)
    {
        //Insert projectile firing code here
    }
    
    public void destroy()
    {
        //destroy character here
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getHeight()
    {
        return this.height;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public int getWidth()
    {
        return this.width;
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public int getSpeed()
    {
        return this.speed;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getY()
    {
        return this.y;
    }

}

