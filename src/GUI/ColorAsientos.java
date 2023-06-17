package GUI;
import javax.swing.JToggleButton;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author Santiago
 */
public class ColorAsientos extends JToggleButton {
    public void paintComponent(Graphics g){
    
    Color bg;
    if(isSelected()){
        bg = Color.decode("#E34D2D");
    }else {
        bg = Color.decode("#B9E7BD");
    } 
    setBackground(bg);    
    super.paintComponent(g);    
    }
    
}
