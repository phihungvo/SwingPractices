package Bt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Frm7_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWord;
	private JTextField txtMeaning;
	private JTextField txtWordSearch;
	private JTextField txtMeaningSearch;
	private List<Dictionary> listDic = new ArrayList<>();
	private DefaultListModel dlm;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm7_2 frame = new Frm7_2();
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
	public Frm7_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(23, 10, 383, 226);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Show  - Insert Word", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word");
		lblNewLabel.setBounds(10, 12, 43, 13);
		panel.add(lblNewLabel);
		
		txtWord = new JTextField();
		txtWord.setBounds(56, 9, 73, 19);
		panel.add(txtWord);
		txtWord.setColumns(10);
		
		JLabel lblMeaning = new JLabel("Meaning");
		lblMeaning.setBounds(139, 12, 51, 13);
		panel.add(lblMeaning);
		
		txtMeaning = new JTextField();
		txtMeaning.setBounds(200, 9, 73, 19);
		txtMeaning.setColumns(10);
		panel.add(txtMeaning);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(283, 8, 74, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String word, meaning;
				
				word = txtWord.getText();
				meaning = txtMeaning.getText();
				
				Dictionary dictionary = new Dictionary(word, meaning);
				listDic.add(dictionary);
				
				dlm = new DefaultListModel<>();
				for(Dictionary dic : listDic)
					dlm.addElement(dic.toString());
				
				list.setModel(dlm);
			}
		});
		panel.add(btnNewButton);
		
		list = new JList();
		list.setBounds(22, 63, 335, 126);
		panel.add(list);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Word");
		lblNewLabel_1.setBounds(10, 25, 68, 26);
		panel_1.add(lblNewLabel_1);
		
		txtWordSearch = new JTextField();
		txtWordSearch.setBounds(96, 29, 96, 19);
		panel_1.add(txtWordSearch);
		txtWordSearch.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String keyWord = txtWordSearch.getText();
				
				for(Dictionary dic : listDic)
					if(dic.getWord().equals(keyWord))
						txtMeaningSearch.setText(dic.getMeaning());
					else
						JOptionPane.showMessageDialog(rootPane, "Sory, can't find dictionary with this word");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\HinhAnh\\HinhAnh\\search.jpg"));
		btnNewButton_1.setBounds(225, 28, 28, 21);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Meaning");
		lblNewLabel_1_1.setBounds(10, 89, 68, 26);
		panel_1.add(lblNewLabel_1_1);
		
		txtMeaningSearch = new JTextField();
		txtMeaningSearch.setColumns(10);
		txtMeaningSearch.setBounds(96, 93, 96, 19);
		panel_1.add(txtMeaningSearch);
	}
}
