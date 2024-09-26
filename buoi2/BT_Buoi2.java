package buoi2;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BT_Buoi2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoTenIn;
	private JTextField txtSdtIn;
	private JTextField textFieldImagePath;
	private JLabel labelImage;
	private JLabel lblName_1;
	private JLabel lblPhone_1;
	private JLabel lblImage_1;
	private JTextField txtHoTenOut;
	private JTextField txtSdtOut;
	private JLabel labelImageOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT_Buoi2 frame = new BT_Buoi2();
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
	public BT_Buoi2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setSize(420, 300);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 341);
		
		// Tạo content pane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Nhãn cho Họ và Tên
		JLabel lblName = new JLabel("Họ và Tên:");
		lblName.setBounds(10, 10, 80, 20);
		contentPane.add(lblName);
		
		// TextField cho Họ và Tên
		txtHoTenIn = new JTextField();
		txtHoTenIn.setBounds(100, 10, 150, 20);
		contentPane.add(txtHoTenIn);
		txtHoTenIn.setColumns(10);
		
		// Nhãn cho Số điện thoại
		JLabel lblPhone = new JLabel("Số điện thoại:");
		lblPhone.setBounds(10, 40, 80, 20);
		contentPane.add(lblPhone);
		
		// TextField cho Số điện thoại
		txtSdtIn = new JTextField();
		txtSdtIn.setBounds(100, 40, 150, 20);
		contentPane.add(txtSdtIn);
		txtSdtIn.setColumns(10);
		
		// Nhãn cho Đường dẫn ảnh
		JLabel lblImage = new JLabel("Đường dẫn ảnh:");
		lblImage.setBounds(10, 70, 100, 20);
		contentPane.add(lblImage);
		
		// TextField cho Đường dẫn ảnh
		textFieldImagePath = new JTextField();
		textFieldImagePath.setBounds(100, 70, 150, 20);
		contentPane.add(textFieldImagePath);
		textFieldImagePath.setColumns(10);
		
		// Nhãn để hiển thị ảnh
		labelImage = new JLabel("");
		labelImage.setBounds(319, 10, 92, 80);
		contentPane.add(labelImage);
		
		JButton btnShowInfo = new JButton("Hiển thị");
		btnShowInfo.setBounds(117, 111, 100, 30);
		contentPane.add(btnShowInfo);
		
		lblName_1 = new JLabel("Họ và Tên:");
		lblName_1.setBounds(10, 202, 80, 20);
		contentPane.add(lblName_1);
		
		lblPhone_1 = new JLabel("Số điện thoại:");
		lblPhone_1.setBounds(10, 234, 80, 20);
		contentPane.add(lblPhone_1);
		
		lblImage_1 = new JLabel("Đường dẫn ảnh:");
		lblImage_1.setBounds(10, 264, 100, 20);
		contentPane.add(lblImage_1);
		
		txtHoTenOut = new JTextField();
		txtHoTenOut.setColumns(10);
		txtHoTenOut.setBounds(100, 203, 150, 20);
		contentPane.add(txtHoTenOut);
		
		txtSdtOut = new JTextField();
		txtSdtOut.setColumns(10);
		txtSdtOut.setBounds(100, 235, 150, 20);
		contentPane.add(txtSdtOut);
		
		labelImageOut = new JLabel("");
		labelImageOut.setBounds(100, 268, 92, 80);
		contentPane.add(labelImageOut);
		
		
		btnShowInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtHoTenIn.getText();
				String phone = txtSdtIn.getText();
				String imagePath = textFieldImagePath.getText();
				
				txtHoTenOut.setText(name);
				txtSdtOut.setText(phone);
				ImageIcon icon = new ImageIcon(imagePath);
				icon.setImage(icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_DEFAULT));
				labelImageOut.setIcon(icon);
				
				setSize(350, 340);
			}
		});
	}
}
