import com.sun.tools.javac.Main;

import javax.swing.*;

public class clockInMenu {

    private Employee e;
    private JButton clockInButton;
    private JButton exitButton;
    private JLabel employee_name;
    private JLabel employee_position;
    private JPanel panel;

    public clockInMenu(Employee employee) {

        System.out.println("Clock in menu started.");
        this.e = employee;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        employee_name.setText(employee.getFullName());
        employee_position.setText(employee.getPosition());

        clockInButton.addActionListener(e -> {
            clockIn(employee);
            frame.dispose();
        });

        exitButton.addActionListener(e -> {
            new loginScreenSUI();
            frame.dispose();
        });

    }

    public void clockIn(Employee e) {
        new mainMenu(e);
    }

    public void exit() {
        new loginScreen();
    }

}
