import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleMenu {

    private Employee employee;
    private JPanel mainPanel;
    private JPanel transactionView;
    private JPanel foodView;
    private JList itemList;
    private JButton exitButton;
    private JButton deleteItemButton;
    private JButton burgerButton;
    private JButton hotDogButton;
    private JLabel timeLabel;
    private JLabel nameLabel;
    private JLabel positionLabel;
    private JPanel burgerMenu;
    private JPanel hotdogMenu;
    private JButton bextraPattyButton;
    private JButton blettuceButton;
    private JButton bonionsButton;
    private JButton bpicklesButton;
    private JButton btomatoButton;
    private JButton bketchupButton;
    private JButton bmustardButton;
    private JButton sausageUpgradeButton;
    private JButton hketchupButton;
    private JButton hmustardButton1;
    private JButton hmayoButton;
    private JButton hrelishButton;
    private JButton honionsButton;
    private JButton hpicklesButton;
    private Timer timer;
    private DefaultListModel<Item> listModel;


    public simpleMenu(Employee employee) {

        this.employee = employee;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        nameLabel.setText(employee.getFullName());
        positionLabel.setText(employee.getPosition());

        timeLabel.setText("--:--:-- --");
        startClock();

        listModel = new DefaultListModel<>();
        itemList.setModel(listModel);


        //burger button changes to burger menu
        burgerButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) (foodView.getLayout());
            cl.show(foodView, "burgerMenu");
            Item burger = new Item("Burger");
            //listModel.addElement(burger);
        });

        //hot dog button changes to hot dog menu
        hotDogButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) (foodView.getLayout());
            cl.show(foodView, "hotdogMenu");
        });

        exitButton.addActionListener(e -> {
            new loginScreenSUI();
            frame.dispose();
        });

    }

    //handles clock display
    private void startClock() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                timeLabel.setText(sdf.format(new Date()));
            }
        });
        timer.start();
    }

}
