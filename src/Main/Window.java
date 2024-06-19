
package Main;

import java.awt.Color;
import java.awt.GridLayout;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.WindowConstants.*;

/**
 *
 * @author Elbob
 */
public class Window extends JFrame {
    GamePanel game;
    
    
    public Window (){
        game = new GamePanel();
        
        
        this.setTitle("Puzzle");
        
        try {
            this.setIconImage(ImageIO.read(this.getClass().getResource("/Tools/images/sleep.png")));
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, "icon app not found");
         }
        this.setSize(800, 540);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(game);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}