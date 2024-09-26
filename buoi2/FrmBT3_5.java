package buoi2;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmBT3_5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT3_5 frame = new FrmBT3_5();
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
	public FrmBT3_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnImage1 = new JButton("New button");
		btnImage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = (ImageIcon) btnImage1.getIcon();
				icon.setImage(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
				lblNewLabel.setIcon(icon);
			}
		});
		ImageIcon icon = new ImageIcon("C:\\Users\\HungVo\\OneDrive\\Máy tính\\Hình ảnh\\BT_WEEK2\\Ve-Sizuka-buoc-13.jpg");

		// Set the button's size explicitly before scaling the image
		btnImage1.setBounds(10, 11, 89, 77); // Set bounds before scaling
		icon.setImage(icon.getImage().getScaledInstance(89, 77, Image.SCALE_DEFAULT));

		btnImage1.setIcon(icon);
		contentPane.add(btnImage1);

		
		JButton btnImage2 = new JButton("New button");
		btnImage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = (ImageIcon) btnImage2.getIcon();
				icon.setImage(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
				lblNewLabel.setIcon(icon);
			}
		});
		ImageIcon icon2 = new ImageIcon("C:\\Users\\HungVo\\OneDrive\\Máy tính\\Hình ảnh\\BT_WEEK2\\OIP.jfif");
		btnImage2.setIcon(icon2);
		icon2.setImage(icon2.getImage().getScaledInstance(89, 77, Image.SCALE_DEFAULT));
		btnImage2.setBounds(10, 99, 89, 79);
		contentPane.add(btnImage2);
		
		JButton btnImage3 = new JButton("New button");
		btnImage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = (ImageIcon) btnImage3.getIcon();
				icon.setImage(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
				lblNewLabel.setIcon(icon);
			}
		});
		btnImage3.setIcon(new ImageIcon("C:\\Users\\HungVo\\OneDrive\\Máy tính\\Hình ảnh\\BT_WEEK2\\5d9c7821b3733a9f009cddf2797933e4.jpg"));
		btnImage3.setBounds(10, 189, 89, 77);
		contentPane.add(btnImage3);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(168, 38, 238, 207);
		contentPane.add(lblNewLabel);
	}
}
