/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Akka
 */
public class ImageTest {
    public static void main(String[] args) {
    ImagePanel panel = new ImagePanel(new ImageIcon("water.jpg").getImage());

    JFrame frame = new JFrame();
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}

class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    this.setPreferredSize(size);
    this.setMinimumSize(size);
    this.setMaximumSize(size);
    this.setSize(size);
    this.setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}