package thucHanh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class XuLyChao2 implements ActionListener {

	private JTextField lc;
	
	
	public JTextField getLc() {
		return lc;
	}


	public void setLc(JTextField lc) {
		this.lc = lc;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lc.setText("Chao mung ban den voi lop long cap vo danh");
	}

}
