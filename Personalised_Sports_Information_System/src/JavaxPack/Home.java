package JavaxPack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javapack.Bmi;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField height;
	private JTextField weight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Personalized Sports Info Hub!");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(31, 24, 742, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("We believe that every individual is different, and that's why we're here to provide you with personalized guidance on sports, nutrition, and wellness.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 87, 976, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Embark on a fitness journey that's perfectly aligned with your goals and preferences.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(31, 133, 720, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter you Height (m) : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(31, 320, 205, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter your Weight (kg) : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(31, 258, 205, 28);
		contentPane.add(lblNewLabel_4);
		
		height = new JTextField();
		height.setBounds(246, 323, 122, 28);
		contentPane.add(height);
		height.setColumns(10);
		
		weight = new JTextField();
		weight.setBounds(246, 261, 119, 28);
		contentPane.add(weight);
		weight.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("LET'S CALCULATE YOUR BMI");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(73, 197, 232, 50);
		contentPane.add(lblNewLabel_5);
		
		final Bmi calcBmi = new Bmi();
		
	
		final JLabel bmi = new JLabel("");
		bmi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bmi.setBounds(31, 451, 774, 36);
		contentPane.add(bmi);
		
		JButton btnNewButton = new JButton("Get BMI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double w = Double.parseDouble(weight.getText());
				double h = Double.parseDouble(height.getText());
				bmi.setText("Your BMI is : " + calcBmi.getBmi(w, h));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(135, 397, 131, 28);
		contentPane.add(btnNewButton);
	}

}
