package thucHanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmChao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLoiChao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmChao frame = new FrmChao();
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
	public FrmChao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Xuất lời chào");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showConfirmDialog(btnNewButton, "Lời chào");
//			}
//		});
		
		XuLyChao2 xuLyChao2 = new XuLyChao2();
		xuLyChao2.setLc(txtLoiChao);
		
		XuLyChao xuLyChao = new XuLyChao();
		btnNewButton.addActionListener(xuLyChao);
		
		btnNewButton.setBounds(124, 159, 155, 40);
		contentPane.add(btnNewButton);
		
		txtLoiChao = new JTextField();
		txtLoiChao.setBounds(34, 47, 366, 20);
		contentPane.add(txtLoiChao);
		txtLoiChao.setColumns(10);
		
	}
	
	
	// Lop long cap chinh quy
	class XuLyChao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Lời chào");
		}
		
	}
	
}
