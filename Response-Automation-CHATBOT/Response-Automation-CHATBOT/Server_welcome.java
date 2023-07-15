



import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Server_welcome extends JFrame {
    private JButton btnLogin;
    private JButton btnRegister;
    private JPanel welcomePannel;

    public Server_welcome(){
        JPanel panel = new JPanel();
        setTitle("Welcome");
        setContentPane(welcomePannel);
        setMinimumSize(new Dimension(500, 429));
        setSize(700, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnRegister.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                Server_Registration registrationForm = new Server_Registration(Server_welcome.this);
                Server_Executives user = registrationForm.user;
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Server_Login loginForm = new Server_Login(Server_welcome.this);
                Server_Executives user = loginForm.user;
                if (user != null) {
                    Server ss = new Server();
                }
                else {
                    System.out.println("Authentication canceled");
                }
            }
        });
    }

    public static void main(String[] args) {
        Server_welcome wel = new Server_welcome();
    }
}
