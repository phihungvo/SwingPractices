package Bt6_3;

import java.awt.EventQueue;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Comparator;

public class Frm4_5_1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtScore;
    private JTextField txtKeyWord;
    private JList<String> list;
    private String[][] ds = new String[0][0]; // Mảng lưu trữ danh sách tên và điểm

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Frm4_5_1 frame = new Frm4_5_1();
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
    public Frm4_5_1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 440, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(10, 11, 46, 14);
        contentPane.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(66, 8, 86, 20);
        contentPane.add(txtName);
        txtName.setColumns(10);

        JLabel lblScore = new JLabel("Score");
        lblScore.setBounds(162, 11, 46, 14);
        contentPane.add(lblScore);

        txtScore = new JTextField();
        txtScore.setBounds(218, 8, 86, 20);
        contentPane.add(txtScore);
        txtScore.setColumns(10);

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String score = txtScore.getText();
                if (name.isEmpty() || score.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Hay nhap du lieu day du");
                    return;
                }
                try {
                    float scoreValue = Float.parseFloat(score);
                    if (scoreValue < 0 || scoreValue > 10) {
                        JOptionPane.showMessageDialog(null, "Score must be between 0 and 10.Diem nhap tu 0 den 10");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Diem nhap khong hop le");
                    return;
                }
                
                ds = Arrays.copyOf(ds, ds.length + 1);
                ds[ds.length - 1] = new String[] { name, score };

                updateList();
            }
        });
        btnAdd.setBounds(314, 7, 102, 23);
        contentPane.add(btnAdd);

        JButton btnSortName = new JButton("SortName");
		btnSortName.setBounds(314, 43, 102, 57);
		contentPane.add(btnSortName);
		
        btnSortName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(ds, Comparator.comparing(o -> o[0]));
                updateList();
            }
        });
      
        JButton btnSortScore = new JButton("Sort Score");
        btnSortScore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(ds, Comparator.comparing(o -> Float.parseFloat(o[1])));
                updateList();
            }
        });
        btnSortScore.setBounds(314, 113, 102, 49);
		contentPane.add(btnSortScore);

        txtKeyWord = new JTextField();
        txtKeyWord.setBounds(314, 175, 102, 29);
        contentPane.add(txtKeyWord);
        txtKeyWord.setColumns(10);

        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String keyword = txtKeyWord.getText();
                if (keyword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Hay nhap tu khoa tim kiem");
                    return;
                }
                
                DefaultListModel<String> dlm = new DefaultListModel<>();
                for (String[] item : ds) {
                    if (item[0].contains(keyword) || item[1].equals(keyword)) {
                        dlm.addElement(item[0] + " " + item[1]);
                    }
                }

                list.setModel(dlm);
            }
        });
    	btnSearch.setBounds(314, 215, 102, 33);
        contentPane.add(btnSearch);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 36, 294, 161);
        contentPane.add(scrollPane);

        list = new JList<>();
        scrollPane.setViewportView(list);
    }

    private void updateList() {
        DefaultListModel<String> dlm = new DefaultListModel<>();
        for (String[] item : ds) {
            dlm.addElement(item[0] + " " + item[1]);
        }
        list.setModel(dlm);
    }
}
