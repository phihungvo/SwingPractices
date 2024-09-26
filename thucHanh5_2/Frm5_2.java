package thucHanh5_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Frm5_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMaCD;
	private JTextField txtTenCD;
	private JTextField soBaiHat;
	private JTextField txtCaSi;
	private JTextField txtSoBaiHat;
	private JTextField txtGiaThanh;
	private float tong;
	private String chuoiCD = "", total = "";
	private JList jList = new JList();
	private List<String> cdList = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm5_2 frame = new Frm5_2();
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
	public Frm5_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaCD = new JLabel("Ma CD");
		lblMaCD.setBounds(8, 21, 66, 11);
		contentPane.add(lblMaCD);
		
		JLabel lblTenCd = new JLabel("Ten CD");
		lblTenCd.setBounds(183, 21, 66, 11);
		contentPane.add(lblTenCd);
		
		JLabel lblCaSi = new JLabel("Ca si");
		lblCaSi.setBounds(8, 62, 66, 11);
		contentPane.add(lblCaSi);
		
		JLabel lblSoBaiHat = new JLabel("So bai hat");
		lblSoBaiHat.setBounds(136, 62, 80, 11);
		contentPane.add(lblSoBaiHat);
		
		JLabel lblGiaThanh = new JLabel("Gia thanh");
		lblGiaThanh.setBounds(257, 62, 66, 11);
		contentPane.add(lblGiaThanh);
		
		txtMaCD = new JTextField();
		txtMaCD.setBounds(87, 18, 66, 17);
		contentPane.add(txtMaCD);
		txtMaCD.setColumns(10);
		
		txtTenCD = new JTextField();
		txtTenCD.setColumns(10);
		txtTenCD.setBounds(257, 18, 154, 17);
		contentPane.add(txtTenCD);
		
		txtCaSi = new JTextField();
		txtCaSi.setColumns(10);
		txtCaSi.setBounds(62, 59, 66, 17);
		contentPane.add(txtCaSi);
		
		txtSoBaiHat = new JTextField();
		txtSoBaiHat.setColumns(10);
		txtSoBaiHat.setBounds(212, 59, 37, 17);
		contentPane.add(txtSoBaiHat);
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setColumns(10);
		txtGiaThanh.setBounds(327, 59, 84, 17);
		contentPane.add(txtGiaThanh);
		
		JButton btnThemMoi = new JButton("Them moi");
		btnThemMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int maCD, soBaiHat;
				String tenCD, caSi;
				Float giaThanh, tongGiaThanh;
				
				maCD = Integer.parseInt(txtMaCD.getText());
				tenCD = txtTenCD.getText();
				caSi = txtCaSi.getText();
				soBaiHat = Integer.parseInt(txtSoBaiHat.getText());
				giaThanh = Float.parseFloat(txtGiaThanh.getText());
				
				CD cd = new CD(maCD, tenCD, caSi, soBaiHat, giaThanh);
				chuoiCD = cd.getMaCD() + " - " + cd.getTenCD() + " - " + cd.getTenCaSi() + " - " + 
						cd.getSoBaiHat() + " - " + cd.getGiaThanh();
				
				DefaultListModel dlm = new DefaultListModel();
				cdList.add(chuoiCD);				
				
				tong +=  cd.getGiaThanh(); 
				total = Float.valueOf(tong).toString();
				//textField.setText(chuoiCD + "\n Tổng giá thành = " + tong );
				cdList.addLast("Tong gia thanh = "+total);
				for(String cdItem : cdList) {
					dlm.addElement(cdItem);
				}
				
				jList.setModel(dlm);
				
			}
		});
		btnThemMoi.setBounds(88, 101, 104, 19);
		contentPane.add(btnThemMoi);
		
		JButton btnTiepTuc = new JButton("Tiep tuc");
		btnTiepTuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaCD.setText(null);
				txtTenCD.setText(null);
				txtCaSi.setText(null);
				txtSoBaiHat.setText(null);
				txtGiaThanh.setText(null);
			}
		});
		btnTiepTuc.setBounds(264, 101, 115, 19);
		contentPane.add(btnTiepTuc);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 139, 420, 116);
		contentPane.add(scrollPane);
		
		scrollPane.setViewportView(jList);
	}
}
