
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.*;

import java.util.Random;

public class ChatBot extends JFrame implements ActionListener
{
	JTextField text;
	static JPanel a1;
	static Box vertical = Box.createVerticalBox();
	static JFrame f = new JFrame();
	static DataOutputStream dout;
	static JTextArea area=new JTextArea();
	JTextField field=new JTextField();
	JScrollPane sp;
	JButton send;
	LocalTime time=LocalTime.now();
	LocalDate date=LocalDate.now();

	public ChatBot() {
		setVisible(true);
		setTitle("Write 'Hey' to start.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.cyan);
		field = new JTextField();
		send = new JButton(">");
		send.setFont(new Font("Serif", Font.BOLD, 25));
		send.setBackground(Color.white);
		send.setBounds(735, 520, 50, 35);
		add(send);
		//For Text area
		area.setEditable(false);
		area.setBackground(Color.white);
		add(area);
		area.setFont(new Font("Serif", Font.PLAIN, 20));
		//scrollbar
		sp = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setBounds(10, 20, 775, 470);
		add(sp);

		//For TextField
		field.setSize(725, 35);
		field.setLocation(10, 520);
		field.setForeground(Color.black);
		field.setFont(new Font("Serif", Font.BOLD, 25));
		add(field);
		send.addActionListener(this);
		getRootPane().setDefaultButton(send);

	}



		public void actionPerformed (ActionEvent e){

			String myStr1 = "cold";
			String myStr2 = "immune system";
			String myStr3 = "fever";
			String myStr4 = "throat";
			String myStr5 = "remedy for coughs";
			String myStr6 = "feeling dizziness";
			String myStr7 = "cure dizziness";
			String myStr8 = "vd";
			String myStr9 = "hey";

			String message = field.getText().toLowerCase();
			new User();

			area.append(User.name+":- "+field.getText() + "\n");
			field.setText("");
			Socket sock = new Socket();

			Random rand = new Random();
			int ran = rand.nextInt(22,24);

			if (message.contains(myStr1)) {

				doctor("Colds and coughs are common respiratory illnesses that can be caused by various\n" +"factors such as:-\n" +
						"\n" + "1. Stay hydrated" +
						"\n" + "3. Use a humidifier" +
						"\n" + "4. Honey and warm beverage" +
						"\n" + "5. Steam inhalation" +
						"\n" + "6. Rest and sleep" +
						"\n" + "7. Nasal irrigation" + "\n"  + "\n" + "WRITE VD to talk to virtual doctor"+"\n");


			} else if (message.contains(myStr2)) {
				doctor("Boosting your immune system and maintaining good overall health involves a \n"+"combination of healthy lifestyle choices:\n" +
						"\n" + "1. Eat a balanced diet" +
						"\n" + "2. Stay hydrated" +
						"\n" + "3. Get regular exercise" +
						"\n" + "4. Get enough sleep" +
						"\n" + "5. Manage stress " +
						"\n" +  "\n" + "WRITE VD to talk to virtual doctor"+"\n");

			} else if (message.contains(myStr3)) {
				doctor("To check if you have a fever, you can use a thermometer to measure your \n"+"body temperature:\n" +
						"\n" + "1. Oral methodime" +
						"\n" + "2. Rectal method" +
						"\n" + "3. Forehead or temporal artery method" +
						"\n" + "4. Ear method" +
						"\n" + "5. Wearable thermometers" +
						"\n"   + "\n" + "WRITE VD to talk to virtual doctor"+"\n");

			} else if (message.contains(myStr4)) {
				doctor("To treat a sore throat, you can try the following remedies:\n" +
						"\n" + "1. Gargle with warm saltwater" +
						"\n" + "2. Stay hydrated" +
						"\n" + "3. Use throat lozenges or sprays" +
						"\n" + "4. Honey and warm liquids" +
						"\n" + "5. Avoid irritants" +
						"\n"   + "\n" + "WRITE VD to talk to virtual doctor"+"\n");

			} else if (message.contains(myStr5)) {

				doctor("Home remedies for coughs can provide relief and help soothe your throat.\n" +
						"\n" + "1. Honey" +
						"\n" + "2. Warm fluids" +
						"\n" + "3. Steam inhalation" +
						"\n" + "4. Humidifier" +
						"\n" + "5. Gargle with saltwater" +
						"\n" + "6. Stay hydrated" +
						"\n"   + "\n" + "WRITE VD to talk to virtual doctor"+"\n");

			} else if (message.contains(myStr6)) {
				doctor("Feeling dizziness can have various causes and may be a result of different factors. :\n" +
						"\n" + "1. Inner ear problems" +
						"\n" + "2. Low blood pressure" +
						"\n" + "3. Dehydration" +
						"\n" + "4. Medications" +
						"\n" + "5. Anxiety or panic attacks" +
						"\n" + "6. Hypoglycemia" +
						"\n"   + "\n" + "WRITE VD to talk to virtual doctor"+"\n");

			} else if (message.contains(myStr7)) {

				doctor("While there isn't a specific food that but maintaining a healthy diet can support you:\n" +
						"\n" + "1. Stay hydrated" +
						"\n" + "2. Eat balanced meals" +
						"\n" + "3. Include iron-rich foods" +
						"\n" + "4. Consume vitamin C-rich foods" +
						"\n" + "5. Consider ginger" +
						"\n" + "6. Avoid triggers" +
						"\n" + "7. Talk to a healthcare professional" +
						"\n"   + "\n" + "WRITE VD to talk to virtual doctor"+"\n");
			}

			else if (message.contains(myStr9)) {
				doctor("Hello, How can I help you? Please write...");
			}


			else {
				if (message.contains(myStr8)) {
					/*doctor("connecting to dr");*/
					//new Client();
					Client cc =  new Client();
				} else {
					doctor("Can you re-write? I can not understand");
				}
			}
		}


	public static void doctor (String message) {
		area.append("Bot : " + message + "\n");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ChatBot cb=new ChatBot();
		cb.setSize(800,605);
		cb.setLocation(50,50);

	}
}
