import java.awt.BorderLayout;
import javax.swing.JPanel;

public class gamePanel extends JPanel {
    startPanel stp;
    Player p1;
    
    public gamePanel(){
        
        setLayout(null);
        stp = new startPanel();
        stp.add(stp.startButton);
        
        p1 = new Player(5,5,10,50,50);
        p1.character.setBounds(300,480,50,50);
        add(p1.character);
        add(stp);
    }
}
