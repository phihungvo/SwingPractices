package buoi1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class FrmXemHinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSrc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmXemHinh frame = new FrmXemHinh();
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
	public FrmXemHinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHinh = new JLabel("New label");
		lblHinh.setIcon(new ImageIcon("C:\\Users\\HungVo\\OneDrive\\Máy tính\\Hình ảnh\\anhdaidien.jpg"));
		lblHinh.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblHinh.setBounds(102, 23, 220, 136);
		contentPane.add(lblHinh);
		
		JLabel lblNewLabel_1 = new JLabel("Tập tin");
		lblNewLabel_1.setBounds(27, 196, 55, 16);
		contentPane.add(lblNewLabel_1);
		
		txtSrc = new JTextField();
		txtSrc.setBounds(105, 193, 220, 22);
		contentPane.add(txtSrc);
		txtSrc.setColumns(10);
		
		JButton btnSeePic = new JButton("Xem hình");
		btnSeePic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tt = txtSrc.getText();
				ImageIcon icon = new ImageIcon(tt);
				//C:\Users\HungVo\OneDrive\Máy tính\Hình ảnh\th.jfif
				icon.setImage(icon.getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_DEFAULT));
				lblHinh.setIcon(icon);
			}
		});
		btnSeePic.setBounds(161, 228, 99, 25);
		contentPane.add(btnSeePic);
		
		JButton btnChonFile = new JButton("...");
		btnChonFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser("C:\\Users\\HungVo\\OneDrive\\Máy tính\\Hình ảnh\\Saved Pictures");
				jfc.setDialogTitle("Hãy chọn 1 tập tin hình ảnh");
				jfc.setFileFilter(new FileNameExtensionFilter("Các tập tin *.jpg", "jpg"));
				jfc.setFileFilter(new FileNameExtensionFilter("Các tập tin *.png", "png"));
				int chon = jfc.showOpenDialog(rootPane);
				
				if(chon == JFileChooser.APPROVE_OPTION) {
					File file = jfc.getSelectedFile();
					txtSrc.setText(file.getAbsolutePath());
				}
			}
		});
		btnChonFile.setBounds(334, 192, 25, 25);
		contentPane.add(btnChonFile);
	}
}
