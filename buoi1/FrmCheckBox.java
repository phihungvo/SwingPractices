package buoi1;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FrmCheckBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCheckBox frame = new FrmCheckBox();
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
	public FrmCheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlSoThich = new JPanel();
		pnlSoThich.setBorder(new TitledBorder(null, "C\u00E1c s\u1EDF th\u00EDch", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		pnlSoThich.setBounds(53, 39, 112, 137);
		contentPane.add(pnlSoThich);
		pnlSoThich.setLayout(null);
		
		JRadioButton rdbtnNgheNhac = new JRadioButton("Nghe nhạc");
		rdbtnNgheNhac.setBounds(8, 28, 85, 25);
		pnlSoThich.add(rdbtnNgheNhac);
		
		JRadioButton rdbtnXemPhim = new JRadioButton("Xem phim");
		rdbtnXemPhim.setBounds(8, 65, 123, 25);
		pnlSoThich.add(rdbtnXemPhim);
		
		JRadioButton rdbtnDaBong = new JRadioButton("Đá bóng");
		rdbtnDaBong.setBounds(8, 98, 123, 25);
		pnlSoThich.add(rdbtnDaBong);
		
		JPanel pnlMau = new JPanel();
		pnlMau.setBorder(new TitledBorder(null, "M\u00E0u th\u00EDch nh\u1EA5t", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlMau.setBounds(213, 39, 119, 161);
		contentPane.add(pnlMau);
		pnlMau.setLayout(null);
		
		JCheckBox chckbxDo = new JCheckBox("Màu đỏ");
		chckbxDo.setBounds(8, 31, 111, 25);
		pnlMau.add(chckbxDo);
		
		JCheckBox chckbxTrang = new JCheckBox("Màu trắng");
		chckbxTrang.setBounds(8, 61, 111, 25);
		pnlMau.add(chckbxTrang);
		
		JCheckBox chckbxXanh = new JCheckBox("Màu xanh");
		chckbxXanh.setBounds(8, 91, 111, 25);
		pnlMau.add(chckbxXanh);
		
		JCheckBox chckbxDen = new JCheckBox("Màu đen");
		chckbxDen.setBounds(8, 121, 111, 25);
		pnlMau.add(chckbxDen);
		
		JButton btnChon = new JButton("Chọn");
		btnChon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String ketQua = txtKetQua.getText();
				String soThich = "", mauThichNhat = "";
				
				for (Component com : pnlSoThich.getComponents()) {
					JRadioButton jrb = (JRadioButton) com;
					if(jrb.isSelected())
						soThich += jrb.getText() + ", ";
				}
				for(Component com : pnlMau.getComponents()){
					JCheckBox jcb = (JCheckBox) com;
					if(jcb.isSelected()) {
						mauThichNhat += jcb.getText() + ", ";;
					}
					
				}
				
				JOptionPane.showMessageDialog(rootPane, "Các sở thích là: " + soThich + "\n"
						+ "Các màu thích nhất là: "+ mauThichNhat);
				
			}
		});
		btnChon.setBounds(140, 273, 99, 25);
		contentPane.add(btnChon);
		
		txtKetQua = new JTextField();
		txtKetQua.setText("Kết quả: ");
		txtKetQua.setBounds(66, 233, 116, 22);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}
}
