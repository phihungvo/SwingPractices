package buoi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtHoTen;
	private JTextField txtDienThoai;
	private JTextField txtHinhAnh;
	private JTextField txtChangeBgColor;
	private JList listThang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTable frame = new FrmTable();
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
	public FrmTable() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				DefaultListModel dlm = new DefaultListModel();
				for(int t = 1; t < 12; t++) {
					dlm.addElement("Tháng "+ t);
				}
				listThang.setModel(dlm);
			}
		});
		setTitle("Table");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(217, 10, 2, 2);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 30, 406, 139);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"sdfsdf", "uuu", "kuh"}
			},
			new String[] {
				"H\u1ECD t\u00EAn", "\u0110i\u1EC7n tho\u1EA1i", "H\u00ECnh \u1EA3nh"
			}
		));
		scrollPane_1.setColumnHeaderView(table);
		
		JLabel lblDienThoai = new JLabel("Điện thoại");
		lblDienThoai.setBounds(90, 204, 56, 21);
		contentPane.add(lblDienThoai);
		
		JLabel lblHoTen = new JLabel("Họ tên");
		lblHoTen.setBounds(90, 179, 56, 21);
		contentPane.add(lblHoTen);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(170, 180, 96, 19);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtDienThoai = new JTextField();
		txtDienThoai.setBounds(170, 205, 96, 19);
		contentPane.add(txtDienThoai);
		txtDienThoai.setColumns(10);
		
		JLabel lblHinhAnh = new JLabel("Hình ảnh");
		lblHinhAnh.setBounds(90, 238, 45, 13);
		contentPane.add(lblHinhAnh);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setBounds(170, 235, 96, 19);
		contentPane.add(txtHinhAnh);
		txtHinhAnh.setColumns(10);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(24, 283, 85, 21);
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ht, dt, ha;
				ht = txtHoTen.getText();
				dt = txtDienThoai.getText();
				ha = txtHinhAnh.getText();
				int ds = table.getSelectedRow();
				if(ds > -1) {
					table.setValueAt(ht,  ds,  0);
					table.setValueAt(dt, ds, 1);
					table.setValueAt(ha, ds, 2);
				}else {
					JOptionPane.showMessageDialog(null, "Hay chon mot dong de sua");
				}
			
			}
		});
		contentPane.add(btnSua);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(174, 283, 85, 21);
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ht, dt, ha;
				ht = txtHoTen.getText();
				dt = txtDienThoai.getText();
				ha = txtHinhAnh.getText();
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {ht, dt, ha});
			}
		});
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(295, 283, 85, 21);
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dx = table.getSelectedRow();
				if(dx == -1) {
					JOptionPane.showMessageDialog(rootPane, "Hay chon mot dong de xoa");
				}else {
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					dtm.removeRow(dx);
				}
				
			}
		});
		contentPane.add(btnXoa);
		
		txtChangeBgColor = new JTextField();
		txtChangeBgColor.setBounds(87, 354, 96, 19);
		contentPane.add(txtChangeBgColor);
		txtChangeBgColor.setColumns(10);
		
		JButton btnChangeTF = new JButton("Change text field");
		btnChangeTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (KeyEvent.VK_ENTER == e.getKeyCode()) {
					txtChangeBgColor.setText("Changed....");;
				}
			}
		});
		btnChangeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangeTF.setBounds(90, 406, 176, 21);
		contentPane.add(btnChangeTF);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(425, 204, 125, 139);
		contentPane.add(scrollPane_2);
	}
}
