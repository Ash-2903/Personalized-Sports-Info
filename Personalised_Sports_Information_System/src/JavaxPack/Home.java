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
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

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
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
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
		lblNewLabel_3.setBounds(31, 448, 205, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter your Weight (kg) : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(31, 396, 205, 28);
		contentPane.add(lblNewLabel_4);
		
		height = new JTextField();
		height.setBounds(257, 451, 122, 28);
		contentPane.add(height);
		height.setColumns(10);
		
		weight = new JTextField();
		weight.setBounds(260, 399, 119, 28);
		contentPane.add(weight);
		weight.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("STXihei", Font.PLAIN, 16));
		textPane.setBounds(190, 201, 483, 100);
		String bmiRange = "Below 18.5 – You're in the underweight range\n"
                + "Between 18.5 and 24.9 – You're in the healthy weight range\n"
                + "Between 25 and 29.9 – You're in the overweight range\n"
                + "30 or over – You're in the obese range";
		textPane.setText(bmiRange);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_5 = new JLabel("LET'S CALCULATE YOUR BMI");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(72, 327, 232, 50);
		contentPane.add(lblNewLabel_5);
		
		final Bmi calcBmi = new Bmi();
		
	
		final JLabel bmi = new JLabel("");
		bmi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bmi.setBounds(10, 562, 774, 36);
		contentPane.add(bmi);
		
		JButton btnNewButton = new JButton("Get BMI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {              // action when "get bmi" button is clicked
				
				double w = Double.parseDouble(weight.getText());
				double h = Double.parseDouble(height.getText());
				double finalBmi = calcBmi.getBmi(w, h);
				bmi.setText("Your BMI is : " + finalBmi);
				
				/*
				 * JTextPane bmiRec = new JTextPane(); bmiRec.setFont(new Font("STXihei",
				 * Font.PLAIN, 16)); bmiRec.setBounds(31, 497, 483, 100);
				 * contentPane.add(bmiRec);
				 */
				
				JTextPane bmiRec = new JTextPane();
				bmiRec.setFont(new Font("Monospaced", Font.BOLD, 16));
				bmiRec.setBounds(72,634,483,140);
				String bmiRecommendation = calcBmi.getRecommendations(finalBmi);
				bmiRec.setText(bmiRecommendation);
				contentPane.add(bmiRec);
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(126, 506, 131, 28);
		contentPane.add(btnNewButton);
		
		
		
		
		
	}
}
