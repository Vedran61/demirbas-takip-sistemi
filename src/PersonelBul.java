

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PersonelBul extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelBul frame = new PersonelBul();
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
	public PersonelBul() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Düzenle");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PersonelDuzenle duzenle=new PersonelDuzenle(textField.getText());
				duzenle.setVisible(true);
				dispose();
			}
		});
		button.setBounds(218, 69, 71, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 38, 136, 20);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Personel Numaras\u0131n\u0131 Giriniz : ");
		label.setBounds(10, 41, 199, 14);
		contentPane.add(label);
		
		btnNewButton = new JButton("<- Geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 92, 89, 23);
		contentPane.add(btnNewButton);
	}
}
