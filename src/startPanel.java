
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
public class startPanel extends JPanel{
  JButton startButton;
    
    public startPanel(){
        startButton = new JButton("Start");
        add(startButton);
    }
}
