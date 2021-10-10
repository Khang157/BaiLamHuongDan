package TruongDinhKhang;

import javax.swing.*;

import java.awt.*;

public class thuchanh {
	public static void main(String[] args) {
		JFrame f = new JFrame("Chương trình tính");
		f.setBounds(0,0,400,300);
		f.setVisible(true);
		//Đưa điều khiển vào
		Container vungtrinhbay = f.getContentPane();
		
		vungtrinhbay.setLayout(new FlowLayout());
		vungtrinhbay.add(new JButton("OK"));
		vungtrinhbay.add(new JButton("Cancel"));
	}
}
