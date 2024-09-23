package Bt6_2;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class FrmTinhLuong extends JFrame {

    private JPanel contentPane;
    private JTextField txtHeSo, txtPhuCap, txtSoDuAn, txtSoSanPham;
    private JLabel lblInput1, lblInput2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmTinhLuong frame = new FrmTinhLuong();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FrmTinhLuong() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblLoaiNhanVien = new JLabel("Chọn loại nhân viên:");
        lblLoaiNhanVien.setBounds(10, 10, 150, 20);
        contentPane.add(lblLoaiNhanVien);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {
            "Nhân viên Hành Chánh", 
            "Nhân viên Kỹ Thuật", 
            "Nhân viên Kinh Doanh", 
            "Nhân viên Lãnh Đạo"}));
        comboBox.setBounds(160, 10, 200, 20);
        contentPane.add(comboBox);

        JLabel lblHeSo = new JLabel("Hệ số lương:");
        lblHeSo.setBounds(10, 50, 150, 20);
        contentPane.add(lblHeSo);

        txtHeSo = new JTextField();
        txtHeSo.setBounds(160, 50, 200, 20);
        contentPane.add(txtHeSo);

        lblInput1 = new JLabel("Phụ cấp:");
        lblInput1.setBounds(10, 90, 150, 20);
        contentPane.add(lblInput1);

        txtPhuCap = new JTextField();
        txtPhuCap.setBounds(160, 90, 200, 20);
        contentPane.add(txtPhuCap);

        lblInput2 = new JLabel("");
        lblInput2.setBounds(10, 130, 150, 20);
        contentPane.add(lblInput2);

        txtSoSanPham = new JTextField();
        txtSoSanPham.setBounds(160, 130, 200, 20);
        contentPane.add(txtSoSanPham);

        JButton btnTinhLuong = new JButton("Tính lương");
        btnTinhLuong.setBounds(160, 170, 200, 30);
        contentPane.add(btnTinhLuong);

        JLabel lblResult = new JLabel("");
        lblResult.setBounds(160, 210, 200, 30);
        contentPane.add(lblResult);

        // ActionListener to update UI components based on selected item
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = comboBox.getSelectedItem().toString();
                
                // Reset input fields visibility
                txtPhuCap.setVisible(false);
                txtSoSanPham.setVisible(false);

                switch (selectedItem) {
                    case "Nhân viên Hành Chánh":
                        lblInput1.setText("Phụ cấp:");
                        lblInput1.setVisible(true);
                        txtPhuCap.setVisible(true);
                        lblInput2.setVisible(false);
                        break;

                    case "Nhân viên Kỹ Thuật":
                        lblInput1.setText("Số dự án hoàn thành:");
                        lblInput1.setVisible(true);
                        txtSoSanPham.setVisible(true);
                        lblInput2.setVisible(false);
                        break;

                    case "Nhân viên Kinh Doanh":
                        lblInput1.setText("Số sản phẩm bán được:");
                        lblInput1.setVisible(true);
                        txtSoSanPham.setVisible(true);
                        lblInput2.setVisible(false);
                        break;

                    case "Nhân viên Lãnh Đạo":
                        lblInput1.setVisible(false);
                        txtPhuCap.setVisible(false);
                        lblInput2.setVisible(false);
                        break;

                    default:
                        break;
                }
            }
        });

        btnTinhLuong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double heSo = Double.parseDouble(txtHeSo.getText());
                double luong = 0;

                String selectedItem = comboBox.getSelectedItem().toString();
                
                if (selectedItem.equals("Nhân viên Hành Chánh")) {
                    double phuCap = Double.parseDouble(txtPhuCap.getText());
                    HanhChanh hc = new HanhChanh(heSo, phuCap);
                    luong = hc.tinhLuong();
                } else if (selectedItem.equals("Nhân viên Kỹ Thuật")) {
                    int soDuAn = Integer.parseInt(txtSoSanPham.getText());
                    KyThuat kt = new KyThuat(heSo, soDuAn);
                    luong = kt.tinhLuong();
                } else if (selectedItem.equals("Nhân viên Kinh Doanh")) {
                    int soSanPham = Integer.parseInt(txtSoSanPham.getText());
                    KinhDoanh kd = new KinhDoanh(heSo, soSanPham);
                    luong = kd.tinhLuong();
                } else if (selectedItem.equals("Nhân viên Lãnh Đạo")) {
                    LanhDao ld = new LanhDao(heSo);
                    luong = ld.tinhLuong();
                }

                lblResult.setText("Lương: " + luong);
            }
        });
    }
}
