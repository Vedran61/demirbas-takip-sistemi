import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class YoneticiEkrani extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiEkrani frame = new YoneticiEkrani();
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
	public YoneticiEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Personel ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PersonelEkle isim = new PersonelEkle();
				isim.setVisible(true);
				YoneticiEkrani.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 11, 150, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Personel sil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PersonelSiL isim = new PersonelSiL();
				isim.setVisible(true);
				YoneticiEkrani.this.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnNewButton_1.setBounds(10, 119, 150, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnKaytEkle = new JButton("Kay\u0131t ekle");
		btnKaytEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KayitEkle isim = new KayitEkle();
				isim.setVisible(true);
				YoneticiEkrani.this.dispose();
			}
		});
		btnKaytEkle.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnKaytEkle.setBounds(274, 11, 150, 32);
		contentPane.add(btnKaytEkle);
		
		JButton btnKaytSil = new JButton("Kay\u0131t sil");
		btnKaytSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KayitSil2 isim = new KayitSil2();
				isim.setVisible(true);
				YoneticiEkrani.this.dispose();
				
			}
		});
		btnKaytSil.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnKaytSil.setBounds(274, 119, 150, 32);
		contentPane.add(btnKaytSil);
		
		JButton btnProgramdank = new JButton("X Programdan \u00C7\u0131k\u0131\u015F");
		btnProgramdank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnProgramdank.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnProgramdank.setBounds(274, 218, 150, 32);
		contentPane.add(btnProgramdank);
		
		JButton button_1 = new JButton("<- Geri d\u00F6n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yonetici isim = new Yonetici();
				isim.setVisible(true);
				YoneticiEkrani.this.dispose();
			}
		});
		button_1.setFont(new Font("Righteous", Font.PLAIN, 12));
		button_1.setBounds(10, 218, 150, 32);
		contentPane.add(button_1);
		
		JButton btnKaytAra = new JButton("Kay\u0131t Listele");
		btnKaytAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KayitListele isim = new KayitListele();
				isim.setVisible(true);
				YoneticiEkrani.this.dispose();
			}
		});
		btnKaytAra.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnKaytAra.setBounds(274, 65, 149, 32);
		contentPane.add(btnKaytAra);
		
		JButton button = new JButton("Personel Listele");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PersonelListele listele=new PersonelListele();
				listele.setVisible(true);
			}
		});
		button.setFont(new Font("Righteous", Font.PLAIN, 12));
		button.setBounds(10, 65, 150, 32);
		contentPane.add(button);
	}
}
