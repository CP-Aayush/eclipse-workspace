import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
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
		
		textField = new JTextField();
		textField.setBounds(10, 11, 202, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 11, 202, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int c=a+b;
				textField_2.setText(Integer.toString(c));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnNewButton.setBounds(10, 103, 99, 37);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(textField.getText());
					int b=Integer.parseInt(textField_1.getText());
					int c=a-b;
					textField_2.setText(Integer.toString(c));
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
			}
		});
		btnNewButton_1.setBounds(119, 103, 99, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(textField.getText());
					int b=Integer.parseInt(textField_1.getText());
					int c=a*b;
					textField_2.setText(Integer.toString(c));
					}
					catch(Exception exc) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
			}
		});
		btnNewButton_2.setBounds(10, 151, 99, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(textField.getText());
					int b=Integer.parseInt(textField_1.getText());
					int c=a/b;
					textField_2.setText(Integer.toString(c));
					}
					catch(Exception excp) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
			}
		});
		btnNewButton_3.setBounds(119, 151, 99, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 151, 199, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(298, 126, 46, 14);
		frame.getContentPane().add(lblResult);
		
		
	}
}
