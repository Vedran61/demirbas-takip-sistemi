

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PersonelSiL extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String basliklar[]= {"AD","SOYAD","PER. NUM.","KULLANICI ADI","ÞÝFRE"};
	DefaultTableModel model=new DefaultTableModel(basliklar,0);
	JTable table;
	JScrollPane pane;
	private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelSiL frame = new PersonelSiL();
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
	
	public void removeLine(String lineContent) throws IOException
	{
	
	    File file = new File("KULLANICILAR.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    
	 
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	  
	}
	

	public PersonelSiL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 462, 441);
		contentPane.add(panel);
		

		 table=new JTable(model); 
		
		 pane=new JScrollPane(table);
		
		panel.add(pane);
		
		textField = new JTextField();
		textField.setBounds(163, 8, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Personel Numaras\u0131n\u0131 Giriniz : ");
		lblNewLabel.setFont(new Font("Righteous", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 11, 199, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sil");
		btnNewButton.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				try {
					
					String[] list  ;
					String satir;
					
					FileReader oku = new FileReader("KULLANICILAR.txt");
					BufferedReader tut = new BufferedReader(oku);
				
					int rownum=0; 
					while((satir=tut.readLine())!=null)
					{
						
						list=satir.split("-");
			if (textField.getText().equals(list[2]))
			{
				
				removeLine(satir);
				model.removeRow(rownum);
				
			}
		
			rownum++;
					}
					tut.close();
					oku.close();
			

				}  catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(284, 7, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("<- Geri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiEkrani isim = new YoneticiEkrani();
				isim.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Righteous", Font.PLAIN, 13));
		btnNewButton_1.setBounds(383, 7, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		try {
			
			String[] list  ;
			String satir;
			
			FileReader oku = new FileReader("KULLANICILAR.txt");
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
