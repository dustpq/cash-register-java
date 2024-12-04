import javax.swing.*;

public class loginScreenSUI {

    private JPanel panel;
    private JLabel questionLabel;
    private JTextField idDisplay;
    private JButton numkey1;
    private JButton numkey2;
    private JButton numkey3;
    private JButton numkey4;
    private JButton numkey5;
    private JButton numkey6;
    private JButton numkey7;
    private JButton numkey8;
    private JButton numkey9;
    private JButton numkey0;
    private JButton keyClear;
    private JButton keyOK;
    private JLabel EMP_label;
    private String idInput = "";
    private final JFrame frame;

    public loginScreenSUI() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        idDisplay.setText(idInput);

        numkey1.addActionListener(e -> addNumToString(1));
        numkey2.addActionListener(e -> addNumToString(2));
        numkey3.addActionListener(e -> addNumToString(3));
        numkey4.addActionListener(e -> addNumToString(4));
        numkey5.addActionListener(e -> addNumToString(5));
        numkey6.addActionListener(e -> addNumToString(6));
        numkey7.addActionListener(e -> addNumToString(7));
        numkey8.addActionListener(e -> addNumToString(8));
        numkey9.addActionListener(e -> addNumToString(9));
        numkey0.addActionListener(e -> addNumToString(0));

        keyClear.addActionListener(e -> clear_idDisplay());
        keyOK.addActionListener(e -> {
            idInput = idDisplay.getText();
            tryLogin(idInput);
        });

    }

    private void addNumToString(int num) {

        if (idInput.length()<12) {

            idInput += num;
            idDisplay.setText(idInput);

        }

    }

    private void clear_idDisplay() {

        idInput = "";
        idDisplay.setText(idInput);

    }

    private void tryLogin(String userID) {

        System.out.println("Trying to login with ID: " + "EMP" + userID);

        loginManager.logIn("EMP" + userID);

        if (loginManager.isLoggedIn("EMP" + userID)) {
            System.out.println("Login successful.");
            frame.dispose();
        }

        else {
            System.out.println("Login failed.");
            logInFail();
        }

    }

    private void logInFail() {

        JOptionPane.showMessageDialog(
                null,
                "Login failed. Try again.",
                "Login Error",
                JOptionPane.ERROR_MESSAGE);

    }

}
