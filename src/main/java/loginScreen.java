import javax.swing.*;
import java.awt.*;

public class loginScreen {

    public loginScreen() {

        JFrame frame = new JFrame("Employee Log In");
        frame.setSize(520,320);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        frame.add(panel);
        panel.setVisible(true);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;

        JLabel questionLabel = new JLabel("Enter employee ID: ");
        c.gridx = 2;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(questionLabel, c);


    }

}
