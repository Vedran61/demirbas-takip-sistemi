import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KayitAra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayitAra frame = new KayitAra();
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
	public KayitAra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPersonelNumarasGiriniz = new JLabel("Kay\u0131t numaras\u0131 giriniz :");
		lblPersonelNumarasGiriniz.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblPersonelNumarasGiriniz.setBounds(50, 51, 158, 14);
		contentPane.add(lblPersonelNumarasGiriniz);
		
		JButton btnGiri = new JButton("Giri\u015F");
		btnGiri.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnGiri.setBounds(335, 215, 89, 35);
		contentPane.add(btnGiri);
		
		textField = new JTextField();
		textField.setBounds(234, 49, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 118, 164, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGrupAdnGiriniz = new JLabel("Grup ad\u0131n\u0131 giriniz :");
		lblGrupAdnGiriniz.setFont(new Font("Righteous", Font.PLAIN, 13));
		lblGrupAdnGiriniz.setBounds(79, 121, 139, 14);
		contentPane.add(lblGrupAdnGiriniz);
		
		JButton btnGeriDn = new JButton("<- Geri");
		btnGeriDn.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();

			}
		});
		btnGeriDn.setBounds(10, 216, 89, 35);
		contentPane.add(btnGeriDn);
	}
	}


