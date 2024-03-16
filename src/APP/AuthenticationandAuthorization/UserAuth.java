package APP.AuthenticationandAuthorization;
import javax.swing.*;
import APP.System_User_Interface.MainView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserAuth extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel username = new JLabel("USERNAME");
    JLabel password = new JLabel("PASSWORD");
    JTextField userTF = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton DoneButton = new JButton("Done");
    JCheckBox showPassword = new JCheckBox("Show Password");

    {
        JPanel displaypanel = new JPanel();
        displaypanel.setPreferredSize(new Dimension(250, 150));
        container.setLayout(null);
        username.setBounds(50, 150, 100, 30);
        password.setBounds(50, 220, 100, 30);
        userTF.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        DoneButton.setBounds(200, 300, 100, 30);
        container.add(username);
        container.add(password);
        container.add(userTF);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(DoneButton);
        Color panelColor = new Color(123, 154, 239);
        container.setBackground(panelColor);
        loginButton.addActionListener(this);
        loginButton.setBackground(Color.lightGray);
        DoneButton.addActionListener(this);
        DoneButton.setBackground(Color.lightGray);
        showPassword.addActionListener(this);
        showPassword.setBackground(Color.lightGray);

    }

    
    /** 
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTF.getText();
            pwdText = String.valueOf(passwordField.getPassword());
           String[] user = { "Admin Admin" };
            int a = 0;
            for (int i = 0; i < user.length; i++) {
               String[] s = user[i].split(" ");
            //    if (userText.equals(s[0]) && pwdText.equals(s[1])) {
                userText.equals("Admin");
                pwdText.equals("Admin");
                MainView mainView = new MainView();

                
                mainView.createAndShowGUI();
                    a = 1;
                    setVisible(false);
            //    }
           }

            if (a == 0) {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }

        if (e.getSource() == DoneButton) {
            userTF.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
                // userTF.disable();
                // passwordField.disable();
            } else {
                passwordField.setEchoChar('*');
            }
        }

        
    }
    
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Report");
        MainView newContentPane = new MainView();
        frame.setPreferredSize(frame.getToolkit().getScreenSize());
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);

    }

}
