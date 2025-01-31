import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.Scrollbar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.TextArea;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JFormattedTextField;

public class KayitDuzenle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayitDuzenle frame = new KayitDuzenle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public KayitDuzenle() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLtfenSilmekIstediiniz = new JLabel("L\u00FCtfen d\u00FCzenlemek istedi\u011Finiz kayd\u0131 se\u00E7iniz :");
		lblLtfenSilmekIstediiniz.setFont(new Font("Righteous", Font.PLAIN, 15));
		lblLtfenSilmekIstediiniz.setBounds(35, 59, 354, 39);
		contentPane.add(lblLtfenSilmekIstediiniz);
		
		List list = new List();
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
					
				}
		});
		list.setBounds(35, 104, 319, 51);
		contentPane.add(list);
		
			
	
		
		
		
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(355, 105, 17, 50);
		contentPane.add(scrollbar);
		
		Button button = new Button("D\u00FCzenle");
		button.setActionCommand("D\u00FCzenle");
		button.setFont(new Font("Righteous", Font.PLAIN, 13));
		button.setBounds(300, 169, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Geri D\u00F6n");
		button_1.setFont(new Font("Righteous", Font.PLAIN, 13));
		button_1.setActionCommand("<- Geri");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();

			}
		});
		button_1.setBounds(10, 412, 142, 51);
		contentPane.add(button_1);
	}
}


