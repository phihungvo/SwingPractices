package Bt6_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Frm6_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMaSach;
	private JTextField txtNgayNhap;
	private JTextField txtDonGia;
	private JTextField txtTenSach;
	private JTextField txtNXB;
	private JTextField txtSoLuong;
	private JTextField txtThue;
	private JTextField txtTongThanhTien;
	private JToggleButton tglbtnSchGioKhoa;
	private JScrollPane spSTK;
	private JLabel lblNewLabel_4;
	private JTextField txtDGTB;
	private SachGiaoKhoa[] arrSGK = new SachGiaoKhoa[0];
	private SachThamKhao[] arrSTK = new SachThamKhao[0];
	private SachGiaoKhoa sgk;
	private SachThamKhao stk;
	private DefaultListModel<Object> dlm;
	private JList lsSTK;
	private JList lsSGK;
	private JScrollPane spSGK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm6_3 frame = new Frm6_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void tongThanhTienMethod(Object[] arr) {
		double tong = 0;
		if(arr == arrSGK) {
			for(int i = 0; i < arrSGK.length; i++) {
				tong += arrSGK[i].tinhThanhTien();
			}
		}if(arr == arrSTK) {
			for(int i = 0; i < arrSTK.length; i++) {
				tong += arrSTK[i].tinhThanhTien();
			}
		}
		txtTongThanhTien.setText(String.valueOf(tong));
	}
	
	private void updateList(JList list, Object[] arr) {
	    dlm = new DefaultListModel<>();
	    for(Object obj : arr) {
	        dlm.addElement(obj.toString());
	    }
	    list.setModel(dlm);
	}


	/**
	 * Create the frame.
	 */
	public Frm6_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin chung");
		lblNewLabel.setBounds(12, 13, 145, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã sách");
		lblNewLabel_1.setBounds(12, 60, 55, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày nhập");
		lblNewLabel_1_1.setBounds(12, 103, 89, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Đơn giá");
		lblNewLabel_1_2.setBounds(12, 142, 55, 16);
		contentPane.add(lblNewLabel_1_2);
		
		txtMaSach = new JTextField();
		txtMaSach.setBounds(113, 54, 116, 22);
		contentPane.add(txtMaSach);
		txtMaSach.setColumns(10);
		
		txtNgayNhap = new JTextField();
		txtNgayNhap.setColumns(10);
		txtNgayNhap.setBounds(113, 97, 116, 22);
		contentPane.add(txtNgayNhap);
		
		txtDonGia = new JTextField();
		txtDonGia.setColumns(10);
		txtDonGia.setBounds(113, 136, 116, 22);
		contentPane.add(txtDonGia);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tên sách");
		lblNewLabel_1_3.setBounds(328, 60, 55, 16);
		contentPane.add(lblNewLabel_1_3);
		
		txtTenSach = new JTextField();
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(420, 54, 145, 22);
		contentPane.add(txtTenSach);
		
		txtNXB = new JTextField();
		txtNXB.setColumns(10);
		txtNXB.setBounds(420, 97, 145, 22);
		contentPane.add(txtNXB);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NXB");
		lblNewLabel_1_1_1.setBounds(328, 103, 89, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Số lượng");
		lblNewLabel_1_2_1.setBounds(328, 142, 55, 16);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(420, 136, 145, 22);
		contentPane.add(txtSoLuong);
		
		JRadioButton rdbtnSGK = new JRadioButton("Sách giáo khoa");
		rdbtnSGK.setBounds(141, 180, 123, 25);
		contentPane.add(rdbtnSGK);
		
		JRadioButton rdbtnSTK = new JRadioButton("Sách tham khảo");
		rdbtnSTK.setBounds(314, 180, 123, 25);
		contentPane.add(rdbtnSTK);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSGK);
		bg.add(rdbtnSTK);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Tình trạng");
		lblNewLabel_1_2_2.setBounds(44, 235, 89, 16);
		contentPane.add(lblNewLabel_1_2_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mới", "Cũ"}));
		comboBox.setBounds(141, 231, 75, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Thuế (1-100)");
		lblNewLabel_2.setBounds(279, 235, 89, 16);
		contentPane.add(lblNewLabel_2);
		
		txtThue = new JTextField();
		txtThue.setBounds(385, 232, 116, 22);
		contentPane.add(txtThue);
		txtThue.setColumns(10);
		
		
		
		JButton btnNhapSach = new JButton("Nhập sách");
		btnNhapSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int maSach, soLuong, thue;
				String tenSach, NXB;
				Date ngayNhap;
				double donGia;
				boolean tinhTrang;
				
				maSach = Integer.parseInt(txtMaSach.getText());
				tenSach = txtTenSach.getText();
				ngayNhap = new Date();
				NXB = txtNXB.getText();
				donGia = Double.parseDouble(txtDonGia.getText());
				soLuong = Integer.parseInt(txtSoLuong.getText());
				tinhTrang = (comboBox.getSelectedIndex() == 0 ? true : false);
				thue = Integer.parseInt(txtThue.getText());
				
				if(rdbtnSGK.isSelected()) {
				  sgk = new SachGiaoKhoa(maSach, tenSach, ngayNhap,
							NXB, donGia, soLuong, tinhTrang);
				  
				   arrSGK = Arrays.copyOf(arrSGK, arrSGK.length + 1);
				   arrSGK[arrSGK.length - 1] = sgk;
				  
				   updateList(lsSGK, arrSGK);
				   
				   tongThanhTienMethod(arrSGK);
				}
				
				
				if(rdbtnSTK.isSelected()) {
					stk = new SachThamKhao(maSach, tenSach, ngayNhap,
							NXB, donGia, soLuong, thue);
					
					arrSTK = Arrays.copyOf(arrSTK, arrSTK.length + 1);
					arrSTK[arrSTK.length - 1] = stk;
					  
					updateList(lsSTK, arrSTK);
					   
					tongThanhTienMethod(arrSTK);
				}
			}
		});
		btnNhapSach.setBounds(172, 286, 99, 25);
		contentPane.add(btnNhapSach);
		
		JButton btnTiepTuc = new JButton("Tiếp tục");
		btnTiepTuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaSach.setText("");
				txtTenSach.setText("");
				txtNXB.setText("");
				txtDonGia.setText("");
				txtSoLuong.setText("");
				txtThue.setText("");
			
			}
		});
		btnTiepTuc.setBounds(338, 286, 99, 25);
		contentPane.add(btnTiepTuc);
		
		JLabel lblNewLabel_3 = new JLabel("Tổng thành tiền");
		lblNewLabel_3.setBounds(25, 417, 99, 16);
		contentPane.add(lblNewLabel_3);
		
		txtTongThanhTien = new JTextField();
		txtTongThanhTien.setBounds(125, 414, 116, 22);
		contentPane.add(txtTongThanhTien);
		txtTongThanhTien.setColumns(10);
		
		spSTK = new JScrollPane();
		spSTK.setVisible(false);
		spSTK.setBounds(40, 446, 525, 163);
		contentPane.add(spSTK);
		
		lsSTK = new JList();
		spSTK.setViewportView(lsSTK);
		
		tglbtnSchGioKhoa = new JToggleButton("Sách giáo khoa");
		tglbtnSchGioKhoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnSchGioKhoa.isSelected())
					lblNewLabel_4.setVisible(false);
					txtDGTB.setVisible(false);
					spSGK.setVisible(true);
					spSTK.setVisible(false);
			}
		});
		tglbtnSchGioKhoa.setBounds(139, 354, 137, 25);
		contentPane.add(tglbtnSchGioKhoa);
		
		lblNewLabel_4 = new JLabel("Đơn gia trung bình");
		lblNewLabel_4.setBounds(253, 417, 138, 16);
		lblNewLabel_4.setVisible(false);
		contentPane.add(lblNewLabel_4);
		
		txtDGTB = new JTextField();
		txtDGTB.setBounds(398, 414, 116, 22);
		txtDGTB.setVisible(false);
		contentPane.add(txtDGTB);
		txtDGTB.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("Sách tham khảo");
		tglbtnNewToggleButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton_1_1.isSelected())
					lblNewLabel_4.setVisible(true);
					txtDGTB.setVisible(true);
					spSGK.setVisible(false);
					spSTK.setVisible(true);
			}
		});
		tglbtnNewToggleButton_1_1.setBounds(280, 354, 137, 25);
		contentPane.add(tglbtnNewToggleButton_1_1);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(tglbtnSchGioKhoa);
		bg2.add(tglbtnNewToggleButton_1_1);
		
		spSGK = new JScrollPane();
		spSGK.setBounds(29, 457, 525, 163);
		contentPane.add(spSGK);
		
		lsSGK = new JList();
		spSGK.setViewportView(lsSGK);
	}
}
