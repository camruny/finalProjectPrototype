import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

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
