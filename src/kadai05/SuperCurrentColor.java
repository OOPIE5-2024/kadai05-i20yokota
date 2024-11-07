package kadai05;

import java.awt.Color;
import javax.swing.JPanel;

public class SuperCurrentColor {
  int red = 0;
  int green = 0;
  int blue = 0;
  int[] vals = {0,128,255};
  Color curColor = (new Color(red, green, blue));
  
  
  public void changeRed() {
      red = (++red)%3;
      
    updateColor();
    
  }
  public void changeGreen() {
    green = (++green)%3;
    updateColor();
    
  }
  public void changeBlue() {
    blue = (++blue)%3;
    updateColor();
  }
  
  
  void updateColor() {
    curColor = new Color(vals[red],vals[green],vals[blue]);
  }
  
  
  public void setPanel(JPanel p) {
    
    p.setBackground(curColor);
  }
  
}
