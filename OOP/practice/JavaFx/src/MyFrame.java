import javax.swing.*;
import java.awt.*;

public class MyFrame extends Frame {
    MyFrame(){
        this.setTitle("FirstOne");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500,500);
        this.setVisible(true);
        ImageIcon image = new ImageIcon(Main.class.getResource("/2.png"));
        this.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//        frame.getContentPane().setBackground(new Color(100,23,53));
//        this.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}
