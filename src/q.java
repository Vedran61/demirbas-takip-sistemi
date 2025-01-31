import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class q extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					q frame = new q();
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
	public q() {
		setForeground(Color.GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\baha\\Documents\\java\\workspace\\demirba\u015Ftakip\\img\\bck.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 378);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnYneticiGirii = new JButton("Y\u00F6netici giri\u015Fi");
		btnYneticiGirii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yonetici isim = new Yonetici();
				isim.setVisible(true);
				q.this.dispose();
			}

});
		btnYneticiGirii.setFont(new Font("Unispace", Font.PLAIN, 16));
		btnYneticiGirii.setBounds(61, 79, 329, 51);
		contentPane.add(btnYneticiGirii);
		
		JButton btnKullancGirii = new JButton("Personel Giri\u015Fi");
		btnKullancGirii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Personel isim = new Personel();
				isim.setVisible(true);
				q.this.dispose();
				
			}
		});
		btnKullancGirii.setFont(new Font("Unispace", Font.PLAIN, 16));
		btnKullancGirii.setBounds(61, 209, 329, 51);
		contentPane.add(btnKullancGirii);
		
		
	}
}
