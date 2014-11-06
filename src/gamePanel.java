
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class gamePanel extends JPanel implements ActionListener {
    startPanel stp;
    Character char1 = new Character();
    
    
    public gamePanel(){
        super();
        setLayout(new BorderLayout());
        stp = new startPanel();
        this.add(stp, "North");
        stp.startButton.addActionListener(this);
       
    }
    
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if (obj==stp.startButton)   {
            char1.character = new JButton("Character");
            add(char1.character);
            
        }
    }
}
