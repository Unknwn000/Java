import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Vertical BoxLayout
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        // Horizontal BoxLayout
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        verticalPanel.add(button1);
        horizontalPanel.add(button2);
        verticalPanel.add(button3);
        horizontalPanel.add(button4);
        verticalPanel.add(button5);
        frame.add(verticalPanel, BorderLayout.WEST);
        frame.add(horizontalPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
