
import java.awt.BorderLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cameron
 */
public class gamePanel extends JPanel {
    startPanel stp;
    
    public gamePanel(){
        
        setLayout(new BorderLayout());
        stp = new startPanel();
        stp.add(stp.startButton);
        this.add(stp, "North");
    }
}
