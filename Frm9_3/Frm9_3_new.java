package Frm9_3;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frm9_3_new extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHT;
	private JTextField txtDT;
	private JTextField txtHA;
	private List<LienHe> dslh;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm9_3_new frame = new Frm9_3_new();
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
	public Frm9_3_new() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Path p = Paths.get("dslh.bin");
				if(Files.exists(p)) {
					try(ObjectInputStream in = new ObjectInputStream(
							new FileInputStream("dslh.bin"))){
						
						dslh = (List<LienHe>) in.readObject();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
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
		
		JLabel lblNewLabel = new JLabel("Họ và tên");
		lblNewLabel.setBounds(21, 31, 110, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblDtdd = new JLabel("DTDD");
		lblDtdd.setBounds(21, 77, 73, 22);
		contentPane.add(lblDtdd);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh");
		lblHnhnh.setBounds(21, 122, 110, 22);
		contentPane.add(lblHnhnh);
		
		txtHT = new JTextField();
		txtHT.setBounds(81, 33, 144, 20);
		contentPane.add(txtHT);
		txtHT.setColumns(10);
		
		txtDT = new JTextField();
		txtDT.setColumns(10);
		txtDT.setBounds(81, 79, 144, 20);
		contentPane.add(txtDT);
		
		txtHA = new JTextField();
		txtHA.setColumns(10);
		txtHA.setBounds(81, 124, 144, 20);
		contentPane.add(txtHA);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(265, 31, 138, 113);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ht, dd, ha;
				ht = txtHT.getText();
				dd = txtDT.getText();
				ha = txtHA.getText();
				LienHe lh = new LienHe(ht, dd, ha);
				dslh.add(lh);
				
				try(ObjectOutputStream out = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream("dslh.bin")))){
					
					out.writeObject(dslh);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(108, 185, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser("C:\\Users\\HungVo\\eclipse\\Bai9_TapTin\\src\\HinhAnh");
				chooser.showOpenDialog(btnNewButton_1);
				String path = chooser.getSelectedFile().toString();
				ImageIcon icon = new ImageIcon(path);
				icon.setImage(icon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
				lblNewLabel_1.setIcon(icon);
				txtHA.setText(path);
			}
		});
		btnNewButton_1.setBounds(234, 123, 21, 21);
		contentPane.add(btnNewButton_1);
	}

}
