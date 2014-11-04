import javax.swing.JButton;

public class Projectile {
    JButton projectile;
    boolean direction;
    String typeOfProjectile;
    int speedOfProjectile;
    
    public Projectile(boolean d, String tp){
        projectile = new JButton();
        direction = d;
        typeOfProjectile = tp;
        speedOfProjectile = 10;
    }
    
}
