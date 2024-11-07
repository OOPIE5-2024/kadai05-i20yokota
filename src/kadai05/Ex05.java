package kadai05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Ex05 {

  private JFrame frame;
  private JPanel ColorPanel;
  SuperCurrentColor crrntBckColor = new SuperCurrentColor();
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex05 window = new Ex05();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex05() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanel = new JPanel();
    frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
    
    JButton btnRed = new JButton("red");
    btnRed.setForeground(new Color(255, 38, 0));
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeRed();  //赤色を変更
        crrntBckColor.setPanel(ColorPanel);
      }
    });
    btnPanel.add(btnRed);
    
    JButton btnGreen = new JButton("green");
    btnGreen.setForeground(new Color(0, 249, 0));
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeGreen();  //緑色を変更
        crrntBckColor.setPanel(ColorPanel);
      }
    });
    btnPanel.add(btnGreen);
    
    JButton btnBlue = new JButton("blue");
    btnBlue.setForeground(new Color(4, 50, 255));
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeBlue();  //青色を変更
        crrntBckColor.setPanel(ColorPanel);
      }
    });
    btnPanel.add(btnBlue);
    
    ColorPanel = new JPanel();
    ColorPanel.setBackground(new Color(0, 0, 0));
    frame.getContentPane().add(ColorPanel, BorderLayout.CENTER);
  }

}
