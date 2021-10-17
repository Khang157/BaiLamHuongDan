package TruongDinhKhang;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Chuongtrinh {
 // khai báo
	private ArrayList<String> nameList = new ArrayList<String>(0);
	private JFrame frame;
	private JTextField txtNhap;
	private JTextField txtTim;
	private JTextArea txtShow;
	private JLabel lblState;
	private JTextArea txtShow_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chuongtrinh window = new Chuongtrinh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Chuongtrinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNhap = new JLabel("Nh\u1EADp t\u00EAn v\u00E0o danh s\u00E1ch");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhap.setBounds(10, 37, 157, 21);
		frame.getContentPane().add(lblNhap);
		
		JLabel lblTim = new JLabel("Nh\u1EADp t\u00EAn t\u00ECm ki\u1EBFm");
		lblTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTim.setBounds(10, 106, 117, 21);
		frame.getContentPane().add(lblTim);
		
		txtNhap = new JTextField();
		txtNhap.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblState.setText("Đang đợi");
			}
		});
		
		
		txtNhap.setBounds(172, 37, 296, 21);
		frame.getContentPane().add(txtNhap);
		txtNhap.setColumns(10);
		
		txtTim = new JTextField();
		txtTim.setBounds(172, 106, 296, 21);
		frame.getContentPane().add(txtTim);
		txtTim.setColumns(10);
		
		JButton btnNhap = new JButton("Th\u00EAm");
		btnNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addList(nameList);
				showList(nameList);
				
			}
		});
		btnNhap.setBounds(488, 37, 89, 21);
		frame.getContentPane().add(btnNhap);
		
		JButton btnTim = new JButton("T\u00ECm ki\u1EBFm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x ="Không tìm thấy";		
				for(int i = 0; i< nameList.size(); i++) {
					if(nameList.get(i).equals(txtTim.getText()))
						x = "SP của bạn là: "+ String.valueOf(i+1);
					  showList(nameList);
				}
				JFrame s = new JFrame("EEE");
				JOptionPane.showMessageDialog(s, x,"Tìm kiếm",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTim.setBounds(488, 106, 89, 21);
		frame.getContentPane().add(btnTim);
		
		txtShow = new JTextArea();
		txtShow.setBounds(20, 212, 296, 211);
		frame.getContentPane().add(txtShow);
		
		lblState = new JLabel("");
		lblState.setForeground(new Color(147, 112, 219));
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblState.setBounds(172, 69, 296, 14);
		frame.getContentPane().add(lblState);
		
		txtShow_1 = new JTextArea();
		txtShow_1.setBounds(395, 212, 296, 211);
		frame.getContentPane().add(txtShow_1);
	}
	void addList(ArrayList<String> a) {
		String name = txtNhap.getText();
		a.add(name);
		txtNhap.setText("");
		lblState.setText("Đã nhập xong");
	
	}
	void showList (ArrayList<String> a) {
		txtShow.setText("");
		for(int i=0;i<a.size();i++)
		{
			txtShow.append("\n"+ a.get(i));
		}
	}


}