package Frm7_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class Frm7_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKey;
	private JTextField txtValue;
	private DefaultListModel dlm = new DefaultListModel();
	private Map map = new TreeMap();
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm7_3 frame = new Frm7_3();
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
	public Frm7_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Key");
		lblNewLabel.setBounds(10, 10, 54, 19);
		contentPane.add(lblNewLabel);
		
		txtKey = new JTextField();
		txtKey.setBounds(74, 10, 96, 19);
		contentPane.add(txtKey);
		txtKey.setColumns(10);
		
		txtValue = new JTextField();
		txtValue.setColumns(10);
		txtValue.setBounds(290, 10, 96, 19);
		contentPane.add(txtValue);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setBounds(226, 10, 54, 19);
		contentPane.add(lblValue);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = txtKey.getText();
				String value = txtValue.getText();
				map.put(key, value);
				
				int i = 0;
				for(Object o : map.keySet()) {
					Object value1 = new String(key.toString() + " : " + (String) map.get(key));
					dlm.add(i, value1);
					i++;
				}	
				list.setModel(dlm);
			}
		});
		btnNewButton.setBounds(85, 68, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.setBounds(226, 68, 85, 21);
		contentPane.add(btnContinue);
		
		list = new JList();
		list.setBounds(10, 118, 416, 135);
		contentPane.add(list);
	}

}
