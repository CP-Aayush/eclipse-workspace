import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvancedCalculator {
	
	
	private JFrame frame;
	public static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvancedCalculator window = new AdvancedCalculator();
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
	public AdvancedCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);

	     

	      JFrame frame = new JFrame("Calc2");
	      frame.getContentPane().setLayout(null);
	      
	      textField = new JTextField();
	      textField.setBounds(0, 0, 390, 75);
	      frame.getContentPane().add(textField);
	      textField.setColumns(10);
	      
	      JPanel panel = new JPanel();
	      panel.setBounds(10, 77, 370, 215);
	      frame.getContentPane().add(panel);
	      GridBagLayout gbl_panel = new GridBagLayout();
	      gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
	      gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
	      gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
	      gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
	      panel.setLayout(gbl_panel);
	      
	      JButton btnNewButton = new JButton("7");
	      btnNewButton.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	      gbc_btnNewButton.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton.gridx = 0;
	      gbc_btnNewButton.gridy = 0;
	      panel.add(btnNewButton, gbc_btnNewButton);
	      
	      JButton btnNewButton_1 = new JButton("8");
	      btnNewButton_1.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
	      gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_1.gridx = 1;
	      gbc_btnNewButton_1.gridy = 0;
	      panel.add(btnNewButton_1, gbc_btnNewButton_1);
	      
	      JButton btnNewButton_2 = new JButton("9");
	      btnNewButton_2.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent arg0) {
	      		textField.setText(textField.getText()+9);
	      	}
	      });
	      btnNewButton_2.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
	      gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_2.gridx = 2;
	      gbc_btnNewButton_2.gridy = 0;
	      panel.add(btnNewButton_2, gbc_btnNewButton_2);
	      
	      JButton btnNewButton_3 = new JButton("+");
	      btnNewButton_3.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
	      gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
	      gbc_btnNewButton_3.gridx = 3;
	      gbc_btnNewButton_3.gridy = 0;
	      panel.add(btnNewButton_3, gbc_btnNewButton_3);
	      
	      JButton btnNewButton_4 = new JButton("4");
	      btnNewButton_4.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
	      gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_4.gridx = 0;
	      gbc_btnNewButton_4.gridy = 1;
	      panel.add(btnNewButton_4, gbc_btnNewButton_4);
	      
	      JButton btnNewButton_7 = new JButton("5");
	      btnNewButton_7.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
	      gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_7.gridx = 1;
	      gbc_btnNewButton_7.gridy = 1;
	      panel.add(btnNewButton_7, gbc_btnNewButton_7);
	      
	      JButton btnNewButton_8 = new JButton("6");
	      btnNewButton_8.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
	      gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_8.gridx = 2;
	      gbc_btnNewButton_8.gridy = 1;
	      panel.add(btnNewButton_8, gbc_btnNewButton_8);
	      
	      JButton btnNewButton_9 = new JButton("-");
	      btnNewButton_9.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
	      gbc_btnNewButton_9.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
	      gbc_btnNewButton_9.gridx = 3;
	      gbc_btnNewButton_9.gridy = 1;
	      panel.add(btnNewButton_9, gbc_btnNewButton_9);
	      
	      JButton btnNewButton_5 = new JButton("1");
	      btnNewButton_5.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
	      gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_5.gridx = 0;
	      gbc_btnNewButton_5.gridy = 2;
	      panel.add(btnNewButton_5, gbc_btnNewButton_5);
	      
	      JButton btnNewButton_10 = new JButton("2");
	      btnNewButton_10.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
	      gbc_btnNewButton_10.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_10.gridx = 1;
	      gbc_btnNewButton_10.gridy = 2;
	      panel.add(btnNewButton_10, gbc_btnNewButton_10);
	      
	      JButton btnNewButton_11 = new JButton("3");
	      btnNewButton_11.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
	      gbc_btnNewButton_11.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_11.gridx = 2;
	      gbc_btnNewButton_11.gridy = 2;
	      panel.add(btnNewButton_11, gbc_btnNewButton_11);
	      
	      JButton btnNewButton_12 = new JButton("*");
	      btnNewButton_12.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
	      gbc_btnNewButton_12.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 0);
	      gbc_btnNewButton_12.gridx = 3;
	      gbc_btnNewButton_12.gridy = 2;
	      panel.add(btnNewButton_12, gbc_btnNewButton_12);
	      
	      JButton btnNewButton_6 = new JButton(".");
	      btnNewButton_6.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
	      gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 5);
	      gbc_btnNewButton_6.gridx = 0;
	      gbc_btnNewButton_6.gridy = 3;
	      panel.add(btnNewButton_6, gbc_btnNewButton_6);
	      
	      JButton btnNewButton_13 = new JButton("0");
	      btnNewButton_13.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
	      gbc_btnNewButton_13.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_13.insets = new Insets(0, 0, 0, 5);
	      gbc_btnNewButton_13.gridx = 1;
	      gbc_btnNewButton_13.gridy = 3;
	      panel.add(btnNewButton_13, gbc_btnNewButton_13);
	      
	      JButton btnNewButton_14 = new JButton("=");
	      btnNewButton_14.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
	      gbc_btnNewButton_14.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_14.insets = new Insets(0, 0, 0, 5);
	      gbc_btnNewButton_14.gridx = 2;
	      gbc_btnNewButton_14.gridy = 3;
	      panel.add(btnNewButton_14, gbc_btnNewButton_14);
	      
	      JButton btnNewButton_15 = new JButton("/");
	      btnNewButton_15.setFont(new Font("Rubik", Font.BOLD, 17));
	      GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
	      gbc_btnNewButton_15.fill = GridBagConstraints.BOTH;
	      gbc_btnNewButton_15.gridx = 3;
	      gbc_btnNewButton_15.gridy = 3;
	      panel.add(btnNewButton_15, gbc_btnNewButton_15);
	   }
	}


