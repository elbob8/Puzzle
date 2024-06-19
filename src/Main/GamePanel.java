
package Main;

import Tools.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Elbob
 */
public final class GamePanel extends JPanel {
    private JButton button[] = new JButton[9];
    private final MyButton button_start,button_exit;
    private final JPanel Ppanel,Spanel;
    private final JLabel label1;
    private int Score = 0;
    
    public GamePanel(){
        
            this.setSize(800, 500);
            this.setLayout(new GridLayout(1,2));
            
            Ppanel = new JPanel();
            Ppanel.setLayout(new GridLayout(3,3));
            Ppanel.setBackground(Color.WHITE);
            
            Spanel = new JPanel();
            Spanel.setLayout(null);
            Spanel.setBackground(Color.BLACK);
            
            label1 = new JLabel("Total Clicks : " + Score);
            label1.setForeground(Color.WHITE);
            label1.setFont(new Font("Ink Free",Font.BOLD,20));
            label1.setBounds(100, 110, 180, 20);
            Spanel.add(label1);
            
            
            button_start = new MyButton("Play");
            button_start.setBounds(50, 200, 100, 30);
            button_start.setRadius(20);
            button_start.setToolTipText("Start!");
            button_start.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Start();
                }
            });
            Spanel.add(button_start,BorderLayout.CENTER);
            
            
            button_exit = new MyButton("Exit");
            button_exit.setBounds(200, 200, 100, 30);
            button_exit.setRadius(20);
            button_exit.setToolTipText("out in Game!");
            button_exit.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            Spanel.add(button_exit,BorderLayout.CENTER);
            
            this.add(Ppanel);
            this.add(Spanel);
            
            for(int x = 0; x < button.length; x++){
                button[x] = new JButton();
                button[x].setFont(new Font("Ink Free",Font.BOLD,50));
                button[x].setForeground(Color.WHITE);
                button[x].setBackground(Color.BLACK);
                button[x].setFocusable(false);
                button[x].setEnabled(false);
                Ppanel.add(button[x]);
            }
            
            button[0].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[1].getText().equals("")){
                        button[1].setText(button[0].getText());
                        button[0].setText("");
                    }
                    if(button[3].getText().equals("")){
                        button[3].setText(button[0].getText());
                        button[0].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[1].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[0].getText().equals("")){
                        button[0].setText(button[1].getText());
                        button[1].setText("");
                    }
                    if(button[2].getText().equals("")){
                        button[2].setText(button[1].getText());
                        button[1].setText("");
                    }
                    if(button[4].getText().equals("")){
                        button[4].setText(button[1].getText());
                        button[1].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[2].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[1].getText().equals("")){
                        button[1].setText(button[2].getText());
                        button[2].setText("");
                    }
                    if(button[5].getText().equals("")){
                        button[5].setText(button[2].getText());
                        button[2].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[3].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[0].getText().equals("")){
                        button[0].setText(button[3].getText());
                        button[3].setText("");
                    }
                    if(button[4].getText().equals("")){
                        button[4].setText(button[3].getText());
                        button[3].setText("");
                    }
                    if(button[6].getText().equals("")){
                        button[6].setText(button[3].getText());
                        button[3].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[4].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[1].getText().equals("")){
                        button[1].setText(button[4].getText());
                        button[4].setText("");
                    }
                    if(button[3].getText().equals("")){
                        button[3].setText(button[4].getText());
                        button[4].setText("");
                    }
                    if(button[5].getText().equals("")){
                        button[5].setText(button[4].getText());
                        button[4].setText("");
                    }
                    if(button[7].getText().equals("")){
                        button[7].setText(button[4].getText());
                        button[4].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[5].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[2].getText().equals("")){
                        button[2].setText(button[5].getText());
                        button[5].setText("");
                    }
                    if(button[4].getText().equals("")){
                        button[4].setText(button[5].getText());
                        button[5].setText("");
                    }
                    if(button[8].getText().equals("")){
                        button[8].setText(button[5].getText());
                        button[5].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[6].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[3].getText().equals("")){
                        button[3].setText(button[6].getText());
                        button[6].setText("");
                    }
                    if(button[7].getText().equals("")){
                        button[7].setText(button[6].getText());
                        button[6].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[7].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[4].getText().equals("")){
                        button[4].setText(button[7].getText());
                        button[7].setText("");
                    }
                    if(button[6].getText().equals("")){
                        button[6].setText(button[7].getText());
                        button[7].setText("");
                    }
                    if(button[8].getText().equals("")){
                        button[8].setText(button[7].getText());
                        button[7].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
            button[8].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button[5].getText().equals("")){
                        button[5].setText(button[8].getText());
                        button[8].setText("");
                    }
                    if(button[7].getText().equals("")){
                        button[7].setText(button[8].getText());
                        button[8].setText("");
                    }
                    Click();
                    CheckWin();
                }
            });
        
        
    }
    public void CheckWin(){
        if(button[0].getText().equals("1")&& button[1].getText().equals("2")&& button[2].getText().equals("3")&& button[3].getText().equals("4")&& button[4].getText().equals("5")&& button[5].getText().equals("6")&& button[6].getText().equals("7")&& button[7].getText().equals("8")&& button[8].getText().equals("")){           
            for(int x = 0; x < button.length; x++){
                    button[x].setText("Win");
                    button[x].setBackground(Color.GREEN);
                    button[x].setEnabled(false);
            }
            label1.setText("Total Clicks : " + Score);
            Score = 0;
        }
    }
    
    public void Click(){
        label1.setText("Total Clicks : " + (++Score));
    }
    
    public void Start(){
        
            button[0].setText("");
            button[1].setText("8");
            button[2].setText("7");
            button[3].setText("6");
            button[4].setText("2");
            button[5].setText("4");
            button[6].setText("1");
            button[7].setText("5");
            button[8].setText("3");
        
            Score = 0;
            label1.setText("Total Clicks : " + Score);
        
            for(int x = 0; x < button.length; x++){
                button[x].setEnabled(true);
                button[x].setForeground(Color.WHITE);
                button[x].setBackground(Color.BLACK);
            }
            
    }
    
}
