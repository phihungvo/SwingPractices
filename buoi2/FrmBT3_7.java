package buoi2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmBT3_7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT3_7 frame = new FrmBT3_7();
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
	public FrmBT3_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(-14, 10, 0, 36);
		contentPane.add(label);
		
		JButton btnChooserColor = new JButton("Choose Color");
		btnChooserColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(null, "Hãy chọn một màu để xem!", Color.blue);
				btnChooserColor.setForeground(color);
				label.setOpaque(true);
				label.setBackground(color);
			}
		});
		
		btnChooserColor.setIcon(new ImageIcon(FrmBT3_7.class.getResource("/")));
		btnChooserColor.setBounds(125, 27, 142, 23);
		contentPane.add(btnChooserColor);
		
		btnChooserColor.setBounds(113, 18, 85, 21);
		contentPane.add(btnChooserColor);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HungVo\\OneDrive\\Máy tính\\Hình ảnh\\th.jfif"));
		lblNewLabel.setBounds(10, 10, 343, 243);
		contentPane.add(lblNewLabel);
	}

}
