package buoi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import demo.FrmComboBox;
import demo.SimpleSwingApp;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenu frame = new FrmMenu();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public FrmMenu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGioiThieu = new JMenu("GioiThieu");
		menuBar.add(mnGioiThieu);
		
		JMenuItem mntmChuong1 = new JMenuItem("Chuong 1");
		mntmChuong1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleSwingApp swa = new SimpleSwingApp();
				swa.setVisible(true);
			}
		});
		mnGioiThieu.add(mntmChuong1);
		
		JMenuItem mntmChuong2 = new JMenuItem("Chuong 2");
		mnGioiThieu.add(mntmChuong2);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnGioiThieu.add(mntmExit);
		
		JMenu mnBaiHoc = new JMenu("BaiHoc");
		menuBar.add(mnBaiHoc);
		
		JMenuItem mntmCheckBoxRadioButton = new JMenuItem("Checkbox-RadioButton");
		mntmCheckBoxRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCheckBox fcb = new FrmCheckBox();
				fcb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				fcb.setVisible(true); //Mở fcb
			}
		});
		mnBaiHoc.add(mntmCheckBoxRadioButton);
		
		JMenuItem mntmTable = new JMenuItem("Table");
		mntmTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmTable ftb = new FrmTable();
				ftb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				ftb.setVisible(true);
			}
		});
		mnBaiHoc.add(mntmTable);
		
		JMenuItem mntmList = new JMenuItem("List");
		mnBaiHoc.add(mntmList);
		
		JMenuItem mntmComboBox = new JMenuItem("Combo Box");
		mntmComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmComboBox fcb = new FrmComboBox();
				fcb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				fcb.setVisible(true);
			}
		});
		mnBaiHoc.add(mntmComboBox);
		
		JMenu mnLienHe = new JMenu("Lien He");
		menuBar.add(mnLienHe);
		
		JMenuItem mntmDienThoai = new JMenuItem("DienThoai");
		mnLienHe.add(mntmDienThoai);
		
		JMenuItem mntmEmail = new JMenuItem("Email");
		mnLienHe.add(mntmEmail);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
