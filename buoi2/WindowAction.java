package buoi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WindowAction extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowAction frame = new WindowAction();
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
	public WindowAction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		
		// Tạo content pane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); // Sử dụng layout tùy chỉnh
		setContentPane(contentPane);

		// Tạo danh sách các tháng
		String[] months = {
			"Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", 
			"Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", 
			"Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
		};
		JList<String> listMonths = new JList<>(months);

		
		WindowAction scrollPane = new WindowAction(listMonths);
		scrollPane.setBounds(10, 10, 150, 100); 
		contentPane.add(scrollPane); 
	}

}
