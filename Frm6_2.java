package Bt6_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Frm6_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHSLuong;
	private JTextField txtChanges;
	private JTextField txtLuong;
	private JButton btnTinhLuong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm6_2 frame = new Frm6_2();
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
	public Frm6_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loại NV");
		lblNewLabel.setBounds(30, 34, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblHSLng = new JLabel("Hệ số lương");
		lblHSLng.setBounds(30, 94, 109, 13);
		contentPane.add(lblHSLng);
		
		JLabel lblChanges = new JLabel("Phụ cấp");
		lblChanges.setBounds(30, 151, 98, 13);
		contentPane.add(lblChanges);
		
		JLabel lblLng = new JLabel("Lương");
		lblLng.setBounds(30, 285, 45, 13);
		contentPane.add(lblLng);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedItem = comboBox.getSelectedIndex();
				lblChanges.setVisible(true);
				txtChanges.setVisible(true);
				lblLng.setBounds(30, 285, 45, 13);
				btnTinhLuong.setBounds(149, 217, 170, 21);
				txtLuong.setBounds(149, 281, 170, 21);
				
				switch (selectedItem) {
				case 0:
					lblChanges.setText("Phụ cấp");
					break;
				case 1:
					lblChanges.setText("Số dự án");
					break;
				case 2:
					lblChanges.setText("Số sản phẩm");
					break;
				case 3:
					lblChanges.setVisible(false);
					txtChanges.setVisible(false);
					btnTinhLuong.setBounds(149, 148, 170, 21);
					lblLng.setBounds(30, 221, 45, 13);
					txtLuong.setBounds(149, 217, 170, 21);
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + selectedItem);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hành chánh", "Kỹ thuật", "Kinh doanh", "Lãnh đạo"}));
		comboBox.setBounds(149, 30, 170, 21);
		contentPane.add(comboBox);
		
		txtHSLuong = new JTextField();
		txtHSLuong.setBounds(149, 91, 170, 21);
		contentPane.add(txtHSLuong);
		txtHSLuong.setColumns(10);
		
		txtChanges = new JTextField();
		txtChanges.setColumns(10);
		txtChanges.setBounds(149, 148, 170, 21);
		contentPane.add(txtChanges);
		
		txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(149, 281, 170, 21);
		contentPane.add(txtLuong);
		
		btnTinhLuong = new JButton("Tính Lương");
		btnTinhLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = comboBox.getSelectedIndex();
				int hsLuong = Integer.parseInt(txtHSLuong.getText());;
				double luong, input;
				
				//{"Hành chinh", "Kỹ thuật", "Kinh doanh", "Lãnh đạo"}));
				switch (selectedIndex) {
				case 0: 
					input = Double.parseDouble(txtChanges.getText());
					HanhChinh hanhChinh = new HanhChinh(hsLuong, input);
					luong = hanhChinh.tinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				case 1: 
					input = Integer.parseInt(txtChanges.getText());
					KyThuat kyThuat = new KyThuat(hsLuong, input);
					luong = kyThuat.tinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				case 2: 
					input = Integer.parseInt(txtChanges.getText());
					KinhDoanh kinhDoanh = new KinhDoanh(hsLuong, (int) input);
					luong = kinhDoanh.tinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				case 3: 
					LanhDao lanhDao = new LanhDao(hsLuong);
					luong = lanhDao.tinhLuong();
					txtLuong.setText(String.valueOf(luong));
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + selectedIndex);
				}
			}
		});
		btnTinhLuong.setBounds(149, 217, 170, 21);
		contentPane.add(btnTinhLuong);
	}

}











