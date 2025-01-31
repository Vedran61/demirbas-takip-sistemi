import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class PersonelEkrani extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelEkrani frame = new PersonelEkrani();
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
	public PersonelEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JButton btnKaytSil = new JButton("Kay\u0131t sil");
		btnKaytSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PPKayitSil isim = new PPKayitSil();
				isim.setVisible(true);
				dispose();
			}
		});
		btnKaytSil.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnKaytSil.setBounds(10, 139, 150, 32);
		contentPane.add(btnKaytSil);
		
		JButton btnKaytDzenle = new JButton("Kay\u0131t Listele");
		btnKaytDzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
			
				try {
					PKayitDuzenle frame = new PKayitDuzenle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			
			}
		});
		btnKaytDzenle.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnKaytDzenle.setBounds(10, 84, 150, 32);
		contentPane.add(btnKaytDzenle);
		
		JButton btnProgramdank = new JButton("X Programdan \u00C7\u0131k\u0131\u015F");
		btnProgramdank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnProgramdank.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnProgramdank.setBounds(274, 200, 150, 32);
		contentPane.add(btnProgramdank);
		
		JButton button_1 = new JButton("<- Geri d\u00F6n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Personel isim = new Personel();
				isim.setVisible(true);
				PersonelEkrani.this.dispose();
			}
		});
		button_1.setFont(new Font("Righteous", Font.PLAIN, 12));
		button_1.setBounds(10, 200, 150, 32);
		contentPane.add(button_1);
		
		JButton btnKaytEkle1 = new JButton("Kay\u0131t ekle");
		btnKaytEkle1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				PKayitEkle isim;
				isim = new PKayitEkle();
				isim.setVisible(true);
				
				PersonelEkrani.this.dispose();
				
			}
		});
		btnKaytEkle1.setFont(new Font("Righteous", Font.PLAIN, 12));
		btnKaytEkle1.setBounds(10, 26, 150, 32);
		contentPane.add(btnKaytEkle1);
		
	}
	}
