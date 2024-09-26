package buoi1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChiSo;
	private JTextField txtGiaTri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmList frame = new FrmList();
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
	public FrmList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonAn = new JLabel("Các món ăn");
		lblMonAn.setBounds(31, 33, 90, 16);
		contentPane.add(lblMonAn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 66, 119, 129);
		contentPane.add(scrollPane);
		
		JList listMonAn = new JList();
		listMonAn.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cơm", "Bún", "Cháo", "Miến", "Hủ tiếu", "Phở", "Cà Phê", "Trà Đào", "Ngủ cốc", "Sương sáo"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listMonAn);
		
		JLabel lblChiSo = new JLabel("ChiSo");
		lblChiSo.setBounds(197, 68, 55, 16);
		contentPane.add(lblChiSo);
		
		JLabel lblGiaTri = new JLabel("Giá trị");
		lblGiaTri.setBounds(197, 142, 55, 16);
		contentPane.add(lblGiaTri);
		
		txtChiSo = new JTextField();
		txtChiSo.setBounds(254, 65, 116, 22);
		contentPane.add(txtChiSo);
		txtChiSo.setColumns(10);
		
		txtGiaTri = new JTextField();
		txtGiaTri.setColumns(10);
		txtGiaTri.setBounds(254, 139, 116, 22);
		contentPane.add(txtGiaTri);
		txtChiSo.setText("Chưa chọn");
		txtGiaTri.setText("Chưa chọn");
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int chiSo = -1; String giaTri = "";
				
				chiSo = listMonAn.getSelectedIndex();
				if(chiSo > -1)
					giaTri = listMonAn.getSelectedValue().toString();
		
				txtChiSo.setText(String.valueOf(chiSo));
				txtGiaTri.setText(giaTri);
				
			}
		});
		btnShow.setBounds(142, 251, 99, 25);
		contentPane.add(btnShow);
	}
}
