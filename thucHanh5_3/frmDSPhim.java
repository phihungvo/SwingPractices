package thucHanh5_3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class frmDSPhim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenPhim;
	private JTextField txtTheLoai;
	private JTextField txtNgayChieu;
	private JTextField txtTenRap;
	private JLabel lblHinhAnh = new JLabel();;
	public static Phim[] phim = new Phim[5];
	public int flag = 0;

	/**
	 * Launch the application.
	 */
	private void btnNextActionPerformed(ActionEvent evt) {
		if(flag < phim.length - 1) {
			flag++;
			txtTenPhim.setText(phim[flag].getTenPhim());
			txtTenRap.setText(phim[flag].getRap());
			txtNgayChieu.setText(phim[flag].getNgayChieu());
			txtTheLoai.setText(phim[flag].getTheLoai());
			
			lblHinhAnh.setIcon(new
					ImageIcon(phim[flag].getDuongDanHinh()));
		}else {
			JOptionPane.showMessageDialog(rootPane, "Đã hết phim, vui lòng nhấn <= để xem các phim phía trước!");
		}
	}
	
	private void btnBackActionPerformed(ActionEvent evt) {
		if(flag == 0) {
			JOptionPane.showMessageDialog(rootPane, "Đây là phim đầu tiên, vui lòng nhấn => để xem các phim phía sau!");
		}else {
			flag--;
			txtTenPhim.setText(phim[flag].getTenPhim());
			txtTenRap.setText(phim[flag].getRap());
			txtNgayChieu.setText(phim[flag].getNgayChieu());
			txtTheLoai.setText(phim[flag].getTheLoai());
			
			lblHinhAnh.setIcon(new
					javax.swing.ImageIcon(phim[flag].getDuongDanHinh()));
		}
	}
	
	
	
	public static void main(String[] args) {
		Phim p1 = new Phim("Biệt đội chim cánh cụt", "Hoạt hình", "25/12/2024",
				"Cinema Hòa Bình", "D:\\HinhAnh\\HinhAnh\\bietdoichimcanhcut.jpg");
		Phim p2 = new Phim("Big Heros 6", "Hoạt hình", "10/01/2015", "Galaxy Nguyễn Du", 
				"D:/HinhAnh/HinhAnh/bighero6.jpg");
		Phim p3 = new Phim("Chàng trai năm ấy", "Tình cảm", "15/01/2015", "CineBox Lý Chính Thắng",
				"D:\\HinhAnh\\HinhAnh\\changtrainamay.jpg");
		Phim p4 = new Phim("Cuộc chiến chống Pharaon", "Giả sử", "20/01/2015", "Galaxy Nguyễn Trãi",
				"D:\\HinhAnh\\HinhAnh\\cuocchienchongpharaon.jpg");
		Phim p5 = new Phim("Để mai tính", "Hài", "25/01/2015", "Galaxy Quang Trung", 
				"D:\\HinhAnh\\HinhAnh\\demaitinh.jpg");

		phim = new Phim[] {p1, p2, p3, p4, p5};
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDSPhim frame = new frmDSPhim();
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
	public frmDSPhim() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHinhAnh.setIcon(new javax.swing.ImageIcon(phim[0].getDuongDanHinh()));
		lblHinhAnh.setBounds(61, 28, 162, 198);
		contentPane.add(lblHinhAnh);
		
		txtTenPhim = new JTextField();
		txtTenPhim.setBounds(250, 28, 143, 24);
		contentPane.add(txtTenPhim);
		txtTenPhim.setColumns(10);
		
		txtTheLoai = new JTextField();
		txtTheLoai.setColumns(10);
		txtTheLoai.setBounds(250, 89, 143, 24);
		contentPane.add(txtTheLoai);
		
		txtNgayChieu = new JTextField();
		txtNgayChieu.setColumns(10);
		txtNgayChieu.setBounds(250, 152, 143, 24);
		contentPane.add(txtNgayChieu);
		
		txtTenRap = new JTextField();
		txtTenRap.setColumns(10);
		txtTenRap.setBounds(250, 216, 143, 24);
		contentPane.add(txtTenRap);
		
		txtTenPhim.setBackground(Color.yellow);
		txtTenPhim.setText(phim[0].getTenPhim());
		
		txtTenRap.setBackground(Color.pink);
		txtTenRap.setText(phim[0].getRap());
		
		
		txtNgayChieu.setBackground(Color.green);
		txtNgayChieu.setText(phim[0].getNgayChieu());
		
		txtTheLoai.setBackground(Color.orange);
		txtTheLoai.setText(phim[0].getTheLoai());
		
		
		JButton btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon("D:\\HinhAnh\\HinhAnh\\next-icon.png"));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNextActionPerformed(e);
				//flag = (flag+1 < phim.length - 1 ? flag++ : phim.length - 1);
			}
		});
		btnNext.setBounds(445, 118, 53, 33);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon("D:\\HinhAnh\\HinhAnh\\previous-icon.png"));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackActionPerformed(e);
			}
			
		});
		btnBack.setBounds(10, 118, 53, 33);
		contentPane.add(btnBack);
	}
}
