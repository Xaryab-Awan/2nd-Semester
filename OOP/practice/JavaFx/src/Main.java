import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setTitle("FirstOne");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(true);
//        frame.setSize(500,500);
//        frame.setVisible(true);
//        ImageIcon image = new ImageIcon(Main.class.getResource("/2.png"));
//        frame.setIconImage(image.getImage());
////        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
////        frame.getContentPane().setBackground(new Color(100,23,53));
//        frame.getContentPane().setBackground(new Color(0xFFFFFF));
//        MyFrame frame=new MyFrame();
//
//
//        ImageIcon image =new ImageIcon("image.png");
//        Border border=BorderFactory.createLineBorder(Color.green,3);
//
//        JLabel label =new JLabel();
//        label.setText("Xaryab");
//
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setVerticalTextPosition(JLabel.TOP);
//        label.setForeground(Color.green);
//        label.setFont(new Font("MV Boli",Font.PLAIN,20));
//        label.setIconTextGap(-25);
//        label.setBackground(Color.BLACK);
//        label.setOpaque(true);
//        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0,0 ,350,350 );
//
//            JFrame frame =new JFrame();
//            frame.setVisible(true);
//            frame.setSize(500,500);
//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            frame.add(label);
////            frame.pack();
//        frame.setLayout(null);


            ImageIcon icon =new ImageIcon("image.png");
            JLabel label=new JLabel();
            label.setText("HelloWorld");
            label.setIcon(icon);
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setHorizontalTextPosition(JLabel.CENTER);


            JPanel red_panel=new JPanel();
            red_panel.setBackground(Color.red);
            red_panel.setBounds(0,0,250,250);

            JPanel blue_panel=new JPanel();
            blue_panel.setBackground(Color.blue);
            blue_panel.setBounds(250,0,250,250);

            JPanel green_panel=new JPanel();
             green_panel.setBackground(Color.green);
            green_panel.setBounds(0,250,500,250);



            JFrame frame=new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(750,750);
            frame.setLayout(null);
            red_panel.add(label);
            frame.add(red_panel);
            frame.add(blue_panel);
            frame.add(green_panel);









    }
}