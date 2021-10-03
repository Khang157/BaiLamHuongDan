package TruongDinhKhang;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuaSoBMI extends Frame{
	JTextField txtA, txtB, txtC;
	JLabel lblA, lblB, lblC, lbl1, lbl2, lbl3, lbl4;
	JButton btn;
	public CuaSoBMI() {
		JFrame fl = new JFrame();  
		//Kích thước
		fl.setSize(500,300);
		fl.setLayout(new GridLayout(12,5));
		
		//Đưa các điều khiển vào frame
		
		
		lblA = new JLabel("Chiều cao(cm)", JLabel.CENTER);
		lblB = new JLabel("Cân nặng(kg)", JLabel.CENTER);
		lblC = new JLabel("Kết quả BMI", JLabel.CENTER);
		txtA = new JTextField();
		txtA.setHorizontalAlignment(JTextField.CENTER);
		txtB = new JTextField();
		txtB.setHorizontalAlignment(JTextField.CENTER);
		txtC = new JTextField();
		txtC.setHorizontalAlignment(JTextField.CENTER);
		btn = new JButton("Kiểm tra");
		lbl1 = new JLabel("BMI < 18.5 Bạn hơi gầy nên lưu ý ăn nhiều hơn !!",JLabel.CENTER);
		lbl2 = new JLabel("BMI < 25 Bạn có 1 cơ thế cân đối tiếp tục giữ vững phong độ nhé !!", JLabel.CENTER);
		lbl3 = new JLabel("BMI < 30 Cơ thể bạn đang trong giai đoạn tiền béo phi nên tập luyện thể dục nhé !!", JLabel.CENTER);
		lbl4 = new JLabel("BMI < 40 Bạn đang trong giai đoạn béo phì hãy tập luyện thể dục nhiều hơn!!", JLabel.CENTER);
		fl.add(lblA);fl.add(txtA);
		fl.add(lblB);fl.add(txtB);
		fl.add(btn);
		fl.add(lblC);fl.add(txtC);
		fl.add(lbl1);
		fl.add(lbl2);
		fl.add(lbl3);
		fl.add(lbl4);
		
		
		
		fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		fl.setLocationRelativeTo(null);
		fl.setTitle("Tính chỉ số BMI");
		fl.setVisible(true);  
		//Thêm bộ lăng nghe và xử lý sự kiện cho nút tính tổng
		btn.addActionListener(new BoLangNghe_XL_PhepTinh());	
		//Thêm bộ lắng nghe và xử lý sự kiện cho cửa sổ frame
		addWindowListener(new BoLangNghe_XL_CuaSo());
	}//
	//Viết lớp lắng nghe và xử lý ở ngoài hàm add ( mục đích để cho g�?n mã)
	class BoLangNghe_XL_PhepTinh implements ActionListener{			
			
				@Override
			public void actionPerformed(ActionEvent e) {
				//Lấy AB
				String strA = txtA.getText();
				String strB = txtB.getText();
				// đổi sang con số để tính toán
				double a = Double.parseDouble(strA);
				double b = Double.parseDouble(strB);
				//
				float c = (float) (b/(a*a/10000));
				txtC.setText(String.valueOf(c));	
			}
		};
			
	class BoLangNghe_XL_CuaSo implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
		System.exit(0);
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
			
		};
}
