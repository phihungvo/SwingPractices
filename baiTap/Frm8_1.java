package baiTap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Frm8_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm8_1 frame = new Frm8_1();
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
	public Frm8_1() {
		// Thiết lập JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo JButton
        btnShow = new JButton("Inner Class");
        btnShow.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnShow.setToolTipText("Bạn đang di chuyển chuột lên button này");
        	}
        });
//        btnShow.addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e) {
//                btnShow.setToolTipText("Bạn đang di chuyển chuột lên button này");
//            }
//        });
        
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Bạn vừa click vào button này!!!");
            }
        });
        btnShow.setBounds(77, 69, 253, 112);
        contentPane.add(btnShow);
    }
}
