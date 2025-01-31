

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KayitListele extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayitListele frame = new KayitListele();
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
	public KayitListele() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 462, 399);
		contentPane.add(panel);
		
		
		String basliklar[]= {"Kayýt Numarasý","Zimmetlenecek Kiþi","Kayýt Grubu"};
		
		DefaultTableModel model=new DefaultTableModel(basliklar,0);
		
		JTable table=new JTable(model); 
		
		JScrollPane pane=new JScrollPane(table);
		
		panel.add(pane);
		
		JButton btnNewButton = new JButton("<- Geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 421, 89, 23);
		contentPane.add(btnNewButton);
		
		
		try {
			
			String[] list  ;
			String satir;
			
			FileReader oku = new FileReader("Kayýt_Listesi.txt");
			BufferedReader tut = new BufferedReader(oku);
			
			
			while((satir=tut.readLine())!=null)
			{
				list=satir.split("-");
				model.addRow(list);
		
			}
			tut.close();
			oku.close();
	

		}  catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}