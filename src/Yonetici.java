import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Yonetici extends JFrame implements LayoutManager {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yonetici frame = new Yonetici();
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
	public Yonetici() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 144, 155, 23);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(188, 110, 155, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 ad\u0131 :");
		lblKullancAd.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblKullancAd.setBounds(53, 104, 155, 32);
		contentPane.add(lblKullancAd);
		
		lblNewLabel = new JLabel("\u015Eifre :");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		lblNewLabel.setBounds(112, 139, 155, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnGiri = new JButton("Giri\u015F");
		btnGiri.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String admink = "1";
				String sifre = "1";
				if(textField.getText().equals(admink) && passwordField.getText().equals(sifre)) {
					
					YoneticiEkrani isim = new YoneticiEkrani();
					isim.setVisible(true);
					Yonetici.this.dispose();

				
				}
			}
		});
		btnGiri.setBounds(255, 186, 89, 23);
		contentPane.add(btnGiri);
		
		JLabel lblNewLabel_1 = new JLabel("Y\u00D6NET\u0130C\u0130 G\u0130R\u0130\u015E\u0130");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(10, 38, 414, 47);
		contentPane.add(lblNewLabel_1);
		
		button = new JButton("<- Geri D\u00F6n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				q isim = new q();
				isim.setVisible(true);
				Yonetici.this.dispose();
			}
		});
		button.setFont(new Font("Righteous", Font.PLAIN, 12));
		button.setBounds(10, 227, 95, 23);
		contentPane.add(button);


		
	}

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}
}
