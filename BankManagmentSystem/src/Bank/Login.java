package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener
{
	// instance variable
	JLabel lblWelcome,lblCardNumber,lblPinNumber;
	JTextField tfCardNumber;
	JPasswordField pfPinNumber;
	JButton btnLogin,btnClear,btnSignup;
	public Login()
	{
		setTitle("Bank Management System");
		setLayout(null);
		lblWelcome=new JLabel("Welcome To Bank System");
		lblWelcome.setFont(new Font("Arial",Font.BOLD,35));
		lblWelcome.setBounds(200, 40, 530, 40);
		add(lblWelcome);
		
		lblCardNumber=new JLabel("Enter card no :");
		lblCardNumber.setFont(new Font("Tahoma",Font.BOLD,25));
		lblCardNumber.setBounds(120, 150, 400, 30);
		add(lblCardNumber);
		
		tfCardNumber=new JTextField(20);
		tfCardNumber.setBounds(350, 150, 230, 30);
		tfCardNumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add(tfCardNumber);

		lblPinNumber=new JLabel("Enter PIN no :");
		lblPinNumber.setFont(new Font("Tahoma",Font.BOLD,25));
		lblPinNumber.setBounds(120, 250, 400, 30);
		add(lblPinNumber);
		
		pfPinNumber=new JPasswordField(20);
		pfPinNumber.setBounds(350, 250, 230, 30);
		pfPinNumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add(pfPinNumber);
		btnLogin=new JButton("Login");
		btnLogin.setBackground(Color.blue);
		btnLogin.setForeground(Color.white);
		
		btnClear=new JButton("Clear");
		btnClear.setBackground(Color.red);
		btnClear.setForeground(Color.white);
		
		btnSignup=new JButton("Sign up");
		btnSignup.setBackground(Color.green);
		btnSignup.setForeground(Color.white);
		
		btnLogin.setFont(new Font("Tahoma",Font.BOLD,15));
		btnLogin.setBounds(250, 350, 100, 40);
		add(btnLogin);
		
		btnClear.setFont(new Font("Tahoma",Font.BOLD,15));
		btnClear.setBounds(400, 350, 100, 40);
		add(btnClear);
		
		btnSignup.setFont(new Font("Tahoma",Font.BOLD,15));
		btnSignup.setBounds(550, 350, 100, 40);
		add(btnSignup);
		
		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);
		btnSignup.addActionListener(this);
		
		
		
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,500);
		setLocation(400,200);
	}





	private JPasswordField JPasswordField(int i) {
		return null;
	}





	public static void main(String[] args)
	{
		Login obj=new Login();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==btnLogin) {
				
			}
			else if(ae.getSource()==btnClear){
				tfCardNumber.setText("");
				pfPinNumber.setText("");
				
			}
			else if(ae.getSource()==btnSignup) {
				this.setVisible(false);
				new Signup();
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
