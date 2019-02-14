import java.awt.EventQueue;

import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection conn=null;
	private JTextField textFieldUsername;
	private JPasswordField pwd;
	public LoginWindow() {
		conn=SqlConnection.createConnection();
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("email");
		lblUsername.setBounds(34, 81, 67, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(34, 138, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(111, 78, 269, 20);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(111, 135, 269, 20);
		frame.getContentPane().add(pwd);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="select * from employee where email=? and password=?";
					PreparedStatement pt=conn.prepareStatement(query);
					pt.setString(1, textFieldUsername.getText());
					pt.setString(2, pwd.getText());
					
					ResultSet rs=pt.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"Login Successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Login Failed");
					}
					pt.close();
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		btnLogin.setBounds(190, 178, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
