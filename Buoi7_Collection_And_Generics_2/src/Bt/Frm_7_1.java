package Bt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Frm_7_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea tareaAfter;
	private JTextArea tareaBefore;
	private JComboBox comboBox;
	private Object[] arr;
	
	
//	private Object[] convertAnArr(Object[] arr) {
//		if(Integer.parseInt(arr[0].toString() == arr[0]) {
//			
//		}
//	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_7_1 frame = new Frm_7_1();
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
	public Frm_7_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loại mảng");
		lblNewLabel.setBounds(20, 28, 68, 22);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Chuỗi", "Số nguyên", "Số thực"}));
		comboBox.setBounds(98, 28, 226, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập mảng (mỗi phần tử cách nhau 1 khoảng trắng)");
		lblNewLabel_1.setBounds(20, 78, 304, 13);
		contentPane.add(lblNewLabel_1);
		
		tareaBefore = new JTextArea();
		tareaBefore.setBounds(20, 101, 309, 58);
		contentPane.add(tareaBefore);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mảng sau khi sắp xếp");
		lblNewLabel_1_1.setBounds(20, 201, 304, 13);
		contentPane.add(lblNewLabel_1_1);
		
		tareaAfter = new JTextArea();
		tareaAfter.setBounds(20, 224, 309, 58);
		contentPane.add(tareaAfter);
		
		JButton btnIncreaseSort = new JButton("Sắp xếp tăng");
		btnIncreaseSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedItem = comboBox.getSelectedIndex();
				
				String[] arr = tareaBefore.getText().split(" ");
				
				List list = new ArrayList<>();
				
				if(selectedItem==0){
					list.addAll(Arrays.asList(arr)); 
				}
				else if(selectedItem==1){
					 for(String i : arr){
						 list.add(Integer.parseInt(i));
					 }
				}else{
					 for(String i : arr){
						 list.add(Double.parseDouble(i));
					 }
				} 
				Collections.sort(list);
				tareaAfter.setText(list.toString());
			}
		});
		btnIncreaseSort.setBounds(113, 310, 123, 21);
		contentPane.add(btnIncreaseSort);
	}
}
