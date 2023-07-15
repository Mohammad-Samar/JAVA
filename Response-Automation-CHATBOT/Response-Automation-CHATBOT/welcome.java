import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame {
    private JButton btnLogin;
    private JButton btnRegister;
    private JPanel welcomePannel;

    public welcome(){
        JPanel panel = new JPanel();
        setTitle("Welcome");
        setContentPane(welcomePannel);
        setMinimumSize(new Dimension(500, 429));
        setSize(700, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnRegister.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm(welcome.this);
                User user = registrationForm.user;
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm(welcome.this);
                User user = loginForm.user;
                if (user != null) {
                    new ChatBot();
                    ChatBot cb=new ChatBot();
                    cb.setSize(800,605);
                    cb.setLocation(50,50);
                }
                else {
                    System.out.println("Authentication canceled");
                }
            }
        });
    }

    public static void main(String[] args) {
        welcome wel = new welcome();
    }
}
