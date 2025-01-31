import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PersonelEkle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JButton btnKaydet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelEkle frame = new PersonelEkle();
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
	public PersonelEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(211, 25, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 71, 132, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(211, 117, 132, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(211, 163, 132, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(211, 209, 132, 20);
		contentPane.add(passwordField);
		
		JLabel lblPersonelAd = new JLabel("Personel ad\u0131 :");
		lblPersonelAd.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelAd.setBounds(120, 22, 108, 23);
		contentPane.add(lblPersonelAd);
		
		JLabel lblPersonelSoyad = new JLabel("Personel soyad\u0131 :");
		lblPersonelSoyad.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelSoyad.setBounds(97, 69, 114, 23);
		contentPane.add(lblPersonelSoyad);
		
		JLabel lblPersonelNumaras = new JLabel("Personel Numaras\u0131 :");
		lblPersonelNumaras.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelNumaras.setBounds(80, 115, 132, 23);
		contentPane.add(lblPersonelNumaras);
		
		JLabel lblPersonelKullancAd = new JLabel("Personel Kullan\u0131c\u0131 ad\u0131 :");
		lblPersonelKullancAd.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelKullancAd.setBounds(65, 161, 173, 23);
		contentPane.add(lblPersonelKullancAd);
		
		JLabel lblPersonelifresi = new JLabel("Personel \u015Fifresi :");
		lblPersonelifresi.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelifresi.setBounds(100, 207, 108, 23);
		contentPane.add(lblPersonelifresi);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnKaydet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
					
			}
		});
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String yazilacak="";
					yazilacak= textField.getText()+"-"+textField_1.getText()+"-"+textField_2.getText()+
							"-"+textField_3.getText()+"-"+passwordField.getText();
					
					
					
					
					FileWriter yaz = new FileWriter("KULLANICILAR.txt", true);
					BufferedWriter tut = new BufferedWriter(yaz);
				
					
					tut.write(yazilacak);
					tut.newLine();
					tut.close();
					yaz.close();
					
					JOptionPane.showMessageDialog(btnKaydet , "Kayýt Baþarýlý");
					YoneticiEkrani isim = new YoneticiEkrani();
					isim.setVisible(true);
					dispose();
					
					
					

				}  catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnKaydet.setBounds(279, 248, 89, 34);
		contentPane.add(btnKaydet);
		
		JButton btnNewButton = new JButton("<- Geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnNewButton.setBounds(41, 253, 89, 29);
		contentPane.add(btnNewButton);
	}
}
	
