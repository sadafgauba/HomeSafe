import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // JFrame = GUI window to add components to
        JFrame frame = new JFrame(); //creates a frame
        frame.setSize(1000, 600); //sets the x dimension and y
        frame.setTitle("Home Safe - Group 5 | Software Engineering UNM"); //Sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x exit out
        frame.setResizable(false); //prevent frame from resizing

        ImageIcon image = new ImageIcon("logoHS.png");
        frame.setIconImage(image.getImage()); // Change icon
        frame.getContentPane().setBackground(Color.white); //change color of background

        //BorderLayout
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        JPanel panel11 = new JPanel();

        panel1.setBackground(Color.cyan);
        panel2.setBackground(Color.white);
        panel3.setBackground(Color.white);
        panel4.setBackground(Color.white);
        panel5.setBackground(Color.white);
        panel6.setBackground(Color.white);
        panel7.setBackground(Color.white);
        panel8.setBackground(Color.LIGHT_GRAY);
        panel9.setBackground(Color.LIGHT_GRAY);
        panel10.setBackground(Color.cyan);
        panel11.setBackground(Color.cyan);

        panel1.setPreferredSize(new Dimension(600, 100));
        panel2.setPreferredSize(new Dimension(200, 200));
        panel3.setPreferredSize(new Dimension(200, 200));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(200, 200));
        panel6.setPreferredSize(new Dimension(600, 150));
        panel7.setPreferredSize(new Dimension(560, 230));
        panel8.setPreferredSize(new Dimension(600, 70));
        panel9.setPreferredSize(new Dimension(600, 70));
        panel10.setPreferredSize(new Dimension(60, 100));
        panel11.setPreferredSize(new Dimension(910, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel6.add(panel8, BorderLayout.NORTH);
        panel6.add(panel9, BorderLayout.SOUTH);

        //Title
        panel1.add(panel10, BorderLayout.EAST);
        panel1.add(panel11, BorderLayout.WEST);
        panel10.setLayout(new BorderLayout());
        panel11.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("iconHS.png");
        JLabel labelTitle = new JLabel(); //create label

        labelTitle.setText("  Home Safe - Group 05");
        labelTitle.setFont(new Font("Verdana", Font.BOLD, 20));
        labelTitle.setIcon(icon);
        labelTitle.setIconTextGap(25);
        panel11.add(labelTitle);
        labelTitle.setVerticalAlignment(JLabel.CENTER);
        labelTitle.setHorizontalAlignment(JLabel.LEFT);

        //KeyPad
        JButton button0 = new JButton("0");
        button0.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button1 = new JButton("1");
        button1.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button2 = new JButton("2");
        button2.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button3 = new JButton("3");
        button3.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button4 = new JButton("4");
        button4.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button5 = new JButton("5");
        button5.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button6 = new JButton("6");
        button6.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button7 = new JButton("7");
        button7.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button8 = new JButton("8");
        button8.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton button9 = new JButton("9");
        button9.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton buttonEnter = new JButton("Enter");
        buttonEnter.setFont((new Font("Arial", Font.BOLD, 15)));
        JButton buttonClear = new JButton("Clear");
        buttonClear.setFont((new Font("Arial", Font.BOLD, 15)));

        button1.setSize(new Dimension(10,10));
        button2.setSize(new Dimension(10,10));
        button3.setSize(new Dimension(10,10));
        button4.setSize(new Dimension(10,10));
        button5.setSize(new Dimension(10,10));
        button6.setSize(new Dimension(10,10));
        button7.setSize(new Dimension(10,10));
        button8.setSize(new Dimension(10,10));
        button9.setSize(new Dimension(10,10));
        button0.setSize(new Dimension(10,10));
        buttonEnter.setSize(new Dimension(10,10));
        buttonClear.setSize(new Dimension(10,10));

        panel7.setLayout(new GridLayout(3,4,5,5));

        panel7.add(button1);
        panel7.add(button2);
        panel7.add(button3);
        panel7.add(button0);
        panel7.add(button4);
        panel7.add(button5);
        panel7.add(button6);
        panel7.add(buttonEnter);
        panel7.add(button7);
        panel7.add(button8);
        panel7.add(button9);
        panel7.add(buttonClear);

        //  Display
        panel8.setLayout(new BorderLayout());
        panel9.setLayout(new BorderLayout());
        JLabel labelDoor = new JLabel(); //create label
        JLabel labelBattery = new JLabel();

        labelDoor.setText("Door State: "); //set text
        labelDoor.setFont(new Font("Arial", Font.BOLD, 15));
        labelBattery.setText("Battery State: ");
        labelBattery.setFont(new Font("Arial", Font.BOLD, 15));
        labelDoor.setHorizontalAlignment(JLabel.CENTER);
        labelBattery.setHorizontalAlignment(JLabel.CENTER);
        labelDoor.setVerticalAlignment(JLabel.CENTER);
        labelBattery.setVerticalAlignment(JLabel.CENTER);

        panel8.add(labelDoor);
        panel9.add(labelBattery);

        // Alarm
        panel2.setLayout(new BorderLayout());
        ImageIcon Buzzer = new ImageIcon("buzzer_off.png");
        JLabel LabelBuzzer = new JLabel();
        LabelBuzzer.setIcon(Buzzer);

        LabelBuzzer.setVerticalAlignment(JLabel.BOTTOM);
        LabelBuzzer.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(LabelBuzzer);

        frame.setVisible(true); //make frame visible
    }

}