package baiTap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm8_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMauSac;
	private JTextField txtTenQua;
	private JTextField txtTrongLuong;
	private JTextField txtHinhDang;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm8_2 frame = new Frm8_2();
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
	public Frm8_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin hộp quà");
		lblNewLabel.setBounds(10, 10, 179, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hình dáng hộp quà");
		lblNewLabel_1.setBounds(31, 39, 129, 19);
		contentPane.add(lblNewLabel_1);
		
		txtHinhDang = new JTextField();
		txtHinhDang.setBounds(186, 39, 190, 19);
		contentPane.add(txtHinhDang);
		txtHinhDang.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Màu sắc");
		lblNewLabel_2.setBounds(31, 83, 88, 19);
		contentPane.add(lblNewLabel_2);
		
		txtMauSac = new JTextField();
		txtMauSac.setColumns(10);
		txtMauSac.setBounds(186, 83, 190, 19);
		contentPane.add(txtMauSac);
		
		JLabel lblNewLabel_3 = new JLabel("Thông tin quà");
		lblNewLabel_3.setBounds(31, 127, 88, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tên quà");
		lblNewLabel_4.setBounds(31, 162, 66, 19);
		contentPane.add(lblNewLabel_4);
		
		txtTenQua = new JTextField();
		txtTenQua.setColumns(10);
		txtTenQua.setBounds(186, 162, 190, 19);
		contentPane.add(txtTenQua);
		
		txtTrongLuong = new JTextField();
		txtTrongLuong.setColumns(10);
		txtTrongLuong.setBounds(186, 202, 190, 19);
		contentPane.add(txtTrongLuong);
		
		JLabel lblNewLabel_4_1 = new JLabel("Trọng lượng");
		lblNewLabel_4_1.setBounds(31, 205, 103, 19);
		contentPane.add(lblNewLabel_4_1);
		
		JButton btnNewButton = new JButton("Gửi quà");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiftBox gb = new GiftBox(txtHinhDang.getText(), txtMauSac.getText());
				
				GiftBox.Gift gift = gb.new Gift(txtTenQua.getText(), Double.parseDouble(txtTrongLuong.getText()));
				
				String thongTin = "Hộp quà: ";
				thongTin += "Có hình: "+ gb.hinhDang + "\nvà giấy bao màu: "+ gb.mauSac +
						",\nphí làm hộp " + String.valueOf(gb.phiLamHop) + "\n";
				
				thongTin += "Tiền gửi quà: " + gift.tinhTienGui();
				
				textArea.setText(thongTin);
			}
		});
		btnNewButton.setBounds(186, 261, 190, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Thông tin gửi quà");
		lblNewLabel_5.setBounds(31, 306, 103, 44);
		contentPane.add(lblNewLabel_5);
		
		textArea = new JTextArea();
		textArea.setBounds(189, 316, 187, 113);
		contentPane.add(textArea);
	}
}
