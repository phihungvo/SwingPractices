package Frm7_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Frm7_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDogs;
	private JTextField txtCats;
	private JButton btnTipTc;
	private JList jlist = new JList();
	private PetManager<Dog> managerDog= new PetManager<Dog>();
	private PetManager<Cat> managerCat= new PetManager<Cat>();
	private DefaultListModel dlm = new DefaultListModel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm7_4 frame = new Frm7_4();
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
	public Frm7_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Các bạn Dog được nhập về");
		lblNewLabel.setBounds(10, 24, 261, 26);
		contentPane.add(lblNewLabel);
		
		txtDogs = new JTextField();
		txtDogs.setBounds(206, 25, 268, 26);
		contentPane.add(txtDogs);
		txtDogs.setColumns(10);
		
		JLabel lblCcBnCat = new JLabel("Các bạn Cat được nhập về");
		lblCcBnCat.setBounds(10, 73, 261, 26);
		contentPane.add(lblCcBnCat);
		
		txtCats = new JTextField();
		txtCats.setColumns(10);
		txtCats.setBounds(206, 74, 268, 26);
		contentPane.add(txtCats);
		
		JButton btnNewButton = new JButton("Thêm mới");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dogs = txtDogs.getText();
				String cats = txtCats.getText();
				List<Dog> listDog = managerDog.getPets();
				List<Cat> listCat = managerCat.getPets();
				
				String[] dogName = dogs.split(",");
				String[] catName = cats.split(",");
				
				for(String dName : dogName)
					listDog.add(new Dog(dName));
					
				for(String cName : catName)
					listCat.add(new Cat(cName));
				
				if(!listDog.isEmpty() && managerDog.getPets() != null)
					for(int i = 0; i < listDog.size(); i++)
						dlm.addElement(listDog.get(i));
				
				if(!listCat.isEmpty() && listCat != null)
					for(int i = 0; i < listCat.size(); i++)
						dlm.addElement(listCat.get(i));
				
				jlist.setModel(dlm);
				
				
			}
		});
		btnNewButton.setBounds(87, 123, 132, 26);
		contentPane.add(btnNewButton);
		
		btnTipTc = new JButton("Tiếp tục");
		btnTipTc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDogs.setText("");
				txtCats.setText("");
			}
		});
		btnTipTc.setBounds(255, 123, 132, 26);
		contentPane.add(btnTipTc);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 471, 171);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(jlist);
	}
}
