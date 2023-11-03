package Modulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InterfazGraficaDirigida1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGraficaDirigida1 window = new InterfazGraficaDirigida1();
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
	public InterfazGraficaDirigida1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Luis Miguel Senero Cervantes");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("03/11/2023 17:04");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado cancelar");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cookie del dia");
		btnNewButton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                    btnNewButton_1.doClick();
	                    System.out.println("Has seleccionado la cookie desde el teclado");
	                }
			}
		});
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado la cookie");
			}
		});
		
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 5;
		gbc_btnNewButton_1.gridy = 6;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
