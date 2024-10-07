package Frm9_3;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class Frm9_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTen;
	private List<LienHe> dslh;
	private JPanel panel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm9_4 frame = new Frm9_4();
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
	public Frm9_4() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Path p = Paths.get("dslh.bin");
				if(Files.exists(p)) {
					try(ObjectInputStream in = new ObjectInputStream(
							new BufferedInputStream(new FileInputStream("dslh.bin")))){
						dslh = (List<LienHe>) in.readObject();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				}else {
					dslh = new ArrayList<>();
				}
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ten");
		lblNewLabel.setBounds(10, 10, 93, 33);
		contentPane.add(lblNewLabel);
		
		txtTen = new JTextField();
		txtTen.setBounds(78, 17, 166, 24);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		JButton btnNewButton = new JButton("Tim");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtTen.getText();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.setRowCount(0);
				for(LienHe lh : dslh)
				{
					if(lh.getHoTen().contains(ten))
						dtm.addRow(new Object[] {lh.getHoTen(), lh.getDtdd(), lh.getHinh()});
				}
			}
		});
		btnNewButton.setBounds(285, 10, 93, 33);
		contentPane.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBounds(20, 53, 406, 200);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Hinh anh", "So dien thoai", "Ho ten"
			}
		));
		panel.add(table);
	}
}
