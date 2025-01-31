import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class KayitEkle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayitEkle frame = new KayitEkle();
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
	public KayitEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(211, 36, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 92, 132, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(211, 148, 132, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPersonelAd = new JLabel("Kay\u0131t Numaras\u0131 :");
		lblPersonelAd.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelAd.setBounds(100, 32, 108, 23);
		contentPane.add(lblPersonelAd);
		
		JLabel lblPersonelSoyad = new JLabel("Zimmetlenecek Ki\u015Fi :");
		lblPersonelSoyad.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelSoyad.setBounds(78, 90, 131, 23);
		contentPane.add(lblPersonelSoyad);
		
		JLabel lblPersonelNumaras = new JLabel("Kay\u0131t Grubu :");
		lblPersonelNumaras.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelNumaras.setBounds(120, 145, 132, 23);
		contentPane.add(lblPersonelNumaras);
		
		button = new JButton("Kaydet");
		button.setFont(new Font("Righteous", Font.PLAIN, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String yazilacak="";
					yazilacak= textField.getText()+"-"+textField_1.getText()+"-"+textField_2.getText();
					
					
					
					
					FileWriter yaz = new FileWriter("Kayýt_Listesi.txt", true);
					BufferedWriter tut = new BufferedWriter(yaz);
					tut.write(yazilacak);
					tut.newLine();
					tut.close();
					yaz.close();
					
					JOptionPane.showMessageDialog(button , "Kayýt Baþarýlý");
					YoneticiEkrani isim = new YoneticiEkrani();
					isim.setVisible(true);
					dispose();
					
					
					

				}  catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		button.setBounds(335, 255, 89, 34);
		contentPane.add(button);
		
		btnNewButton = new JButton("<- Geri");
		btnNewButton.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setBounds(10, 255, 89, 34);
		contentPane.add(btnNewButton);
	}
}
