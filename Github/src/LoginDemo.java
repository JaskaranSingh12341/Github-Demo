import javax.swing.*;
import java.awt.event.*;

public class LoginDemo extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField tf;
    JPasswordField pf;
    JButton b;

    LoginDemo() {
        l1 = new JLabel("Email:");
        l1.setBounds(50, 70, 80, 30);
        l2 = new JLabel("Password:");
        l2.setBounds(50, 110, 80, 30);

        tf = new JTextField();
        tf.setBounds(130, 70, 200, 30);
        pf = new JPasswordField();
        pf.setBounds(130, 110, 200, 30);

        b = new JButton("Login");
        b.setBounds(150, 160, 100, 30);
        b.addActionListener(this);

        add(l1);
        add(tf);
        add(l2);
        add(pf);
        add(b);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String email = tf.getText();
        String password = new String(pf.getPassword());

        if (email.equals("JaskaranSingh") && password.equals("202205129")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or password. Please try again.");
        }
    }

    public static void main(String[] args) {
        new LoginDemo();
    }
}

