package TruongDinhKhang;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JComboBox;

public class CuaSoTong extends Frame{
	TextField txtA, txtB, txtKQ;
	Label lblA, lblB, lblBang;
	JComboBox btnpt;
	public CuaSoTong() {
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		//Kích thước
		setBounds(0, 0, 300, 70);
		//Đưa các điều khiển vào frame
		lblA = new Label("");
		lblB = new Label("");
		lblBang = new Label("=");
		txtA = new TextField();
		txtB = new TextField();
		txtKQ = new TextField();
		btnpt = new JComboBox();
		btnpt.addItem("+");
		btnpt.addItem("-");
		btnpt.addItem("*");
		btnpt.addItem("/");
		
		add(lblA); add(txtA);
		add(btnpt);		
		add(lblB); add(txtB);
		add(lblBang); add(txtKQ);					
			
		setTitle("Chương trình tính tổng 2 số");
		setVisible(true);
		//Thêm bộ lăng nghe và xử lý sự kiện cho nút tính tổng
		btnpt.addActionListener(new BoLangNghe_XL_PhepTinh());	
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
				int a = Integer.parseInt(strA);
				int b = Integer.parseInt(strB);
				//Phép tính
				String cong=String.valueOf(a+b);
				String tru=String.valueOf(a-b);
				String nhan=String.valueOf(a*b);
				String chia=String.valueOf(a/b);
				
				if(btnpt.getSelectedItem().equals("+"))
				{
					txtKQ.setText(cong);
				}
				if(btnpt.getSelectedItem().equals("-"))
				{
					txtKQ.setText(tru);
				}
				if(btnpt.getSelectedItem().equals("*"))
				{
					txtKQ.setText(nhan);
				}
				if(btnpt.getSelectedItem().equals("/"))
				{
					txtKQ.setText(chia);
				}
								
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
