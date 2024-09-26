package buoi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmBT3_6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSeat;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT3_6 frame = new FrmBT3_6();
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
	public FrmBT3_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeat = new JLabel("Seat (S)");
		lblSeat.setBounds(27, 39, 46, 14);
		contentPane.add(lblSeat);
		
		txtSeat = new JTextField();
		txtSeat.setBounds(103, 36, 86, 20);
		contentPane.add(txtSeat);
		txtSeat.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(27, 80, 46, 14);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(103, 77, 131, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblMovie = new JLabel("Moives");
		lblMovie.setBounds(27, 119, 46, 14);
		contentPane.add(lblMovie);
		
		JComboBox cbbMovie = new JComboBox();
		cbbMovie.setBounds(103, 115, 131, 82);
		contentPane.add(cbbMovie);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, "Booking");
			}
		});
		btnBook.setBounds(103, 229, 89, 23);
		contentPane.add(btnBook);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(113, 138, 62, 37);
		contentPane.add(lblNewLabel);
	}
}
