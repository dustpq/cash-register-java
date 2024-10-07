import javax.swing.*;
import java.awt.*;

public class loginScreen {

    public loginScreen() {

        JFrame frame = new JFrame();
        frame.setSize(320,520);
        frame.setBounds(10,10,10,10);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 1;


    }

}
